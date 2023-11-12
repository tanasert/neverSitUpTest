import java.util.Arrays;

public class odd {

    public static void main(String[] args){
        int[][] input = {{0},{7},{1,1,2},{0,1,0,1,0},{1,2,2,3,3,3,4,3,3,3,2,2,1}};
        for(int[] inputGet:input) {
            System.out.println(FindOdd(inputGet));
        }
    }
    public static int FindOdd(int[] input){
        Arrays.sort(input);
        for(int i=0;i<input.length-1;i+=2){
            if(input[i]!=input[i+1] ){
                return input[i];
            }
        }
        return input[input.length-1];
    }
}
