public class ReverseStringII {

    public static void main(String[] args) {
        String res = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(res, k));
    }

    public static String reverseStr(String s, int k) {

        char[] list = s.toCharArray();
        if (list.length<k*2+1&&list.length>=k){
            String s1 = s.substring(k);
            String reverse = s.substring(0,k);
            char[] list2 = reverse.toCharArray();
            for (int i=0; i<list2.length/2; i++){
                char aux = list2[list2.length-i-1];
                list2[list2.length-i-1]=list2[i];
                list2[i] = aux;
            }
            return new String(list2)+s1;
        }

        for (int i=k-1; i<list.length-1; i+=k*2){
            if (i ==k-1){
                char aux = list[i];
                list[i] = list[i+1];
                list[i+1]=aux;
            }else{
                char aux = list[i];
                list[i] = list[i-1];
                list[i-1]=aux;
            }
        }

        return new String(list);
    }


}
