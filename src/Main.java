public class Main {
    public static void main(String[] args){
        task5();
        task6();
        task7();
    }
    public static void  task5() {
        System.out.println( " задание 5");
        for (int i = 1904; i < 2096; i = i+ 4) {
            System.out.println( i+ " год является высокосным.");

        }
    }
    public static void  task6(){
        System.out.println( " задание 6");
        for (int i = 7; i < 98; i=i+7) {
            System.out.println( " итерация цыкла " + i);

        }
    }
    public static void  task7(){
        System.out.println( " задание 7");
        for (int i = 1; i < 512; i= i *2) {
            System.out.println( " итерация цыкла " + i);

        }
    }

}