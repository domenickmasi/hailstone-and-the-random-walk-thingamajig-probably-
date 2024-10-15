import java.util.Random;

public class RandomWalkProblem {

    public static void main(String[] args) {
        int trials = 50;
        int bridgeLength = 7;
        int[] stepsTaken = new int[trials];

        for (int i = 0; i < trials; i++) {
            stepsTaken[i] = randomWalk(bridgeLength);
        }

        int totalSteps = 0;
        int maxSteps = Integer.MIN_VALUE;
        int minSteps = Integer.MAX_VALUE;

        for (int steps : stepsTaken) {
            totalSteps += steps;
            if (steps > maxSteps) maxSteps = steps;
            if (steps < minSteps) minSteps = steps;
        }

        double averageSteps = (double) totalSteps / trials;

        System.out.println("Average steps: " + averageSteps);
        System.out.println("Maximum steps: " + maxSteps);
        System.out.println("Minimum steps: " + minSteps);
    }

    public static int randomWalk(int length) {
        Random rand = new Random();
        int position = length / 2;
        int steps = 0;

        while (position > 0 && position < length) {
            steps++;
            if (rand.nextInt(2) == 0) {
                position--; 
            } else {
                position++;
            }
        }

        return steps;
    }
}
