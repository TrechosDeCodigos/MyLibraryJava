package aula04;
public class Pessoa {
    //Atributos (COISAS QUE EU TENHO)
    private String nome;
    private int idade;
    private String genero;
    private float altura;
    private String raca;
    private String nacionalidade;
    private String graudeescolaridade;
    private String profissao;
    private String estadocivil;

   
    //Métodos Publicos
    public void fazerAniver(){
     this.idade++;
    }
    //Métodos Especiais
    public void Livro(){
        
    
    }

    public Pessoa(String no, int id, String ge, float al, String ra, String na, String pr, String es) {
        this.nome = no;
        this.idade = id;
        this.genero = ge;
        this.altura = al;
        this.raca = ra;
        this.nacionalidade = na;
        this.profissao = pr;
        this.estadocivil = es;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String ge) {
        this.genero = ge;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String ra) {
        this.raca = ra;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public String getGraudeescolaridade() {
        return graudeescolaridade;
    }

    public void setGraudeescolaridade(String gr) {
        this.graudeescolaridade = gr;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String pr) {
        this.profissao = pr;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String es) {
        this.estadocivil = es;
    }
    
}
