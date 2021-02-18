import java.lang.reflect.Array;
import java.util.Scanner;

public class FirstWay {
    public static void main(String[] args) {
       int[] a = getArray();
        System.out.println("Max profit : "+maxProfit(a) );
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

    public static int maxProfit(int[] array){
        int maxSood = 0;
        int sood = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    sood = array[j] - array[i];
                    if (sood > maxSood)
                        maxSood = sood;
                }
            }
        }
        return maxSood;
    }


}
