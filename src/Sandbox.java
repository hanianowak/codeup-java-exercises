import sun.awt.geom.AreaOp;

public class Sandbox {
    public static void main(String[] args) {
         countDown(8);

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for (int num:numbers) System.out.print(num + " ");
        System.out.println();
        for (int num:reverse(numbers)) System.out.print(num + " ");
        countUp(7);

    }


    public static int countDown(int input) {
        if (input > 0) {
            System.out.println(input);
            return countDown(input - 1);
        } else {
            System.out.println("Blastoff");
            return 0;
        }
    }
    


    public static int endAmount;
//    public int base = 0;

    public static int countUp(int x) {
        if (x > endAmount) return 0;
        else {
            System.out.println(x);
            return countUp(x+1);
        }
    }



    public static int[] reverse(int[] nums) {
        int[] backwards = new int[nums.length];
        for (int i =0;i<nums.length;i++) {
            //backwards.unshift(nums[i])
            for (int num:backwards)
                System.out.print(num + " ");
            System.out.println();
            backwards[backwards.length - i - 1] = nums[i];
        }
        return backwards;
    }



}


    