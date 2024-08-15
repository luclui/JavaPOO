public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //constructor
    public Conta(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo) {
        this.setStatus(true);
        setTipo(tipo);

        if (tipo == "CP") setSaldo(150);
        else setSaldo(50);
    }

    public void fecharConta(){
        if (this.getSaldo() == 0) {
            this.setStatus(false);
        } else if (this.getSaldo() < 0) {
            System.out.println("Não é possível fechar a conta devido a débitos existentes ");
        } else {
            System.out.println("Não é possível fechar a conta devido a saldo remanescente na conta");
        }
    }

    public void depositar (float v){
        if (this.getStatus()){
            setSaldo(getSaldo()+ v);
            System.out.println("Deposito realizado");
        }else System.out.println("Impossível depositar em uma conta fechada");
    }

    public void sacar(float s){
        if (this.getSaldo() >= s){
            setSaldo(getSaldo() - s);
            System.out.println("Saque realizado");
        }else System.out.println("Valor do saque indisponível");
    }

    public void pagarMensal(){
        int m;
        if (this.getTipo() == "CC") m = 12;
        else m = 20;

        if (getStatus()){
            if (getSaldo() > m){
                setSaldo(getSaldo() - m);
            }else System.out.println("Saldo indisponível para pagar");
        }else System.out.println("Conta fechada");
    }

    public void estadoAtual(){
        System.out.println("numConta = " + getNumConta());
        System.out.println("tipo = " + getTipo());
        System.out.println("dono = " + getDono());
        System.out.println("saldo = " + getSaldo());
        System.out.println("status = " + getStatus());
        System.out.println("_________________________");
    }




    //getter e setter
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
