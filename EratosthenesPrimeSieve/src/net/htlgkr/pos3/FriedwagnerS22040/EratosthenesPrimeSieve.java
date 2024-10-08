package net.htlgkr.pos3.FriedwagnerS22040;

import java.sql.Array;

public class EratosthenesPrimeSieve implements PrimeSiev
{
    boolean[] primes;

    public EratosthenesPrimeSieve(int limit)
    {
        primes = new boolean[limit+1];

        for (int i = 2; i <= limit; i++) {
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


    public boolean isPrime(int limit)
    {
        return primes[limit];
    }

    public void printPrime()
    {
        for (int i = 2; i < primes.length; i++)
        {
            if (primes[i]) System.out.print(i + " ");
        }
    }
}
