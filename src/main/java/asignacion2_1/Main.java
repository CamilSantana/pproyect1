package asignacion2_1;

public class Main {
    public static void main(String[] args) {
// instancias
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();

        tv1.marca = " Samsung ";
        tv1.pulgadas = 55;
        tv1.volumen = 20;

        tv2.marca = " LG ";
        tv2.pulgadas = 43;
        tv2.volumen = 15;

        tv3.marca = " Sony ";
        tv3.pulgadas = 65;
        tv3.volumen = 30;

       
        System.out.println("  ======================================");
        System.out.println("   Tv 1 - " + tv1.marca + " " + tv1.pulgadas + "\"");
        System.out.println("  ======================================");
        tv1.encender();
        tv1.subirVolumen();
        tv1.bajarVolumen();
        tv1.apagar();
        System.out.println();

        System.out.println("  ======================================");
        System.out.println("   TV 2 - " + tv2.marca + " " + tv2.pulgadas + "\"");
        System.out.println("  ======================================");
        tv2.encender();
        tv2.subirVolumen();
        tv2.bajarVolumen();
        tv2.apagar();
        System.out.println();

        System.out.println("  ======================================");
        System.out.println("   TV 3 - " + tv3.marca + " " + tv3.pulgadas + "\"");
        System.out.println("  ======================================");
        tv3.encender();
        tv3.subirVolumen();
        tv3.bajarVolumen();
        tv3.apagar();
    }
}