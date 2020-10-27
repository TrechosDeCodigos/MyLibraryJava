
package aula07;

import java.util.Random;

public class Luta  {
// Atibutos (COISAS QUE TENHO) 
private Lutador desafiado; 
private Lutador desafiante;
private int rounds;
private boolean aprovada;  
// Métodos Públicos
public void marcarLuta(Lutador l1, Lutador l2){
    if (l1.getCategoria() .equals(l2.getCategoria())
            && l1 != l2){
       this.aprovada = true;
       this.desafiado = l1;
       this.desafiante = l2; 
    }else {
       this.aprovada = false;
       this.desafiado = null;
       this.desafiante = null;
   }
}       
    public void lutar(){
       if (this.aprovada){
           System.out.println ("### DESAFIADO ###");
           this.desafiado.apresentar();
           System.out.println ("### DESAFIANTE ###");
           this.desafiante.apresentar();
           
           Random aleatorio = new Random ();
           int vencedor = aleatorio.nextInt(3); // 0 1 2
           switch (vencedor) {
               case 0: // Empate
                   System.out.println ("Empatou ! ");
                   this.desafiado.empatarLuta(rounds);
                   this.desafiante.empatarLuta(rounds);
                  break;
               case 1: // Desafiado vence
                 System.out.println ("Vitória do " + this.desafiado.getNome ());
                  this.desafiado.ganharLuta(rounds);
                  this.desafiante.perderLuta(rounds);
                   break;            
               case 2: // Desafiante vence
                 System.out.println ("Vitória do " + this.desafiante.getNome());
                  this.desafiado.perderLuta(rounds);
                  this.desafiante.ganharLuta(rounds);
                  break;
           }
           
       } else {
       System.out.println("A luta não pode acontecer");
       
       
       
       }
    }
// Métodos Especiais
    
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiado(Lutador dd){
       this.desafiado = dd;
    }
    
    public Lutador getDesafiante(){
       return desafiante;
    }
    public void setDesafiante (Lutador dt){
       this.desafiante = dt;
    }
    
    public int getRounds() {
      return rounds;
    }
    public void setRounds(int ro){
      this.rounds = ro;
    }
    
    public boolean getAprovada(){
      return aprovada;
    }
    public void setAprovada(boolean ap){
      this.aprovada = ap;
    }
    
}

