public class Main {
    public static void main(String[] args) {
        int [] array = {1,3,2,4,5,6,7,8,9};
        System.out.println(search(array, 3));
        printArray(array);
        shortArray(array);
        System.out.println(" ");
        printArray(array);


    }
    public static int search (int [] array, int target){
        int n = array.length;
        for (int i = 0; i<n; i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static int [] shortArray (int [] array){
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
        return array;
    }
    static void printArray(int [] array){
        int n = array.length;
        for (int i = 0; i< n; i++){
            System.out.print(array[i]+ " ");
        }


    }
}