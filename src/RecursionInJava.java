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
    public int CalcPower(int x, int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        return x * CalcPower(x,n-1);
    }
}
