package asignacion2_1;

public class Main {
    public static void main(String[] args) {
// instancias
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();

        tv1.setMarca("Samsung");
        tv1.setPulgadas(55);
        tv1.setVolumen(20);

        tv2.setMarca("LG");
        tv2.setPulgadas(43);
        tv2.setVolumen(15);

        tv3.setMarca("Sony");
        tv3.setPulgadas(65);
        tv3.setVolumen(30);

        System.out.println("  ======================================");
        System.out.println("   Tv 1 - " + tv1.getMarca() + " " + tv1.getPulgadas() + "\"");
        System.out.println("  ======================================");
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();
        System.out.println();

        System.out.println("  ======================================");
        System.out.println("   TV 2 - " + tv2.getMarca() + " " + tv2.getPulgadas() + "\"");
        System.out.println("  ======================================");
        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();
        System.out.println();

        System.out.println("  ======================================");
        System.out.println("   TV 3 - " + tv3.getMarca() + " " + tv3.getPulgadas() + "\"");
        System.out.println("  ======================================");
        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
    }
}