public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println(" Задание 1 и 2");
        System.out.println();
        int[] firstArray = new int[4];
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] myMassive = {11, 111, 112, 115};
        int mart = 0;
        int aprel = 1;
        int may = 2;
        int iun = 3;

        System.out.print(myMassive[mart ] + " , ");
        System.out.print(myMassive[aprel ] + " , ");
        System.out.print(myMassive[may ] + " , ");
        System.out.print(myMassive[iun ] + "  ");
        System.out.println();
        System.out.print(secondArray[0]+ " , ");
        System.out.print(secondArray[1] + " , ");
        System.out.print(secondArray[2] + "  ");
        System.out.println();
        for (int i = 1; i < firstArray.length; i++) {
            System.out.print(  i+",");
        }
        System.out.println();
        System.out.println( " Задание 3 ");
        System.out.println();
    }
    public static void task2(){
        int[] firstArr = new int[4];
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] myMassive = {11, 111, 112, 115};
        int mart = 0;
        int aprel = 1;
        int may = 2;
        int iun = 3;

        System.out.print(myMassive[iun ] + " , ");
        System.out.print(myMassive[may ] + " , ");
        System.out.print(myMassive[aprel ] + " , ");
        System.out.print(myMassive[mart ] + "  ");
        System.out.println();
        System.out.print(secondArray[2]+ " , ");
        System.out.print(secondArray[1] + " , ");
        System.out.print(secondArray[0] + "  ");
        System.out.println();
        for (int i = 3; i >= 1; i--) {
            System.out.print(  i+",");

        }
        System.out.println();
        System.out.println(" Задание 4 ");
        System.out.println();
    }
    public static void task3() {
        int[] firstArr = new int[4];
        for (int i = 0;  i < firstArr.length;  i= i +2) {
            System.out.print(i + ",");
        }
    }

}