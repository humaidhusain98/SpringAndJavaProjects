import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class check {


//
   static BigInteger getMaxRowColVal(List<List<Integer>> twodimentsionalList,int n)
    {
        int initrow=1;
        int initcol=n;
//        int max=0;
        BigInteger max=new BigInteger("0");

        while(initcol>=1)
        {

            BigInteger sum=new BigInteger("0");
            int row = initrow;
            int col = initcol;
            while (row <= n && col <= n) {
                Integer val = (twodimentsionalList.get(row)).get(col);
                sum = sum.add(new BigInteger(val.toString()));
                row++;
                col++;
            }
            initcol--;
            if(sum.compareTo(max)>0)
            {
                max=sum;
            }
        }

        initrow=1;
        initcol=1;
        while(initrow<=n)
        {
            BigInteger sum=new BigInteger("0");
            int row = initrow;
            int col = initcol;
            while (row <= n && col <= n) {
                Integer val = (twodimentsionalList.get(row)).get(col);
                sum = sum.add(new BigInteger(val.toString()));
                row++;
                col++;
            }
            initrow++;
            if(sum.compareTo(max)>0)
            {
                max=sum;
            }
        }

        return max;


    }




    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++)
        {
            List<List<Integer>> twodimentsionalList = new ArrayList<List<Integer>>();
            int n;

            twodimentsionalList.add(new ArrayList<>());

            n = sc.nextInt();
            for (int i = 1; i <= n; i++)
            {
                List<Integer> rows = new ArrayList<>();
                rows.add(-999);
                for (int j = 1; j <= n; j++) {
                    int val = sc.nextInt();
                    rows.add(val);
                }
                twodimentsionalList.add(rows);
            }

//             printData(twodimentsionalList,n);
            BigInteger b=getMaxRowColVal(twodimentsionalList,n);
            System.out.println("Case #"+t+": "+b);

        }//for loop


    }

//    BigInteger getMaxRow(){
//        BigInteger maxRow;
//
//
//    }



//     void getData(){
//
//    }
//
//
//     void printData(List<List<Integer>> twodimentsionalList,int n)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            System.out.println("--------Row!!!---------");
//            System.out.println(twodimentsionalList.get(i));
//        }
//    }

}
