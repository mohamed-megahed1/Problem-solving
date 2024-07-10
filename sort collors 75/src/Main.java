
public class Main {
    public static void main(String[] args) {

        int []nums = {2,0,2,1,1,0};

      int []sortedcolor=  sortColors(nums);

        for (int num:sortedcolor) {
            System.out.println(num);
        }

    }
    public static int[] sortColors(int nums[]) {
        int [] arr_count={0,0,0};
        for (int num:nums) {
            arr_count[num]++;
        }
        int nums_counter=0;
        for (int i=0;i<arr_count.length;i++){
            int inerr_counter=0;
            while (arr_count[i] != inerr_counter){
                nums[nums_counter]=i;
                nums_counter++;
                inerr_counter++;
            }
        }
      return nums;


    }

}