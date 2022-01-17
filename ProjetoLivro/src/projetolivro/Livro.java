package projetolivro;
public class Livro implements Publicação{
    //ATRIBUTOS:
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //MÉTODOS:
    public String detalhes(){
        return " ======================" 
         + "\n Título: " + this.titulo +
        "\n Autor: " + this.autor +
        "\n Total de páginas: " +this.totPaginas +
        "\n Página atual: " + this.pagAtual +
        "\n O livro está aberto? " + this.aberto +
        "\n Quem está lendo? " + this.leitor.getNome() +
        "\n ======================";
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = this.pagAtual + p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
    //MÉTODOS ESPECIAIS:
    
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String ti){
        this.titulo = ti;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String au){
        this.autor = au;
    }
    public int getTotPaginas(){
        return totPaginas;
    }
    public void setTotPaginas(int tp){
        this.totPaginas = tp;
    }
    public int getPagAtual(){
        return pagAtual;
    }
    public void setPagAtual(int pa){
        this.pagAtual = pa;
    }
    public boolean aberto(){
        return aberto;
    }
    public void setAberto(boolean ab){
        this.aberto = ab;
    }
    public Pessoa getLeitor(){
        return leitor;
    }
    public void setLeitor(Pessoa le){
        this.leitor = le;
    }
    
}
