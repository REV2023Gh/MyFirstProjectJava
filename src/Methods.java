

public class Methods {
    //№1
    public static void printThreeWorld() {
        System.out.println("Orange\nBanana\nApple");
    }
    //№2
    public static void checkSumSighned() {
        int a = 10;
        int b = 20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //3
    public static void printColor() {
        int value;
        value = 30;
        if (value < 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //№4
    public static void compareNumbers() {
        int a = 5, b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    //№5
    public static boolean fromTenToTwenty(int a, int i) {
        int c = a + i;
        c >= 10 && c <= 20 ? return true :return false;
    }
    //№6
    public static int checkPrintSign(int data) {
        if (data < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
        return data;
    }
    //№7
    public static int isPositiveNumber(int num) {
        num < 0 ? return true :return false;
    }
    //№8
    public static int printStringInConsole(int d) {
        String s = "Повторяюсь";
        for (int i = 0; i < 5; i++) {
            System.out.println(s + "5 раз");
        }
        return d;
    }
    //9
    public static boolean isLeapYear() {
        int year = 2004;
        if (year % 4 == 0) &&(year % 100 != 0) || (year % 400 == 0) {
            return true;
        } else{
            return false;
        }
    }

    //10
    public static void changeNumber() {
        int[] array = {0, 1, 1, 0, 0, 1, 0};
        for (int i =0,j = 0;i < array.length; i++, j--);
        array[i] = i;
        array[j] = i++;
        System.out.println(array[i, j]);
    }

    //11
    public static void createEmptyArray() {
        int[] emptyArray = new int[100];
        for (int i = 0; i < emptyArray.length; i++) ;
        emptyArray[i] = i + 1;
    }

    //12
    public static int arrayToReduce() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 11};
        for (int i  = 0; i < array.length; i = i * 2);
            if (array[i] < 6);
    }

    //13
    public static void squareArray() {
        int[][] square = new int[5][5];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length(i); j++) {
                square[i][j] == 1;
                square[square.length - 1 - i][i] = 1;
            }
        }
    }
    //14
    public static int returnValue(int len, int initialValue) {
        int[] arrlen = new int[len];
        for (int i = 0; i < arrlen.length; i++){
         arrlen[i] = initialValue;}
         return arrlen;
    }

}



