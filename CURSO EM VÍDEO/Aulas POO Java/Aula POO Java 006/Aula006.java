
package aula006;


public class Aula006 {

    public static void main(String[] args) {
      Aluno a1 = new Aluno();
      a1.setNome ("Suellen");
      a1.setMatricula(20180101);
      a1.setCurso("Engenharia de Software");
      a1.setIdade(35);
      a1.setGenero("Feminino");
      System.out.println(a1.toString());
      a1.pagarMensalidade();
      
    }
    
}
