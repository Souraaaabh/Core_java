import java.util.HashSet;

public class RecursionInJava {
    public void RecursivePrint(int n){
        if (n==6){
            return;
        }
        System.out.println(n);
        RecursivePrint(n+1);

    }

    public void SumOfNnumbs(int n,int i, int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;

        SumOfNnumbs(n, i+1, sum);

    }

    public  int Factorial(int n){
        if (n==1||n==0){
            return 1;
        }
        int factNum1 = Factorial(n-1);
        return n* factNum1;


    }
    public void Fibbna(int a,int b,int n){
        if (n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        Fibbna(b,c,n-1);
    }
    public int CalcPower(int x, int n){//stack height is n
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        return x * CalcPower(x,n-1);
    }
    public int CalcPowerlog(int x, int n){//stack height is log n
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        if (n%2==0) {
            return CalcPowerlog(x,n/2) *CalcPowerlog(x, n/2);
        }else {
            return CalcPowerlog(x,n/2) * CalcPowerlog(x,n/2) *x;
        }
    }

    //Tower of Hanoi
    //Rule 1 : Only one disk transferred in one step
    //Rule 2 : Smaller disks are always kept on top of larger disks

    public void TowerOfHanoi( int n , String src , String helper , String dest){
        if (n==1){
            System.out.println("Transfer of disk "+n+" from "+src+" to "+ dest);
            return;
        }
        TowerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer of disk "+n+" from "+src+" to "+ dest);
        TowerOfHanoi(n-1, helper,src,dest);

    }

    public void SubsequencesOfString(String str , int idx , String newStr){

        if (idx==str.length()){
            System.err.println(newStr);
            return;
        }
        // to be
        SubsequencesOfString(str,idx+1,newStr+str.charAt(idx));
        //not want to be
        SubsequencesOfString(str,idx+1,newStr);


    }
// Use this for subsequences only not for substrings and use this
    public void UniqueSubsequencesOfString(String str , int idx , String newStr , HashSet <String>set){

        if (idx==str.length()){
            if (set.contains(newStr)){
                return;
            }else {
                set.add(newStr);
                System.out.println(newStr);
                return;
            }
        }
        // to be
        UniqueSubsequencesOfString(str,idx+1,newStr+str.charAt(idx) ,set);
        //not want to be
        UniqueSubsequencesOfString(str,idx+1,newStr,set);


    }
    public void KeypadCombination(String str ,int idx ,String combination ){
       String[] kepad = {"." , "abc", "def","ghi","jkl" ,"mno","pqrs","tuv","wxyz"};

        if (idx == str.length()){
            System.out.println(combination);
            return;

        }
        String mapping = kepad[str.charAt(idx) - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            KeypadCombination(str,idx+1,combination+mapping.charAt(i));

        }

    }


}
