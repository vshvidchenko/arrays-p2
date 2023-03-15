import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    private static void task4() {
        System.out.println("Задача 4");
//        int[] arr = generateRandomArray();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);

        }
    }


    private static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    // Объявить метод «сгенерироватьМассив»
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
        public static void task1() {
            System.out.println("Задача 1");
            int[] arr = generateRandomArray();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
//            System.out.println(Arrays.toString(arr));
            System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        }
            public static void task2() {
                System.out.println("Задача 2");
                int[] arr = generateRandomArray();
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < min) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                }
                System.out.println(Arrays.toString(arr));
                System.out.println(min);
                System.out.println(max);
            }
}
