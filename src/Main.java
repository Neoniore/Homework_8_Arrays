import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //hwTask();
        //additionalTask1();
        //additionalTask2();
        additionalTask3();
    }

    public static void hwTask() {
            // Задание 1
            int[] firstArray = new int[3];
            firstArray[0] = 1;
            firstArray[1] = 2;
            firstArray[2] = 3;

            double[] secondArray = {1.57, 7.654, 9.986};

            byte[] thirdArray = {1, 2, 4, 8, 16};

            //Задание 2
            System.out.println("Задание 2");
            System.out.print("Первый массив: ");
            for (int i = 0; i < firstArray.length; i++) {
                if (i == firstArray.length -1){
                    System.out.println(firstArray[i]);
                    break;
                }
                System.out.printf("%d, ", firstArray[i]);
            }

            System.out.print("Второй массив: ");
            for (int i = 0; i < secondArray.length; i++) {
                if (i == secondArray.length -1){
                    System.out.println(secondArray[i]);
                    break;
                }
                System.out.printf("%.3f, ", secondArray[i]);
            }

            System.out.print("Третий массив: ");
            for (int i = 0; i < thirdArray.length; i++) {
                if (i == thirdArray.length -1){
                    System.out.println(thirdArray[i]);
                    break;
                }
                System.out.printf("%d, ", thirdArray[i]);
            }
            System.out.println();

            // Задание 3
            System.out.println("Задание 3");
            System.out.print("Первый массив: ");
            for (int i = firstArray.length - 1; i >= 0 ; i--) {
                if (i == 0){
                    System.out.println(firstArray[i]);
                    break;
                }
                System.out.printf("%d, ", firstArray[i]);
            }

            System.out.print("Второй массив: ");
            for (int i = secondArray.length - 1; i >= 0 ; i--) {
                if (i == 0){
                    System.out.println(secondArray[i]);
                    break;
                }
                System.out.printf("%.3f, ", secondArray[i]);
            }

            System.out.print("Третий массив: ");
            for (int i = thirdArray.length - 1; i >= 0 ; i--) {
                if (i == 0){
                    System.out.println(thirdArray[i]);
                    break;
                }
                System.out.printf("%d, ", thirdArray[i]);
            }
            System.out.println();

            //Задание 4
            System.out.println("Задание 4");
            System.out.print("Четный массив: ");
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] % 2 != 0) {
                    firstArray[i] += 1;
                }
                if (i == firstArray.length -1){
                    System.out.println(firstArray[i]);
                    break;
                }
                System.out.printf("%d, ", firstArray[i]);
            }
        System.out.println();
        }


        //https://leetcode.com/problems/monotonic-array/submissions/
    public static void additionalTask1() {
        boolean isMonotonic = true, isMonotonicInc = true, isMonotonicDec = true;
        int[] array_1 = {1, 0, 0, -1, -10, -12, -11};
        for (int i = 0; i < array_1.length - 1; i++) {
            if (array_1[i + 1] < array_1 [i]) {
                isMonotonicInc = false;
            }
            if (array_1[i + 1] > array_1 [i]) {
                isMonotonicDec = false;
            }
            if (isMonotonicInc == false && isMonotonicDec == false) {
                isMonotonic = false;
                break;
            }
        }
        System.out.println(isMonotonic);
        System.out.println();
    }

        //https://leetcode.com/problems/concatenation-of-array/description/
    public static void additionalTask2() {
        int[] nums = {1, 2, 1};
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < ans.length; i++) {
            if (i < nums.length) {
                ans[i] = nums[i];
            } else {
             ans [i] = nums [i - nums.length];
            }
        }
        System.out.println(Arrays.toString(ans));
    }

        //https://leetcode.com/problems/valid-mountain-array/
    public static void additionalTask3() {
        int[] arr = {3, 2, 1};
        boolean isValidMountainArray = true;
        int changeOfDirection = 0;
        if (arr.length < 3 || arr[0] >= arr[1]) {
            isValidMountainArray = false;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr [i + 1]) {
                isValidMountainArray = false;
                break;
            }
            if (arr[i] > arr[i + 1] && changeOfDirection == 0) {
                changeOfDirection += 1;
            }
            if (arr[i] < arr[i + 1] && changeOfDirection !=0) {
                isValidMountainArray = false;
                break;
            }
            if (changeOfDirection != 1) {
                isValidMountainArray = false;
            }
        }
        System.out.println(isValidMountainArray);
    }
}