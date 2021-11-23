public class Main {

    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 50);
        Fighter alex = new Fighter("Alex" , 10 , 95, 90, 50);
        Ring r = new Ring(marc,alex , 110 , 80);
        r.run();
    }
}
