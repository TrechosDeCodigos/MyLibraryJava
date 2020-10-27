
package aula007;
public class Réptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
        
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
        
    }

    @Override
    public void emitirSim() {
        System.out.println("som de Reptil");
        
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    void getCorEscama(String verde) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getPeso(String f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
