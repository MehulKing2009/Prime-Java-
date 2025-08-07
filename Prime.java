package question.me;
class Prime
{
        public static void main(String[] args) 
    {
     long x,y,z;
     System.out.println("2");
     for(x=3L;;x=x+1)
     { z=0;
        for (y=2L;y<x;y=y+1)
        {
            if (x%y==0)
          {
            z=1;
          }
        }
        if (z==0)
        {
            System.out.println(x);
        }
     }
    }
}
