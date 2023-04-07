public class Start {
    public static void main(String[] args) throws Exception {
        Risorsa r = new Risorsa();
        Produttore p1 = new Produttore("Prod1", r);
        Produttore p2 = new Produttore("Prod2", r);
        Consumatore c1 = new Consumatore("Cons1", r);
        Consumatore c2 = new Consumatore("Cons2", r);
        Consumatore c3 = new Consumatore("Cons3", r);
        Consumatore c4 = new Consumatore("Cons4", r);

        p1.start();
        p2.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        p1.arresta();
        p2.arresta();
        c1.arresta();
        c2.arresta();
        c3.arresta();
        c4.arresta();

        System.out.println("THread MAIN FINE");
    }
}