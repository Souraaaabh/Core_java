public class RecursionAdvance {

    public void Permutations(String str , String permutation){
        if ( str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            Permutations(newstr,permutation+currChar);

        }
    }
    public int countPathsMaze(int i, int j  , int n , int m){
        if (i==n ||j==m){
            return 0;
        }
        if (i==n-1 &&j== m-1) {
            return 1;
        }

        int downPaths = countPathsMaze(i,j+1,n,m);//down move
        int rightPaths = countPathsMaze(i+1,j,n,m);//right move
        return  downPaths +rightPaths;
        }
        public int TilePlaceWays(int n,int m){
        if (n==m){
            return 2; // only 2 ways to arrange the tiles
        }if (n<m){
            return 1;//only one way to arrange the tiles

            }
            int verticalplaced = TilePlaceWays(n-m,m); // vertical placing
            int horizPlace  = TilePlaceWays(n-1,m);   // Horizontal placing

            return verticalplaced+horizPlace;

        }
        public int PartyInviteWays(int n){
        if (n<=1){
            return 1;
        }
        int way1 = PartyInviteWays(n-1);
        int way2 =(n-1) * PartyInviteWays(n-2);
        return  way1+ way2;
        }
}

