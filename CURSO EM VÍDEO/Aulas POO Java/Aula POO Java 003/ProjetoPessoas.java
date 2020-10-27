
package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        //Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
                
        p1.setNome("Alan");
        p2.setNome("Anaís");
        p3.setNome("André");
        p4.setNome("Nicole");
        
        p1.setIdade(20);
        p2.setIdade(21);
        p3.setIdade(22);
        p4.setIdade(23);
        
        p1.setGenero("M");
        p2.setGenero("F");
        p3.setGenero("M");
        p4.setGenero("F");
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Juridico");
        
        p3.recebAument(1000f);
        p4. mudarTrabalho();
        p2. cancelMatric();
        
        
        System.out.println (p1.toString());
        System.out.println (p2.toString());
        System.out.println (p3.toString());
        System.out.println (p4.toString());
                
        
        //p3.recebAumento(1000);
       // p4. mudarTrabalho();
        //p2. cancelMatri();
    }
}
    

