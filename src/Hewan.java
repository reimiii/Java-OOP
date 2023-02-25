public class Hewan {
    public void suara() {
        System.out.println("Hewan ini bersuara...");
    }

    public static void panggilSuara(Hewan hewan) {
        hewan.suara();
    }

    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan sapi = new Sapi();

        panggilSuara(kucing);
        panggilSuara(sapi);
    }
}
