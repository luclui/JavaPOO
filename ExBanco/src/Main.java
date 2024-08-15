public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(1, "CC" , "Lucas");
        c1.abrirConta("CC");
        c1.depositar(50);
        c1.sacar(10);
        c1.pagarMensal();

        c1.estadoAtual();


        Conta c2 = new Conta(2, "CP", "Luiza");
        c2.abrirConta("CP");
        c2.sacar(150);
        c2.fecharConta();

        c2.estadoAtual();
    }
}
