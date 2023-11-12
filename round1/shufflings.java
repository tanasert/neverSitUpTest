import java.util.HashSet;
import java.util.Set;

public class shufflings {

    public static void main(String[] args) {
        String[] inputs = {"","a","ab","abc","aabb"};
        for(String input:inputs) {
            System.out.println(getShufflings("", input));
        }
    }

    private static Set<String> getShufflings(String firstInput, String input) {
        Set<String> output = new HashSet<>();
        int length = input.length();
        if (length <= 2) {
            if(length <= 1){
                output.add(input);
            }else {
                char first = input.charAt(0);
                char last = input.charAt(1);
                output.add(firstInput + first + last);
                output.add(firstInput + last + first);
            }
            return output;
        } else {
            for (int i = 0; i < length; i++) {
                String newFirstInput = firstInput + input.charAt(i);
                String newInput = input.substring(0, i) + input.substring(i + 1);
                output.addAll(getShufflings(newFirstInput, newInput));
            }
            return output;
        }
    }
}
