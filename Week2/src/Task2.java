public class Task2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
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
