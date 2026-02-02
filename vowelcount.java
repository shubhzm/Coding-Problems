import java.util.*;
public class vowelcount{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        int vowel=0, consonants=0;
        for(int i=0;i<str.length();i++)
        {     str.toLowerCase();
             char ch=str.charAt(i);
             if (ch>='a'&& ch<='z') {
                if (ch=='a'|| ch=='i'|| ch=='o'||ch=='u'||ch=='e') {
                    vowel+=1;
                    
                }
                else{
                    consonants+=1;

                }
                
             }
        }
        System.out.println("vowel count  "+" "+vowel+" " +"consonants count"+  consonants);

    }

}