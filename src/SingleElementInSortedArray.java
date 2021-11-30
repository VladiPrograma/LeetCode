public class SingleElementInSortedArray {

    public static void main(String[] args) {
        int[] l = {0,0,2,2,2,1};
        System.out.println(singleNonDuplicate(l));
    }

    public static int singleNonDuplicate(int[] nums) {
        int num = nums[0];
        boolean unique =true;
        for (int i=1; i<nums.length; i++){
            if (num!=nums[i]){
                if (unique){
                    return num;
                }else{
                    unique=true;
                }
            }else{
                unique = false;
            }
            num=nums[i];
        }
        return nums[nums.length-1];
    }
}
