import java.util.Scanner;

public class Main {
    /*
       Задача по выводу символа *
     */
    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i=0; i < count; i++){
            print();
        }
    }

    public static void print(){
        System.out.print("* \t");
    }
}
