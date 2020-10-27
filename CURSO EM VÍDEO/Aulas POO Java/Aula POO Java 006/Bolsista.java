
package aula006;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
      System.out.println ("Renovando bolsa de " + this.nome);
    }
    //Sobreposição do pagarMensalidade, onde é especificado a diferença entre dois métodos com o mesmo nome mas com funções diferentes
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento com desconto");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    
}
