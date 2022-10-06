public class DFS_Test {
    public static void main(String[] args) {
        testDFS();
    }

    private static void testDFS() {
        int[][] array = new int[3][4];
        int[][] used_array = new int[3][4];
        int g_x = 2;
        int g_y = 3;
        int x_initial = 0;
        int y_initial =0;
        Depth_First_Search quickSort = new Depth_First_Search(array,used_array,g_x,g_y,x_initial,x_initial );
        quickSort.find_path();
        quickSort.print();
        quickSort.getUsed();
    }
}
