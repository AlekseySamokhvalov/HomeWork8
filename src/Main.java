public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double[] array2 = {1.52, 7.654, 9.986};
        String[] fruits = {"яблоко", "банан", "апельсин", "виноград", "киви"};

    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double[] array2 = {1.52, 7.654, 9.986};
        String[] fruits = {"яблоко", "банан", "апельсин", "виноград", "киви"};

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i < array1.length - 1) {
                // если это не последний элемент массива, ставим запятую после него
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i < array2.length - 1) {
                // если это не последний элемент массива, ставим запятую после него
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]);
            if (i < fruits.length - 1) {
                // если это не последний элемент массива, ставим запятую после него
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

    }

    public static void task4() {
        System.out.println("Задача 4");

    }

}