public class Main {
    public static void main(String[] args) {
        int count = 1;
        System.out.printf("Number %d is: 2", count);
        System.out.print("\n");
        int num = 3;
        boolean isPrime = true;
        while (count < 20) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.printf("Number %d is: %d", count,num);
                System.out.print("\n");
            } else {
                isPrime = true;
            }
            num++;
        }
    }
}