package Arrays;

public class BasicCRUD {

    /**
     *
     * @param size
     * @return
     */
    public int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0 ; i < size ; i++ ) {
            arr[i] = i+100;
        }
        System.out.println(arr);
        return arr;
    }

    public void updateArray(int[] arr, int num) {
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] += num;
        }
        System.out.println(arr);
    }

    public int readArray(int[] arr, int index) {
        return arr[index];
    }

    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }


}

class Testing {
    public static void main(String[] a){
        BasicCRUD basicCRUD = new BasicCRUD();
        int[] arr = basicCRUD.createArray(5);
        basicCRUD.updateArray(arr, 10);
        System.out.println(basicCRUD.readArray(arr, 4));
    }
}
