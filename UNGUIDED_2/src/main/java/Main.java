import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Titik titik = new Titik();
        int x = 0, y = 0;
        int pilihan;
        do {
            System.out.println("MENU OPERASI TITIK");
            System.out.println("1. INISIALISASI TITIK");
            System.out.println("2. TAMPIL TITIK");
            System.out.println("3. PERKALIHAN SKALAR TITIK");
            System.out.println("4. PENCERMINAN TERHADAP SUMBU X");
            System.out.println("5. PENCERMINAN TERHADAP SUMBU Y");
            System.out.println("6. JARAK ANTARA DUA TITIK");
            System.out.println("0. KELUAR");
            System.out.print("MASUKAN PILIHAN: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai x Titik : ");
                    x = input.nextInt();
                    System.out.print("Masukkan nilai y Titik : ");
                    y = input.nextInt();
                    titik.inisialisasiTitik(x, y);
                    break;
                case 2:
                    titik.tampilTitik();
                    break;
                case 3:
                    System.out.print("Masukkan nilai skalar : ");
                    int skalar = input.nextInt();
                    titik.perkalihanSkalar(skalar);
                    titik.tampilTitik();
                    titik.inisialisasiTitik(x, y);
                    break;
                case 4:
                    titik.pencerminanSumbuX();
                    titik.tampilTitik();
                    titik.inisialisasiTitik(x, y);
                    break;
                case 5:
                    titik.pencerminanSumbuY();
                    titik.tampilTitik();
                    titik.inisialisasiTitik(x, y);
                    break;
                case 6:
                    System.out.print("Masukkan nilai x Titik kedua : ");
                    int x2 = input.nextInt();
                    System.out.print("Masukkan nilai y Titik kedua : ");
                    int y2 = input.nextInt();

                    double jarak = titik.jarak(x2,y2);
                    System.out.println("Jarak antara Titik 1 dan Titik kedua : " + jarak);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
            System.out.println("\n\n");
        } while (pilihan != 0);

        input.close();
    }
}
