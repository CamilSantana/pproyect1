
package asignacion3_1;

public class Automovil {
    private String modelo;
    private String marca;
    private String color;
    private int anio;
    
        public Automovil(){
        }
    
            public Automovil(String modelo, String marca, String color, int anio){
                this.modelo = modelo;
                this.marca = marca;
                this.color = color;
                this.anio = anio;
            }
    
            
        public String getMarca(){
            return marca;
        }    
            
        public String getModelo(){
            return modelo;
        }     
            
        public String getColor(){
            return color;
        }  
        
        public int getAnio(){
            return anio;
        }     
        
         public void setMarca(String marca){
            this.marca = marca;
        }    
        
         public void setModelo(String modelo){
            this.modelo = modelo;
        }    
        
         public void setColor(String color){
            this.color = color;
        }
         
        public void setAnio(int anio){
            this.anio = anio;
        }     
        
        public void encender(){
            System.out.println("El auto esta encendiendo....");
        }    
            
         public void apagado(){
            System.out.println("El auto se esta apagando....");
        }    
        
          public void acelerar(){
            System.out.println("El auto esta acelerando....");
        }     
          
          public void frenar(){
            System.out.println("El auto esta frenando....");
        }      
}
