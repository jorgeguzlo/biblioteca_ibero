package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionUsuarios {
    private List<Usuario> listaUsuarios = new ArrayList<>();

    public void registrar(int cedulas, String nombres, String apellidos,
        String direcciones, int telefonos) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese cedula del usuario: ");
        int cedula = entrada.nextInt();
       
        System.out.println("Ingrese nombres del usuario: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese apellidos del usuario: ");
        String apellido = entrada.nextLine();
        
        System.out.println("Ingrese direccion del usuario: ");
        String direccion = entrada.nextLine();
        
        System.out.println("Ingrese numero telefonico del usuario: ");
        int telefono = entrada.nextInt();
        
        int tipoUsuario=0;
        do{
            try{
                System.out.println("seleccione el tipo de usuario");
                System.out.println("1. Estudiante");
                System.out.println("2. Maestro");
                System.out.println("3. Particular");
                System.out.println("Digite la opcion");
                tipoUsuario = entrada.nextInt();
                if (tipoUsuario < 1 || tipoUsuario > 3){
                    System.out.println("Usuario no valido ingrese un dato de 1 a 3");
                }else{
                    System.out.println("el usuario seleccionado es: "+tipoUsuario);
                }
            }catch(Exception e){
                System.out.println("Ingrese un numero de 1 a 3");
                entrada.next();
            }
        }while(tipoUsuario < 1 || tipoUsuario > 3);
        
        System.out.println("usuario: "+tipoUsuario);
        System.out.println("nombres: "+nombre); 
        System.out.println("apellidos: "+apellido); 
        System.out.println("Direccion: "+direccion);
        System.out.println("Telefono: "+telefono);
        
        
        listaUsuarios.add(new Usuario(cedula, nombre, apellido, direccion, telefono));
    
    }

    public void mostrarTodos() {
        listaUsuarios.forEach(System.out::println);
        System.out.println("estoy  al pelo");
             
        
    }

    public void eliminar(int cedula) {
        listaUsuarios.removeIf(u -> u.getCedula() == cedula);
    }

    public Usuario buscarPorId(int cedula) {
        return listaUsuarios.stream()
                .filter(u -> u.getCedula() == cedula)
                .findFirst().orElse(null);
    }
}
