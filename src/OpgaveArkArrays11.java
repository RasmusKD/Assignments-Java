public class OpgaveArkArrays11 {
    public static void main(String[] args) {
        int[] talArray = {13,10,7,5,60,88,0,17,99,1};
        int k = 88;
        System.out.println(k + " er på index " +binarySearch(talArray, k));
        selectionSort(talArray);
        for(int i = 0;i<10;i++){
            System.out.print(talArray[i] + " ");
        }

    }
        public static int binarySearch(int[] list, int key) {
            int low = 0;
            int high = list.length - 1;

            while (high >= low) {
                int mid = (low + high) / 2;
                if (key < list[mid])
                    high = mid - 1;
                else if (key == list[mid])
                    return mid;
                else
                    low = mid + 1;
            }

            return -low - 1; // Now high < low
        }
        public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}

