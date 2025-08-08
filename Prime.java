class Prime
{
        public static void main(String[] args) 
    {
     long x,y,z;
     System.out.println("2");
     for(x=3L;;x=x+1) // add limit by for(x=3L;x<=3448;x=x+1)
     { z=0;
        for (y=2L;y<x;y=y+1)
        {
            if (x%y==0)
          {
            z=69; // Do not change to 0
          }
        }
        if (z==0)
        {
            System.out.println(x);
        }
     }
    }
}
