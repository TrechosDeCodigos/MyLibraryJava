package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.print ("Uma caneta " + this.cor);
        System.out.println ("Está tampada ? " + this.tampada);
        System.out.println ("Modelo " + this.modelo);
        System.out.println("A carga está " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    
    }
    
    void rabiscar(){
        if (this.tampada==true){
        System.out.println ("ERRO! Não posso rabiscar");
        }else {
         System.out.println("Estou Rabiscando ") ;  
        }
    }
    
    void tampar() {
        this.tampada=false;
    }
    
    void destampar(){
        this.tampada=true;
    }
            
            
}
