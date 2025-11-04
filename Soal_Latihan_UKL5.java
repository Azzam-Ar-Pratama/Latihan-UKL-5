import java.util.Scanner;

public class Soal_Latihan_UKL5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        if (!input.hasNextInt()) {
            System.out.println("Input bukan bilangan bulat.");
            input.close();
            return;
        }
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0.");
            input.close();
            return;
        }

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            while (!input.hasNextDouble()) {
                System.out.println("Input tidak valid. Masukkan nilai numerik.");
                input.next(); 
                System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            }
            double nilai = input.nextDouble();
            if (nilai < 0) {
                System.out.println("Nilai tidak boleh negatif. Masukkan ulang.");
                i--; 
                continue;
            }
            sum += nilai;
        }

        double rataRata = sum / n;
        System.out.printf("Rata-rata nilai dari %d siswa: %.2f%n", n, rataRata);
        input.close();
    }
}
