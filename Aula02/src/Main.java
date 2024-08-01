public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.carga = 40;
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();

        System.out.println("");

        Caneta c2 = new Caneta();
        c2.modelo = "liggi";
        c2.carga = 20;
        c2.ponta = 1;
        c2.cor = "verde";
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
}
