package algo;
// n Log log n
public class check_prime_sieve {
    public static void main(String[] args) {
        prime(10);
    }
    public static void prime(int n)
    {
        boolean [] prime = new boolean[n+1];
        prime[0]=prime[1]=true; //not prime
        for(int i=2;i*i<n;i++)
        {
            if(prime[i]==false)
            {
                for(int j=2;j*i<=n;j++)
                {
                    prime[j]=true;
                }
            }

            for(int k=2;k<n;k++)
            {
                System.out.println( );
            }     
        }
    }
    
}
