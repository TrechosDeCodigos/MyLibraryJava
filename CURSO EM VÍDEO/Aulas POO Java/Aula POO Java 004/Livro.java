package aula09;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; 
    // Métodos Públicos

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" 
                + autor + ", totPaginas=" + totPaginas 
                + ", pagAtual=" + pagAtual + ", aberto=" 
                + aberto + ", leitor=" + leitor + '}';
    }
    
    // Métodos Especiais

    public Livro(String ti, String au, int to,  Pessoa leitor) {
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = to;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String ti) {
        this.titulo = ti;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String au) {
        this.autor = au;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int to) {
        this.totPaginas = to;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pa) {
        this.pagAtual = pa;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    @Override
    public void abrir(){
        this.aberto = true;
    
    }
    @Override
    public void avancarPag(){
       this.pagAtual ++;
    }

    @Override
    public void fechar(){
        this.aberto = false;
    
    }
    @Override
    public void folhear(int p){
       this.pagAtual = p ;
       
    
    }
    @Override
    public void voltarPag(){
        this.pagAtual --;
    
    }
    

   
    }
    
    
    
    


