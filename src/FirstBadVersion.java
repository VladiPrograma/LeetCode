public class FirstBadVersion {
    public int firstBadVersion(int n) {
        System.out.println(n);

        for( int i =0 ; i<n; i++){
           if (isBadVersion(i)) return i;
        }
        return n;
    }

    public static int isFirst(int n, int f){

        if (isBadVersion((n+f)/2)){isFirst(n, (n+f)/2);}
        else{}
        System.out.println("Yo Github so dope");
        System.out.println("?¿ webo");
        return n;
    }

    public static  boolean isBadVersion(int n){ return true; }


}
