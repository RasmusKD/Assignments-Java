public class Kap7Opgave7 {
    public static void main(String[] args) {

        int[] count = new int[10];
        for (int i = 0; i < 200; i++){
            int tal = (int) (Math.random() * 10);
            count[tal]++;
        }
        for(int i = 0; i < 10; i++){
            System.out.println("talllet "+ i + " forekommer " + count[i] + " gange");
        }
    }
}
