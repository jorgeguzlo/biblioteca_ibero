package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class GestionLibros {
    private List<Libro> listaLibros = new ArrayList<>();

    public void agregar(String isbn, String titulo) {
        listaLibros.add(new Libro(isbn, titulo));
    }

    public void mostrarTodo() {
        if (listaLibros.isEmpty()) System.out.println("No hay libros.");
        listaLibros.forEach(System.out::println);
    }

    public void eliminar(String isbn) {
        listaLibros.removeIf(l -> l.getIsbn().equals(isbn));
    }

    public Libro buscarPorIsbn(String isbn) {
        return listaLibros.stream()
                .filter(l -> l.getIsbn().equals(isbn))
                .findFirst().orElse(null);
    }
}