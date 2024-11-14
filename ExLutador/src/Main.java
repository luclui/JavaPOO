public class Main {
    public static void main(String[] args) {
        int[] lutador;
        lutador = new int[5];
        Lutador lutador1 = new Lutador("Pretty Boy", "França",
                31, 1.75f, 68.9f, 11, 2, 4);
        //lutador1.apresenatar();


        Lutador lutador2 = new Lutador("Putscript", "Brasil",
                29, 1.68f, 57.6f, 5, 6, 1);
        //lutador2.apresenatar();

        Lutador lutador3 = new Lutador("Snapshadow", "EUA",
                35, 1.65f, 80.9f,12,2,2 );
        //lutador3.apresenatar();

        Lutador lutador4 = new Lutador("Dead Code", "Colombia",
                25, 1.93f, 81.6f,13,0,0 );
        //lutador4.apresenatar();

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutador1, lutador2);
        UEC01.lutar();
        lutador1.apresenatar();

    }
}
