public class PrimeNumber {
    private int n;
    public PrimeNumber(int n) {
        this.n = n;
    }

    public void display() {
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                System.out.println(n + ": is not a prime number");
                return;
            }
        }
        System.out.println(n + ": is a prime number");
    }

    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber(11);

        p.display();
    }
}