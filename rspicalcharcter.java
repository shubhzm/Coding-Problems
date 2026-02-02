import java.util.Scanner;

public class rspicalcharcter {

    public static void main(String[] args) {
        System.out.println("eneter the string");
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String result="";

        for(int i=0;i<str.length();i++){
//str.toLowerCase();
            char ch=str.charAt(i);
            if(ch>'A'&& ch<'Z'
            || ch>'a' && ch< 'z'
            || ch>'0' && ch<'9')
            {
              result +=ch;

            }

        }
        System.out.println(result);

    }
    
}
