import java.util.Scanner;

public class OpgaveArkArrays6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] navne = new String[10];
        int count = navne.length;
        for (int i = 0; i < count; i ++){
            navne[i]=input.next();
        }
        System.out.println(overFem(navne, count));
    }
    public static int overFem(String[] navne, int count){
        int sum=0;
        for (int i = 0; i < count; i++){
            if (navne[i].length() > 5){
                sum++;
            }
        }
        return sum;
    }
}
