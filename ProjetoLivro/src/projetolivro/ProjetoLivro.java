package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22 , "M");
        p[1] = new Pessoa("Maria", 25 , "F");
        l[0] = new Livro("Aprendendo Java", "Paulo", 300, p[0]);
        l[1] = new Livro("Aprofundando em Java", "Roger", 257, p[1]);
        l[2] = new Livro("Aprendendo a aprender", "Julia", 550, p[1]);
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
     }
    
}
