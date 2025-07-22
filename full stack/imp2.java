public class imp2 {
    public static void main(String[] args){
        int[][] grid={
            {0,1,0},
            {0,0,0},
            {0,0,0},
            
        };
        int npaths=paths(grid,0,0);
        System.out.println(npaths);

    }
    

//public class Wine{
    static int paths(int[][] grid,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
       
        if(i>m-1 ||j>n-1 || grid[i][j]==1)return 0;
         if(i==m-1 && j==n-1)return 1;
        else{
            int nright=paths(grid,i,j+1);
            int ndown=paths(grid,i+1,j);
            return nright+ndown;
        } 
       }
    }
