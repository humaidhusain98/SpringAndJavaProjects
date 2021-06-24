package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class addTwoNum {
    public static void main(String[] args) {
        long N[]=new long[2];

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String[] getInp =  (br.readLine()).split(" ");
            N[0] = Integer.parseInt(getInp[0]);
            ArrayList<CusObj>  cusobjlist= new ArrayList<CusObj>();
            N[1] = Integer.parseInt(getInp[1]);
            for(int i=0;i<N[0];i++)
            {
                String[] arr;
                arr= br.readLine().split(" ");
                int x =Integer.parseInt(arr[0]);
                int y =Integer.parseInt(arr[1]);
                int v =Integer.parseInt(arr[2]);
                CusObj obj = new CusObj(x,y,v);
                cusobjlist.add(obj);
            }
            long result = calculateScore(cusobjlist,N[1]);
            System.out.println(result);





        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    static long calculateScore(ArrayList<CusObj> objlist,long k)
    {
        long maxcost=0;
        for(int i=0;i<objlist.size();i++)
        {
            CusObj currObj = objlist.get(i);
            long cost=0;
            List<CusObj> filteredlist = objlist.stream().filter(obj->(!currObj.equals(obj))&&(currObj.x<=obj.x)&&(currObj.y>=obj.y)).collect(Collectors.toList());
            for(int j=0;j<filteredlist.size();j++)
            {
                cost=cost+filteredlist.get(j).v;
            }
            cost=cost - k*(currObj.y- currObj.x)+ currObj.v;
            if(cost>maxcost)
            {
                maxcost=cost;
            }
        }
        return maxcost;
    }


}

class CusObj
{
    long x,y,v;
    CusObj(long x,long y,long v)
    {
        this.x=x;
        this.y=y;
        this.v=v;
    }

    @Override
    public String toString() {
        return "CusObj{" +
                "x=" + x +
                ", y=" + y +
                ", v=" + v +
                '}';
    }
}
