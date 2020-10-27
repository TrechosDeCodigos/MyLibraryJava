
package aula007;


public class Aula007 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Réptil n = new Réptil();
        Peixe p = new Peixe ();
        Ave a = new Ave();
        
        m.setCorPelo("Marrom");
        m.locomover();
        m.alimentar();
        m.emitirSim();
        
        a.setCorPena("Vermelha");
        a.fazerNinho();
        a.locomover();
        a.emitirSim();
        
        n.alimentar();
        n.emitirSim();
        n.getCorEscama("Verde");
        n.getPeso("20.2f");
        
        
        
    }
    
}
