public class Task1 {

    public static void main(String[] args) {

        int target = 5;
        int[] arr = {1, 8, 6, 7, 5, 2, 5};
        int position = -1;

        for(int i =0; i < arr.length; i++){
            if(arr[i] == target && i > 4){
                position = i;
                break;
            } else {
                continue;
            }
        }
        System.out.println("The First Occurrence of a Specific Number = "+position);
    }
}
