package practicapoo1biblioteca;

public class Main {
    public static void main(String[] frost) {
//instacias        
        Usuario u1 = new Usuario("Frost", 1);
        Libro l1 = new Libro("Noches blancas", "Fiodor Dostoievski", "978-8416440047", true);
//llamando metodos
        l1.consultarDisponibilidad();

        Prestamo p1 = u1.prestarLibro(l1);

        if (p1 != null) {
            System.out.println("Prestamo registrado el " + p1.getFecha());
            System.out.println("Usuario: " + p1.getUsuario().getNombre());
            System.out.println("Libro: " + p1.getLibro().getTitulo());
        }

        l1.consultarDisponibilidad();

        u1.prestarLibro(l1);

        u1.devolverLibro(l1);
        u1.devolverLibro(l1);

        l1.consultarDisponibilidad();

        l1.setDisponibilidad(false);
        System.out.println("Disponible: " + l1.getDisponibilidad());
    }
}