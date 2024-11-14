public class ControleRemoto implements Controlador {
    private  int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado " + this.isLigado());
        System.out.println("Tocando " + this.isTocando());
        System.out.println("Volume " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }
    @Override
    public void maisVolume() {
        if (isLigado()){
            setVolume(getVolume()+5);
        }
    }

    @Override
    public void menosVolume() {
        if(isLigado()){
            setVolume(getVolume()-5);
        }
    }

    @Override
    public void ligarMudo() {
        if ((this.isLigado()) && (this.getVolume()>0)){
            setVolume(0);
        }
    }

    @Override
    public void desligaMudo() {
        if ((this.isLigado()) && (this.getVolume() == 0)) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
            if ((isLigado()) && !(isTocando())){
                setTocando(true);
            }
        }

    @Override
    public void pause() {
        if ((isLigado()) && (isTocando())){
            setTocando(false);
        }
    }
}
