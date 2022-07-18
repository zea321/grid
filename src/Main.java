import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      /*Ввести с клавиатуры два целых числа, которые будут координатами точки (первое считанное число - это координата "x", а второе - координата "y").
 Известно, что точка не лежит на координатных осях OX и OY.
 Вывести на экран номер координатной четверти, в которой находится данная точка.*/
        Scanner dot = new Scanner(System.in);
        int x = dot.nextInt();
        int y = dot.nextInt();
        if (y > 0 && x > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (y < 0 && x < 0) {
            System.out.println("3");
        } else if ( x > 0 && y < 0) {
            System.out.println("4");
        }




    }
}