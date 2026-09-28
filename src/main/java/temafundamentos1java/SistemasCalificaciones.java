
package temafundamentos1java;

public class SistemasCalificaciones {
  private static final int NOTA_EX = 90;
  private static final int NOTA_BAJA = 70;
  
  
    public static String calcularCalificacion(int nota){
         String calificacion;
        if (nota >= NOTA_EX){
        calificacion = "Excelente";
        }else if (nota >= NOTA_BAJA){
        calificacion = "Casi quemao";
        }else{
        calificacion = "quemado";
        }
        return calificacion;
   }  
    public static void main (String[]frost){
        int nota = 90;
        String resultado = calcularCalificacion(nota);
        System.out.println("tu nota es" + nota + resultado);
    }
}
