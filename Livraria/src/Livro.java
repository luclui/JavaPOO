public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public void detalhes(){
        System.out.println("titulo = " + titulo);
        System.out.println("autor = " + autor);
        System.out.println("total de páginas = " + totalPag);
        System.out.println("página atual = " + pagAtual);
        System.out.println("aberto = " + aberto);
        System.out.println("leitor = " + leitor.getNome());
    }

    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
        if (pag < this.totalPag || this.aberto){
            this.pagAtual =  pag;}
        else this.pagAtual = 0;
    }

    @Override
    public void avancaPag() {
        if (aberto)this.pagAtual++;
        else System.out.println("Livro fechado");
    }

    @Override
    public void voltaPag() {
        if (aberto)this.pagAtual--;
        else System.out.println("Livro fechado");
    }
}
