package biblioteca;
 
import javax.swing.JOptionPane;
 
public class Biblioteca {
 
    public static void main(String[] args) {
 
        GestionUsuarios usuario = new GestionUsuarios();
        GestionLibros libro = new GestionLibros();
 
        int opcion = -1;
 
        while (opcion != 0) {
 
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "==== ¡Bienvenid@ a la biblioteca Ibero! ====\n"
                        + "Seleccione un número:\n"
                        + "1. Gestión de Usuario\n"
                        + "2. Gestión de libros\n"
                        + "3. Gestión de préstamos de libros\n"
                        + "4. Ver lista de libros\n"
                        + "0. Salir"
                ));
 
                switch (opcion) {
 
                    case 1:
                        JOptionPane.showMessageDialog(null, "Gestión de usuarios");
                        usuario.mostrarTodos();
                        break;
 
                    case 2:
                        JOptionPane.showMessageDialog(null, "Gestión de libros");
                        libro.agregar();
                        break;
 
                    case 3:
                        JOptionPane.showMessageDialog(null, "Gestión de préstamos de libros");
                        break;
 
                    case 4:
                        libro.mostrarTodo();
                        break;
 
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                        break;
 
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida, intenta de nuevo");
                        break;
                }
 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número válido");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            }
        }
    }
}