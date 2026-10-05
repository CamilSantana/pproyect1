package asignacion2_2;

public class Calculadora {
    //sobrecargas de los metodos sumar,resta y multiplicar
    public int Sumar(int a,int b){
        return a + b;
    }
    
        public int Sumar(int a,int b,int c){
            return a + b + c;
        }
    
            public int Sumar(int a,int b,int c,int d){
                return a + b + c + d;
            }
    
    public int Restar(int a,int b){
        return a - b;
    }
    
        public int Restar(int a,int b,int c){
            return a - b - c;
        }
        
            public int Restar(int a,int b,int c,int d){
                return a - b - c - d;
            }
            
    public int Multiplicar(int a,int b){
        return a * b;
    }
    
        public int Multiplicar(int a,int b,int c){
            return a * b * c;
        }
        
            public int Multiplicar(int a,int b,int c,int d){
                return a * b * c * d;
            }
    // aqui no la use porque dependiendo del orden cuando dividimos nos da un resultado diferente
     public int Dividir(int a,int b){
        return a / b;
    }
}
    
   