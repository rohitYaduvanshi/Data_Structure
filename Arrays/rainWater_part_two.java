package Arrays;

public class rainWater_part_two {
    static public int water_trapped(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //Calculate right max boundary - array        
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >=0; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trapped_water = 0;
        //loop
        for (int i = 0; i <n; i++) {
            //water_level = ?
            int water_level = Math.min(leftMax[i],rightMax[i]);
            trapped_water += water_level - height[i];
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(water_trapped(height));
    }
}
