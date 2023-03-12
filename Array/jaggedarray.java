package Array;

public class jaggedarray {
    public static void main(String[] args) {
        int nums[][] = {
                { 3, 4, 5 ,7},
                { 12, 42 },
                { 14, 32, 21 }

        };
        for(int i=0;i<=2;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }



        
    }
}
