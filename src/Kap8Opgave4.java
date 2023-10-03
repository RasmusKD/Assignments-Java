public class Kap8Opgave4 {
    public static void main(String[] args) {

        int [][] table = {
                {2, 4, 3, 4, 5, 8, 9},
                {5, 4, 5, 4, 5, 4, 5},
                {5, 4, 5, 4, 5, 4, 5},
                {2, 4, 3, 4, 5, 8, 9},
                {2, 4, 3, 4, 5, 8, 9},
                {2, 4, 3, 4, 5, 8, 9},
                {2, 4, 3, 4, 5, 8, 9},
                {2, 4, 3, 4, 5, 8, 9}
        };
        String [] employee={"Oliver", "Rasmus", "Robert", "Mikkel", "Jonas", "Andreas","Alexander","Mathias"};

        int sumTimer=0;

        for(int i = 0; i < 8; i++){
            for (int j =0; j < 7; j ++){
                sumTimer+= table[i][j];
            }
            System.out.println(employee[i] + " har arbejdet " + sumTimer+ " timer");
            sumTimer=0;
        }
    }
}
