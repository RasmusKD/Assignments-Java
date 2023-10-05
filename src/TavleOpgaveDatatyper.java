import java.io.FileNotFoundException;
import java.io.PrintWriter;
//Laver talfil og tilføjer 1000 tal
public class TavleOpgaveDatatyper {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter udFil = new PrintWriter("Talfil.txt");
        int tal;
        for (int i = 0; i < 1000; i++){
            tal = (int) (Math.random()*10);
            udFil.print(tal + " ");
        }
        udFil.close();
    }
}
