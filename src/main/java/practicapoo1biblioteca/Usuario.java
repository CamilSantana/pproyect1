package practicapoo1biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int id;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

        public String getNombre() {
            return nombre;
        }

        public Prestamo prestarLibro(Libro libro) {
            if (libro.getDisponibilidad()) {
                librosPrestados.add(libro);
                libro.setDisponibilidad(false);
                return new Prestamo(this, libro);
            } else {
                System.out.println("El libro requerido no esta disponible");
                return null;
            }
        }

        public void devolverLibro(Libro libro) {
            if (librosPrestados.contains(libro)) {
                librosPrestados.remove(libro);
                libro.setDisponibilidad(true);
                System.out.println("Libro devuelto");
            } else {
                System.out.println("Este usuario no tiene ese libro prestado");
            }
        }
}                          