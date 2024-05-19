package B;

public class IDeuxMatris {
    public static void main(String[] args) {

        int [] [] nums ={{4,3,6},{6,5,6},{7,8,9}};
        int result=0;
        //System.out.println(nums[0][1]);
        for(int i=0;i<nums.length;i++){
            result=0;
            for(int j=0;j<nums[i].length;j++){
            System.out.print(nums[i] [j]+" ");
            result=result+nums[i][j];

            }
        System.out.println();
            System.out.println(result);

        }

    }

}
