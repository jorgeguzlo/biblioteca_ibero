package biblioteca;

import java.util.Scanner;
import javax.swing.JOptionPane;
import biblioteca.GestionUsuarios;
import biblioteca.GestionLibros;

        
public class Biblioteca {

    public static void main(String[] args) {
        System.out.println("====¡Bienvenid@ a la biblioteca Ibero!====");
            Scanner entrada = new Scanner(System.in);
            GestionUsuarios usuario = new GestionUsuarios();
            int opcion = -1;
            while (opcion!=0) {
                System.out.println("1. Gestion de Usuario");
                System.out.println("2. Gestion de libros libros");
                System.out.println("3. Gestión de prestamos de libros");
                System.out.println("0. Salir");
                try {
                    
                    System.out.print("Seleccione una opcion: ");
                    opcion = entrada.nextInt();
                    entrada.nextLine();

                    switch (opcion) {
                        case 1:
                            System.out.println("Gestión de usuarios");
                            usuario.mostrarTodos();// CREAR, BUSCAR, ELIMINAR
                            
                            break;
                        case 2: 
                            System.out.println("Gestión de libros");
                            // CREAR, BUSCAR, ELIMINAR5555555
                            break;
                        case 3: 
                            System.out.println("Gestión de prestamos de libros");
                            // OBTENER LIBRO, HISTORIAL, DEVOLUVIONES
                            break;
                        case 0:                      
                            if (opcion==0){
                            System.out.println("Saliendo del sistema...");
                            }else{
                            System.out.println("digite 0 para salir");
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
            
            
                } catch (Exception e) {
                    System.out.println("Opcion invalida, por favor intente nuevamente");
                    entrada.next();
                }
        }
        
    }
    
}
