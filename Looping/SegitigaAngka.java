public class SegitigaAngka {
    public static void main(String[] args) {
        int tinggi = 5; // Tinggi segitiga
        
        // Loop untuk baris
        for (int i = 1; i <= tinggi; i++) {
            // Loop untuk mencetak angka dalam setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Pindah ke baris berikutnya setelah mencetak angka dalam satu baris
            System.out.println();
        }
    }
}