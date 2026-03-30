package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    private String codigo;
    private String titulo;
    private String autor;
    private int paginas;
    private short edicion;

    public Libro(String codigo, String titulo, String autor, int paginas, short edicion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.edicion = edicion;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }
    
    public int getEdicion() {
        return edicion;
    }
    
    @Override

    public String toString() {
        return "Codigo: " + codigo + " | Título: " + titulo + " | Autor: " + " | Número de paginas: " + paginas + " | Año de edición: " + edicion;
    }
}
