public class Main {
    public static void main(String[] args) {
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];

    p[0] = new Pessoa("Lucas", 17 , "M");
    p[1] = new Pessoa("Luiza", 18, "F");

    l[0] = new Livro("Diário de um Banana", "Jeff Kinney",80, p[0]);
    l[1] = new Livro("Harry Potter", "J. K. Rowling", 200, p[1]);
    l[2] = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 40, p[0]);

    l[1].abrir();
    l[1].folhear(100);
    l[1].detalhes();
    }
}
