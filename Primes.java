public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int range = Integer.parseInt(args[0]);
        int[] nums = new int[range + 1];  // Inclusive


        for (int i = 2; i < Math.sqrt(range); i++) {
            for (int j = i * 2; j <= range; j += i) {
                if (nums[j] == -1) {continue;}
                nums[j] = -1;
            }
        }

        int counter = 0;
        System.err.println("Prime numbers up to " + range + ":");
        for (int i = 2; i < nums.length; i++) { // Primes > 2
            if (nums[i] != -1) {
                System.out.println(i);
                counter++;
            }
        }
        int percent = (int)((double)counter/range * 100);
        System.out.println("There are " + counter + " primes between 2 and " + range + " (" + percent + "% are primes)");
    }
}