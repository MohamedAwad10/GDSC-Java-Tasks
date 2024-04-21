import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter Array Length : ");
        int n = input.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++) {
            System.out.print("Enter element number "+(i+1)+" : ");
            nums[i] = input.nextInt();
        }
        System.out.println("Sum = "+sum(nums));
        System.out.println("Average = "+average(nums));
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int[] arr){
        return (double)sum(arr) / arr.length;
    }
}
