import java.util.Scanner;

public class OpgaveArkArrays5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] navne = new String[10];
        int count = navne.length;
        for (int i = 0; i < count; i ++){
            navne[i]=input.next();
        }
        udskriv(navne, count);
    }
    public static void udskriv(String[] navne, int count){
        for (int i = 0; i < count; i++){
            System.out.println(navne[i]);
        }
    }
}
