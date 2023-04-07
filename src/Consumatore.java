public class Consumatore extends Thread {
    private Risorsa r;
    private int val = 0;
    private boolean running = true;

    Consumatore(String nome, Risorsa r) {
        super(nome);
        this.r = r;
    }

    public void arresta() {
        this.running = false;
    }

    public void run() {
        while (running) {
            val = r.consuma();
            System.out.println(super.getName() + " ha consumato " + val);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Thread " + super.getName() + " terminato");
    }

}