package biblioteca;

import java.util.Scanner;
import javax.swing.JOptionPane;
import biblioteca.GestionUsuarios;
import biblioteca.GestionLibros;

public class Biblioteca {

    public static void main(String[] args) {
        System.out.println("====¡Bienvenid@ a la biblioteca Ibero!====");
        showTable ventana = new showTable();

        // Ejemplo 1: Mostrar Libros
        String[] colsLibros = {"ISBN", "Título", "Autor"};
        Object[][] datosLibros = {
            {"123-ABC", "El Quijote", "Cervantes"},
            {"456-DEF", "Cien Años de Soledad", "García Márquez"}
        };

        // Ejemplo 2: Mostrar Usuarios (Si quisieras reusarla)
        String[] colsUsuarios = {"User ID", "Nombre"};
        Object[][] datosUsuarios = {
            {"001", "Juan Pérez"},
            {"002", "María López"}
        };

        // Llamamos al método con los datos que queramos en ese momento
        ventana.showDataTable(colsLibros, datosLibros);

    }

}
