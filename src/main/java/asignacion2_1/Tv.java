package asignacion2_1;

public class Tv {
    String marca;
    int pulgadas;
    boolean encendido;
    int volumen;
//metodos, creo que cada uno describe lo que hace
    public void encender() {
        encendido = true;
        dibujarTv(" La Tv se esta encendiendo... ", "");
    }

    public void apagar() {
        encendido = false;
        dibujarTv(" La Tv se esta apagando... ", "");
    }

    public void subirVolumen() {
        volumen++;
        dibujarTv(" Subiendo el volumen... ", " Volumen: " + volumen);
    }

    public void bajarVolumen() {
        volumen--;
        dibujarTv(" Bajando el volumen...", " Volumen: " + volumen);
    }

    private void dibujarTv(String linea1, String linea2) {
        String l1 = String.format("%-30s", linea1);  
        String l2 = String.format("%-30s", linea2);

        System.out.println("       \\   /");
        System.out.println("        \\ /");
        System.out.println("  +------------------------------------+");
        System.out.println("  | +--------------------------------+ |");
        System.out.println("  | | " + l1 + " | |");
        System.out.println("  | | " + l2 + " | |");
        System.out.println("  | +--------------------------------+ |");
        System.out.println("  +------------------------------------+");
        System.out.println("        _/            \\_");
    }
}