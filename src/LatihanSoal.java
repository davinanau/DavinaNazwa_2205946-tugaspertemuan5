import java.util.Scanner;

public class LatihanSoal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan panjang sisi a: ");
        double a = input.nextDouble();
        System.out.println("Masukkan panjang sisi b: ");
        double b = input.nextDouble();
        System.out.println("Masukkan panjang sisi c: ");
        double c = input.nextDouble();
        
        double luas = hitungLuasSegitiga(a, b, c);
        double keliling = hitungKelilingSegitiga(a, b, c);
        
        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);
        
        input.close();
    }
    
    public static double hitungLuasSegitiga(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double luas = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
        return luas;
    }
    
    public static double hitungKelilingSegitiga(double a, double b, double c) {
        double keliling = a + b + c;
        return keliling;
    }
}
