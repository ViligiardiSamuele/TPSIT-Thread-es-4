public class Risorsa {
    private int val;
    private boolean disponibile = false;

    public synchronized int consuma() {
        int out;
        while (!disponibile) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        disponibile = false;
        out = val;
        val = 0;
        notifyAll();
        return out;
    }

    public synchronized void produci(int val) {
        while (disponibile) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.val = val;
        disponibile = true;
        notifyAll();
    }
}