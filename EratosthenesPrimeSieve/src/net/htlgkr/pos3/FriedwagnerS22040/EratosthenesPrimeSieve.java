package net.htlgkr.pos3.FriedwagnerS22040;

import java.sql.Array;

public class EratosthenesPrimeSieve
{
    private int limit;
    boolean[] primes = new boolean[limit];

    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
    }

    public boolean isPrime(int p)
    {
        //alles auf false
        for (int i = 2; i <= p; i++) {
            primes[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(limit); i++)
        {
            if (primes[i])
            {
                for (int j = i*i; j<= limit; j+=i) {
                    primes[j] = false;
                }
            }
        }
        
    }

    public void printPrime()
    {

    }
}
