public class Depth_First_Search {


    private int graph[][];



    private int used[][];
    private int goal_x;
    private int goal_y;
    private int x;
    private int y;
    private int flag = 0;
    private int px[] = {-1, 0, 1, 0};   //通过px 和 py数组来实现左下右上的移动顺序
    private int py[] = {0, -1, 0, 1};

    public Depth_First_Search(int graph[][], int used[][],int goal_x, int goal_y, int x, int y) {
        this.graph = graph;
        this.used = used;
        this.goal_x = goal_x;
        this.goal_y = goal_y;
        this.x = x;
        this.y = y;
    }

    public void find_path() {
        dFS(used, 0, 0);
    }

    public void print() {

            System.out.print("Finished");

    }

    private int m = 4;
    private int n = 5;

    public int [][] dFS(int used_input[][], int x_input, int y_input) {

        int new_x = x_input;
        int new_y = y_input;

        if (new_x == goal_x & new_x== goal_y) {

            System.out.print("successful");
            System.out.print(used);
            flag = 1;
            return used;
        }

        for (int i = 0; i != 4; ++i) {
            //如果没有走过这个格子
            new_x = x + px[i];
            new_y = y + py[i];
            if (new_x >= 0 && new_x < n && new_y >= 0
                    && new_y < m && used[new_x][new_y] == 0 && flag !=1 ) {

                used[new_x][new_y] = 1;     //将该格子设为走过

                dFS(used, new_x, new_y);      //递归下去

                used[new_x][new_y] = 0;//状态回溯，退回来，将格子设置为未走过


            }
        }
        return used;
    }

    public int[][] getUsed() {
      return used;
    }
}




