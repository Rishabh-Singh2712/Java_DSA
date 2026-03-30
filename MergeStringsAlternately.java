import java.util.Scanner;
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2)
    {
        StringBuilder mergedString= new StringBuilder();
        for(int i=0;i<word1.length()||i<word2.length();i++){
            if(i<word1.length()){
                mergedString.append(word1.charAt(i));
            }
            if(i<word2.length()){
                mergedString.append(word2.charAt(i));
            }
        }
        return mergedString.toString();
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1=sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2=sc.nextLine();
        MergeStringsAlternately obj= new MergeStringsAlternately();
        System.out.println("Merged string: " + obj.mergeAlternately(s1, s2));

    }
}
