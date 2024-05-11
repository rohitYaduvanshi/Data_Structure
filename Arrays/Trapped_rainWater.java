package Arrays;

public class Trapped_rainWater {
    public static int trap_water(int height[]){
        int result = 0; // Initialize result outside the loop
        for (int i = 1; i < height.length - 1; i++) { // Adjusted loop boundaries
            int left_bar = height[i];
            for (int j = 0; j < i; j++) {
                if (height[j] > left_bar) {
                    left_bar  = height[j]; // Corrected comparison with left_bar
                }
            }
            int right_bar = height[i];
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > right_bar) {
                    right_bar  = height[j]; // Corrected comparison with right_bar
                }
            }
            //Find Water level
            int Water_level = Math.min(left_bar, right_bar);
            //Find trapped Water
            int trapp_water = Water_level - height[i];
            if (trapp_water > 0) {
                result += trapp_water;
            }
        }
        return result; // Moved return statement outside the loop
    } 
    public static void main(String[] args) {
        // int height[] = {4,2,0,3,2,5};
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trap_water(height));
    }
}
