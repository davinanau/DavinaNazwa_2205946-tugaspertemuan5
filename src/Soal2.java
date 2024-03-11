import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int awal = input.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int akhir = input.nextInt();
        
        int jumlahGenap = jumlahBilanganGenap(awal, akhir);
        
        System.out.println("Jumlah deret bilangan genap dari " + awal + " sampai " + akhir + " adalah: " + jumlahGenap);
        
        input.close();
    }
    
    public static int jumlahBilanganGenap(int awal, int akhir) {
        int jumlah = 0;
        
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) {
                jumlah += i;
            }
        }
        
        return jumlah;
    }
}
