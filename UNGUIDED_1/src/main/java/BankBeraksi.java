import java.util.Scanner;

public class BankBeraksi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int uang;
        Bank akun = new Bank(100000);
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini : Rp."+ akun.getSaldo()+"\n");
        System.out.print("Simpan Uang : ");
        uang = in.nextInt();
        akun.simpanUang(uang);
        System.out.println("Saldo saat ini : Rp."+ akun.getSaldo()+"\n");
        System.out.print("Ambil uang : ");
        uang = in.nextInt();
        akun.ambilUang(uang);
        System.out.println("Saldo saat ini : Rp."+ akun.getSaldo());
    }
}
