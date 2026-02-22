import java.util.*;

public class StrBuilder {

    public StrBuilder() {
        StringBuilder sb = new StringBuilder("Tony");
    char i = sb.charAt(0);
        System.out.println(i);
        sb.setCharAt(0, 'P');
        System.out.println(sb.charAt(0));

        sb.append('S');
        System.out.println(sb);
        sb.insert(0,'s');
        System.out.println(sb);


        sb.delete(0,1);
        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

    }

    public void ReverseStr(){
        Scanner sc = new Scanner(System.in);
        String str = new String(sc.nextLine());
         char[]str1 = str.toCharArray();
        int l =0;
        int r=str.length()-1;
//        StringBuilder temp = new StringBuilder();

        while(r>l){
            char temp = str1[l];
            str1[l] = str1[r];
            str1[r] = temp;
            l++;
            r--;

        }

        System.out.println(new String(str1));
    }

}
