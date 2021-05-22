import java.util.Random;

public class RNG extends ThreeQuicksort {
	
	public static int getRandomNumberInRange(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("Upper bound less than lower bound.");
		}

		Random rand = new Random();
		return rand.nextInt((max - min) + 1) + min;
	}
}
