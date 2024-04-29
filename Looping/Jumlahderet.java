public class Jumlahderet {
    public static void main(String[] args) {
        int n = 15;
        int jumlah = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                jumlah += i;
            }
            i++;
        }
        System.out.println("Jumlah deret ganjil: " + jumlah);
    }
}