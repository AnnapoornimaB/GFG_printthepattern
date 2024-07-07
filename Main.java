class GfG 
{
    void printPat(int n) 
    {
       for(int O = 0; O < n; O++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n-O;j++)
                {
                    System.out.print(n-i+" ");
                }
            }
            System.out.print("$");
        }
    }
}
