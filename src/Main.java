public class Main {
    public static void main(String[] args) {
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
                System.out.printf("%d\n", firstArray[i]);
                break;
            }
            System.out.printf("%d, ", firstArray[i]);
        }

        System.out.print("Второй массив: ");
        for (int i = 0; i < secondArray.length; i++) {
            if (i == secondArray.length -1){
                System.out.printf("%.3f\n", secondArray[i]);
                break;
            }
            System.out.printf("%.3f, ", secondArray[i]);
        }

        System.out.print("Третий массив: ");
        for (int i = 0; i < thirdArray.length; i++) {
            if (i == thirdArray.length -1){
                System.out.printf("%d\n", thirdArray[i]);
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
                System.out.printf("%d\n", firstArray[i]);
                break;
            }
            System.out.printf("%d, ", firstArray[i]);
        }

        System.out.print("Второй массив: ");
        for (int i = secondArray.length - 1; i >= 0 ; i--) {
            if (i == 0){
                System.out.printf("%.3f\n", secondArray[i]);
                break;
            }
            System.out.printf("%.3f, ", secondArray[i]);
        }

        System.out.print("Третий массив: ");
        for (int i = thirdArray.length - 1; i >= 0 ; i--) {
            if (i == 0){
                System.out.printf("%d\n", thirdArray[i]);
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
                System.out.printf("%d\n", firstArray[i]);
                break;
            }
            System.out.printf("%d, ", firstArray[i]);
        }
    }
}