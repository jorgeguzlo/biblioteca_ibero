package biblioteca;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GestionLibros {

    private List<Libro> listaLibros = new ArrayList<>();

    // Agregar libro
    public void agregar() {
        String codigo = JOptionPane.showInputDialog("Ingresa el código del libro: ");
        String titulo = JOptionPane.showInputDialog("Ingresa el título del libro: ");
        String autor = JOptionPane.showInputDialog("Ingresa el autor del libro: ");
        int paginas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de páginas: "));
        short edicion = Short.parseShort(JOptionPane.showInputDialog("Ingresa el año de edición: "));

        Libro elementoLibro = new Libro(codigo, titulo, autor, paginas, edicion);
        listaLibros.add(elementoLibro);

        JOptionPane.showMessageDialog(null, "Libro agregado correctamente");
    }

    // Mostrar todos los libros
    public void mostrarTodo() {
        if (listaLibros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay libros registrados.");
            return;
        }

        String texto = "=== LISTA DE LIBROS ===\n";

        int contador = 1;

        for (Libro l : listaLibros) {

            texto += "Libro " + contador + ": "
                    + "Código: " + l.getCodigo() + " | "
                    + "Título: " + l.getTitulo() + " | "
                    + "Autor: " + l.getAutor() + " | "
                    + "Páginas: " + l.getPaginas() + " | "
                    + "Año: " + l.getEdicion() + " |\n";

            contador++;

        }
        JOptionPane.showMessageDialog(null, texto);
    }

    // Eliminar libro
    public void eliminar(String codigo) {
        boolean eliminado = listaLibros.removeIf(l -> l.getCodigo().equals(codigo));

        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Libro eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el libro");
        }
    }

    // Buscar libro
    public Libro buscarPorCodigo(String codigo) {
        return listaLibros.stream()
                .filter(l -> l.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }
}
