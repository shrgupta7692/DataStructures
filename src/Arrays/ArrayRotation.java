package Arrays;

public class ArrayRotation {

    public int[] rotate1(int[] arr, int index) {
        System.out.println("Rotating given array using for loop");
        long startTime = System.currentTimeMillis();
        int[] rotateArr = new int[arr.length];
        int j = 0;
        for (int i = index; i < arr.length; i++) {
            rotateArr[j++] = arr[i];
        }
        for (int i = 0 ; i < index ; i++) {
            rotateArr[j++] = arr[i];
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        return rotateArr;
    }

    public int[] leftRotate(int arr[], int d) {
        System.out.println("Rotating given array using gcd");
        long startTime = System.currentTimeMillis();
        int n = arr.length;
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        return arr;
    }

        int gcd(int a, int b)
        {
            if (b == 0)
                return a;
            else
                return gcd(b, a % b);
        }

    }

class RotateTesting {
    public static void main(String[] args) {
        BasicCRUD basicCRUD = new BasicCRUD();
        int[] arr = basicCRUD.createArray(10000);
       // basicCRUD.printArray(arr);

        ArrayRotation rotation = new ArrayRotation();
        rotation.rotate1(arr, 10);
        int[] r = rotation.leftRotate(arr, 10);
      //  basicCRUD.printArray(r);
    }
}