public class Giocatore extends Thread{
    protected String nome;
    protected int carta;

    public Giocatore(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getCarta(){
        return carta;
    }

    public void run(){
        System.out.println("Il giocatore " + nome + " ha iniziato a giocare");
        try{
            sleep(1);
        }
        catch(Exception e){
            System.out.println("ciao");
        }
        carta = (int)(10 * Math.random()) + 1;
        System.out.println("Il giocatore " + nome + " ha pescato la carta " + carta);
    }
}
