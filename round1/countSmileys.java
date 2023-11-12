import java.util.Arrays;

public class countSmileys {
   private static int countSmileys(String[] countSmiley){
        int count = 0;
        for (String Smiley : countSmiley) {
            int length = Smiley.length() - 1;
            if ((length==1 || length==2)&&(Smiley.charAt(0) == ':' || Smiley.charAt(0) == ';') && (Smiley.charAt(length) == ')' || Smiley.charAt(length) == 'D')) {
                if (!(length == 2 && Smiley.charAt(1) != '-' && Smiley.charAt(1) != '~')) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        String[][] countSmileys = new String[][]{{":)", ";(", ";}", ":-D"}
            ,{";D", ":-(", ":-)", ";~)"}
            ,{";]", ":[", ";*", ":$", ";-D"}
            ,{":-D",":~D",";-D",";~D",":-)",":~)",";-)",";~)" ,":)",";)",";D",":D", ":(", ";}" ,":lD"}
            ,{";}" ,":lD"}
            ,{}};
        for(String[] countSmiley : countSmileys) {
            System.out.println(countSmileys(countSmiley));
        }
    }
}
