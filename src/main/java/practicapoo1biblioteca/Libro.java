package practicapoo1biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = disponible;
    }

        public String getTitulo() {
            return titulo;
        }

        public boolean getDisponibilidad() {
            return disponible;
        }

        public void setDisponibilidad(boolean disponible) {
            this.disponible = disponible;
        }

        public void consultarDisponibilidad() {
            if (disponible) {
                System.out.println(titulo + " esta disponible");
            } else {
                System.out.println(titulo + " no esta disponible");
            }
    }
}