package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private List<Libro> prestamos;

    public Usuario(int cedula, String nombre, String apellido, String direccion, int telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.prestamos = new ArrayList<>();
    }

    public int getCedula() { return cedula; }   
    public String getNombre() { return nombre; }
    public String getApelidos() { return apellido; }
    public String getDireccion() { return direccion; }
    public int getTelefono() { return telefono; }
    
    public List<Libro> getPrestamos() { return prestamos; }

    @Override
    public String toString() {
        return "Cedula: " + cedula + " | Usuario: " + nombre + " apellidos " + apellido+ " Direccion "
        + direccion + " Telefono " + telefono + " | Libros: " + prestamos.size();
    }
}

