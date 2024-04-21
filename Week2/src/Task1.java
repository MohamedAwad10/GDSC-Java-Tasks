import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.print("Enter Array Length : ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter element number "+(i+1)+" : ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter your target : ");
        int target = input.nextInt();

        int position = -1;

        for(int i =0; i < arr.length; i++){
            if(arr[i] == target && i > 4){
                position = i;
                break;
            } else {
                continue;
            }
        }
        System.out.println("The First Occurrence of "+target+" is in index : "+position);
    }
}
