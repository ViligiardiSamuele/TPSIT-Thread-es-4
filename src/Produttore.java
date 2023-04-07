public class Produttore extends Thread {
    private Risorsa r;
    private int val = 0;
    private boolean running = true;

    Produttore(String nome, Risorsa r) {
        super(nome);
        this.r = r;
    }

    public void arresta() {
        this.running = false;
    }

    public void run() {
        while (running) {
            val = (int)(Math.random() * 100 + 1);
            r.produci(val);
            System.out.println(super.getName() + " ha prodotto " + val);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Thread " + super.getName() + " terminato");
    }

}