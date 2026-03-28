package biblioteca;

public class Libro {
    private String isbn;
    private String titulo;

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
    }

    // Getters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }

    @Override
    public String toString() {
        return "ISBN: " + isbn + " | Título: " + titulo;
    }
}