package practicapoo1biblioteca;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fecha;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.fecha = LocalDate.now();
        this.usuario = usuario;
        this.libro = libro;
    }

        public LocalDate getFecha() {
            return fecha;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public Libro getLibro() {
            return libro;
        }
}