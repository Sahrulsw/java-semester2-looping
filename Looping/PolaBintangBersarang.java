public class PolaBintangBersarang {
    public static void main(String[] args) {
        int tinggi = 5;
        
        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.println(" * ");
            }
            System.out.println();
        }
    }
}
