
package aula02;




public class Aula02 {
   
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor="Azul";
        c1.ponta=0.5f;
        c1.modelo= "BIC";
        c1.carga = 100; 
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor="Vermelha";
        c2.ponta=0.5f;
        c2.modelo = "FaberCastell";
        c2.carga = 50;
        c2.status();
        c2.rabiscar();
        
      
    }
    
}
