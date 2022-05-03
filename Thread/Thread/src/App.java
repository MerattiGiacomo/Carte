public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Giocatore g1 = new Giocatore("Gianni");
        Giocatore g2 = new Giocatore("Gioele");
        Giocatore g3 = new Giocatore("Gigi");

        g1.start();
        g2.start();
        g3.start();

        g1.join();
        g2.join();
        g3.join();

        if(g1.getCarta() > g2.getCarta() && g1.getCarta() > g3.getCarta())
            System.out.println("Il giocatore " + g1.getNome() + " ha vinto!");
        else if(g2.getCarta() > g1.getCarta() && g2.getCarta() > g3.getCarta())
            System.out.println("Il giocatore " + g2.getNome() + " ha vinto!");
        else if(g3.getCarta() > g1.getCarta() && g3.getCarta() > g2.getCarta())
            System.out.println("Il giocatore " + g3.getNome() + " ha vinto!");
        else
            System.out.println("C'è stato un pareggio");
    }
}
