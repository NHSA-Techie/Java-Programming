public class PopulationProjection {
    public static void main(String[] args) {
        // Current population
        long population = 312032486;

        // Number of seconds in a year
        long secondsInYear = 365 * 24 * 60 * 60;

        // Calculate and display the projected population for each of the next five years
        System.out.println("Population for Year 1: " + (population + (secondsInYear / 7) - (secondsInYear / 13) + (secondsInYear / 45)));
        System.out.println("Population for Year 2: " + (population + 2 * (secondsInYear / 7) - 2 * (secondsInYear / 13) + 2 * (secondsInYear / 45)));
        System.out.println("Population for Year 3: " + (population + 3 * (secondsInYear / 7) - 3 * (secondsInYear / 13) + 3 * (secondsInYear / 45)));
        System.out.println("Population for Year 4: " + (population + 4 * (secondsInYear / 7) - 4 * (secondsInYear / 13) + 4 * (secondsInYear / 45)));
        System.out.println("Population for Year 5: " + (population + 5 * (secondsInYear / 7) - 5 * (secondsInYear / 13) + 5 * (secondsInYear / 45)));
    }
}
   
