package biblioteca;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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

    public void buscarLibro() {
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a buscar:");
        
        Libro libro = buscarPorIsbn(isbn);
        
        if (libro != null) {
            JOptionPane.showMessageDialog(null, "LIBRO ENCONTRADO:\n" + libro);
        } else {
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
        }
    }

    public void devolverLibro() {
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a devolver:");
        
        Libro libro = buscarPorIsbn(isbn);
        
        if (libro != null) {
            JOptionPane.showMessageDialog(null, "Libro devuelto:\n" + libro);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el libro con ISBN: " + isbn);
        }
    }
}