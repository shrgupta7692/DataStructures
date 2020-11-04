package Arrays;

public class CloneArray {

    public int[] cloneArray(int[] arr) {
        return arr.clone();
    }
}

class CloneTesting {
    public static void main(String[] arg) {
        BasicCRUD basicCRUD = new BasicCRUD();
        int[] arr1 = basicCRUD.createArray(5);
        basicCRUD.printArray(arr1);
        System.out.println("\nCopying");
        CloneArray cloneArray = new CloneArray();
        int[] c = cloneArray.cloneArray(arr1);
        basicCRUD.printArray(c);

    }
}
