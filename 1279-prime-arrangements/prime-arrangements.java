class Solution {
    int MOD = 1000000007;
    public int numPrimeArrangements(int n) {
        int prime = 0;
        int nonPrime = 0;
        boolean[] isPrime = new boolean[n + 1];
        //int MOD = 1000000007;

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i] == true){
                for(int j=2*i;j<=n;j=j+i){
                    isPrime[j] = false;
                }
            }
        }     
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                prime ++;
            }
        }  
        nonPrime = n - prime;
        long ans = (factorial(nonPrime) * factorial(prime)) % MOD;
        return (int) ans;
    }
  
     private long factorial(int n){
        long result = 1;
        for(int i=2;i<=n;i++){
            result = (result * i)%MOD;
        }
        return result;
    }
}