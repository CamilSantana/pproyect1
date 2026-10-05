package practicapoo1biblioteca;

public class Main {
    public static void main(String[] frost) {
        Usuario u1 = new Usuario(" Frost ", 1);
        Libro l1 = new Libro(" Noches blancas ", " Fiódor Dostoievski ", " 978-8416440047 ", true);

        Prestamo p1 = u1.prestarLibro(l1);

        if (p1 != null) {
            System.out.println(" Prestamo registrado el " + p1.getFecha());
        }
    }
}