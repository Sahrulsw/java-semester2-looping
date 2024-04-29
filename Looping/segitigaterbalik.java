public class segitigaterbalik {
    public static void main(String[] args) {
        int tinggi = 5; // Tinggi segitiga
        
        // Loop untuk baris
        for (int i = tinggi; i >= 1; i--) {
            // Loop untuk mencetak bintang dalam setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Pindah ke baris berikutnya setelah mencetak bintang dalam satu baris
            System.out.println();
        }
    }
}






