public class Titik {
    private int x;
    private int y;
    public void inisialisasiTitik(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void tampilTitik() {
        System.out.println("Titik = (" + x + ", " + y + ")");
    }
    public void perkalihanSkalar(int skalar) {
        x *= skalar;
        y *= skalar;
    }
    public void pencerminanSumbuX() {
        y = -y;
    }
    public void pencerminanSumbuY() {
        x = -x;
    }
    public double jarak(int x2, int y2) {
        int X = x2 - x;
        int Y = y2 - y;
        return Math.sqrt(X*X + Y*Y);
    }
}
