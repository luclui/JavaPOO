import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria().equals(l2.getCategoria())) && (!l1.equals(l2))) {
            desafiado = l1;
            desafiante = l2;
            setAprovada(true);
            //System.out.println("Luta marcada");
        }
        else {
            setAprovada(false);
            desafiante = null;
            desafiado = null;
        }
    }
    public void lutar(){
        if (aprovada){
            desafiado.apresenatar();
            desafiante.apresenatar();
            Random rad = new Random();
            int vencedor = rad.nextInt(0,2);
                switch (vencedor){
                    case 0:
                        System.out.println("Empatou");
                        desafiado.empatarLuta();
                        desafiante.empatarLuta();
                        break;
                    case 1:
                        System.out.println("Vitória do " + this.desafiante.getNome());
                        desafiante.ganharLuta();
                        desafiado.perderLuta();
                        break;
                    case 2:
                        System.out.println("Vitória do " + this.desafiado.getNome());
                        desafiado.ganharLuta();
                        desafiante.perderLuta();
                        break;
                }
        }else System.out.println("Luta não pode acontecer");
        System.out.println("___________________________________________________________");
    }

    
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
