public class HailStoneProblem {

    public static void main(String[] args) {
        int maxIterations = 0;
        int numberWithMaxIterations = 0;

        for (int i = 1; i <= 200; i++) {
            int steps = hailstoneIterations(i);
            if (steps > maxIterations) {
                maxIterations = steps;
                numberWithMaxIterations = i;
            }
        }

        System.out.println("Do all integers from 1 to 200 eventually reach the cycle? Likely yes (though unproven).");
        System.out.println("Maximum number of iterations: " + maxIterations);
        System.out.println("Number producing this maximum: " + numberWithMaxIterations);
        System.out.println("\n Iterations: " + hailstoneOutput(171));
    }

    public static int hailstoneIterations(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            
            count++;
        }
        return count;
    }

    public static int hailstoneOutput(int n) {
        int count = 0;
        System.out.print(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(", "+n);
            count++;
        }
        return count;
    }
}


