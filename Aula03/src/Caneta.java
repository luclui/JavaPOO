    import javax.swing.*;

    public class Caneta {
        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        private boolean tampada;

        void status(){
            System.out.println("Modelo " + this.modelo);
            System.out.println("Uma caneta " + this.cor);
            System.out.println("Ponta: " + this.ponta);
            System.out.println("Carga " + this.carga);
            System.out.println("Está tampada? " + this.tampada);
        }

        public void rabiscar(){
            if (this.tampada) {
                System.out.println("Erro, não pode rabiscar tampado");
            } else {
                System.out.println("Rabiscando");
            }
        }
        public void tampar(){
            this.tampada = true;
        }
        public void destampar(){
            this.tampada = false;
        }
    }


