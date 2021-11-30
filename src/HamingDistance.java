public class HamingDistance {

    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        System.out.println( hammingDistance(a,b));
    }
    public static  int hammingDistance(int x, int y) {
        String x1 =Integer.toBinaryString(x);
        String y1 =Integer.toBinaryString(y);
        char[] l1 = x1.toCharArray();
        char[] l2 = y1.toCharArray();
        char[] l1Or = x1.toCharArray();
        char[] l2Or = y1.toCharArray();
        int dif = Math.abs(l1.length-l2.length);
        if (l1.length>l2.length){
            l1 = Integer.toBinaryString(x).substring(dif).toCharArray();
        }
        if (l2.length>l1.length){
            l2 = Integer.toBinaryString(y).substring(dif).toCharArray();
        }
        int min = Math.min(l1.length, l2.length);
        int cont=0;

        for (int i=min-1; i>=0; i--){
            System.out.println(l1[i]+" webo "+l2[i]);
            if (l1[i]!=l2[i]){
                cont++;
            }
        }
        if (l1Or.length==min&&l2Or.length!=min){
            for (int i=0; i< l2Or.length-min; i++){
                if (l2Or[i]!=0) cont++;
            }
        }
        if (l2Or.length==min&&l1Or.length!=min){
            for (int i=0; i< l1Or.length-min; i++){
                if (l1Or[i]!=0) cont++;
            }
        }
        return cont;
    }

}
