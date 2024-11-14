public class Lutador implements Controlador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;


    public Lutador(String nome, String nacionalidade, int idade,
                   float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    @Override
    public void apresenatar() {
        System.out.println("nome = " + getNome());
        System.out.println("nacionalidade = " + getNacionalidade());
        System.out.println("peso = " + getPeso());
        System.out.println("altura = " + getAltura());
        System.out.println("categoria = " + getCategoria());
        System.out.println("idade = " + getIdade());
        System.out.println("vitorias = " + getVitorias());
        System.out.println("derrotas = " + getDerrotas());
        System.out.println("empates = " + getEmpates());
        System.out.println("___________________________________________________________");
    }

    @Override
    public void status() {
        System.out.println("nome = " + getNome());
        System.out.println("peso = " +getPeso());
        System.out.println("vitorias = " + getVitorias());
        System.out.println("derrotas = " + getDerrotas());
        System.out.println("empates = " + getEmpates());
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates()+1);
    }

    //getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso<52.2f) categoria = "Inválido";
        else if(peso<=70.3f) categoria = "Leve";
        else if (peso<=83.9) categoria = "Médio";
        else categoria = "Pesado";
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
