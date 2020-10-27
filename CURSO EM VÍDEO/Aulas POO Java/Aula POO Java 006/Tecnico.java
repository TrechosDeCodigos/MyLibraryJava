
package aula006;

public final class Tecnico extends Aluno {
    private int registroProfissional;
    public void praticar() {
      System.out.println ("Exercendo a profissão de  " + this.nome);
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
