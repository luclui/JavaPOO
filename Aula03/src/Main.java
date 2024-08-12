public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo="Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = "0.5f"; erro pq é private
        c1.carga = 80; // deixa usar protegido pq esta ligado a Caneta
        //c1.tampada = true;
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
}
