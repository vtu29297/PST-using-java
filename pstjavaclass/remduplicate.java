public class remduplicate {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String []args){
        remduplicate abj=new remduplicate();
        int[] nums = {1,1,2,2,3,4,4,5};
        abj.removeDuplicates(nums);
        System.out.println(nums);
    }
}

