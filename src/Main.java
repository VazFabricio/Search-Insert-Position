public class Main {
    public static void main(String[] args) {
        int [] array = {0,2,4,5,6,7,8,9};
        System.out.println(search(array, 3));
        printArray(array);
        shortArray(array);
        System.out.println(" ");
        printArray(array);
        System.out.println(" ");
        System.out.println(search(array, 3));


    }
    public static int search (int [] array, int target){
        int n = array.length;
        int index = 0;
        for (int i = 0; i<n; i++){
            if (array[i] == target){
                return i;
            }
        }
        for ( int i = 0; i<n; i++){
            if (array[i] < target){
                index = i + 1;
            } else {
                index = i;
                return index;
            }
        }
        return index;
    }
    public static void shortArray (int [] array){
        int n = array.length;
        for (int i = 0; i < n; i++){
            int key = array[i];
            int j = i -1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;

        }
    }
    static void printArray(int [] array){
        int n = array.length;
        for (int i = 0; i< n; i++){
            System.out.print(array[i]+ " ");
        }

    }
}