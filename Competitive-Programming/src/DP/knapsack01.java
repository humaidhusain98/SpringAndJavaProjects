package DP;

public class knapsack01 {
    public static void main(String[] args) {
        int[] v=new int[]{10,5,15,7,6,18,3};
        int[] w=new int[]{2,3,5,7,1,4,1};
        initialize();
        double a=System.currentTimeMillis();
        System.out.println(knapsack(w,v,15,7));
        double b=System.currentTimeMillis();
        System.out.println("Time in miliseconds :"+(b-a));

    }
    static int t[][]=new int[8][16];

    static void initialize() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 16; col++) {
                t[row][col] = -1; //Whatever value you want to set them to
            }
        }
    }

    static int knapsack(int[] wt,int[] val,int W,int n)
    {
        if(n==0 || W==0)
            return 0;

        if(t[n][W]!=-1)
            return t[n][W];

        if(wt[n-1]<=W)
            return t[n][W]= Math.max(val[n-1]+knapsack(wt,val,W-wt[n-1],n-1),knapsack(wt,val,W,n-1));

        if(wt[n-1]>W)
            return t[n][W]= knapsack(wt,val,W,n-1);

        return knapsack(wt,val,W,n-1);
    }



}
