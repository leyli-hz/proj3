import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondWay {
    public static void main(String[] args) {
        SecondWay secondWay = new SecondWay();
        Scanner sc = new Scanner(System.in);
        System.out.println(secondWay.maxProfit(secondWay.getArray()));
    }
    public static int[] getArray(){
        Scanner out = new Scanner(System.in);
        boolean flag = true;
        short n = 0;
        System.out.println("array length : ");
        do {
            n = out.nextShort();
            if (1 > n || n > 1000) {
                System.out.println("the number is too big or too small(1<n<1000). try again!!");
                flag = false;
            } else {
                flag = true;
            }
        } while (!flag);
        System.out.println("array values : ");
        int array[] = new int[n];
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            do {
                temp = out.nextInt();
                if (temp > (1000000000)) {
                    System.out.println("the number can't be more than 1000,000,000 . try again!!");
                    flag = false;
                } else {
                    array[i] = temp;
                    flag = true;
                }
            } while (!flag);
        }
        return array;
    }



    public int maxProfit(int[] array) {
        int min_cost = Integer.MAX_VALUE;
        int max_profit = 0;
        int profit = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min_cost)
                min_cost = array[i];

            profit = array[i] - min_cost;

            if (max_profit < profit)
                max_profit = profit;
        }
        return max_profit;
    }
}
