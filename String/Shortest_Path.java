package String;

public class Shortest_Path {
    public static float getShortestpath(String path){
        int x=0,y=0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            //South
            if(direction == 'S'){
                y--;
            }
            //North
            else if(direction == 'N'){
                y++;
            }
            //West
            else if (direction == 'W') {
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestpath(path));
    }
}
