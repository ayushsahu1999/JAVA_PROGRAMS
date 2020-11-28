
public class RainWaterTrap {
	
	public static void rainWater(int[] bars) {
		int[] maxRight = new int[bars.length];
		int[] maxLeft = new int[bars.length];
		
		int mL = 0, mR = 0, trapped = 0;
		for (int i = bars.length - 1; i > 0; i--) {
			if (mR < bars[i])
				mR = bars[i];
			
			maxRight[i] = mR;
		}
		
		for (int i = 0; i < bars.length; i++) {
			if (mL < bars[i])
				mL = bars[i];
			
			maxLeft[i] = mL;
		}
		
		for (int i = 1; i < bars.length - 1; i++) {
			if (maxLeft[i] < maxRight[i]) {
				trapped += (maxLeft[i] - bars[i]);
			}
			else {
				trapped += (maxRight[i] - bars[i]);
			}
		}
		
		System.out.println(trapped);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bars[] = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		rainWater(bars);
	}

}
