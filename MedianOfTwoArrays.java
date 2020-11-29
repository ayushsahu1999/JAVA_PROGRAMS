import java.lang.Math;

public class MedianOfTwoArrays {
	
	public static int getMedian(int[] array, int start, int end) {
		int length = end - start + 1;
		int median;
		
		if (length % 2 != 0) {
			median = start + length / 2;
		} else {
			median = (start + (length / 2) + start + (length / 2 - 1)) / 2;
		}
		
		return median;
	}
	
	public static float findMedian(int[] first, int start_f, int end_f, int[] second, int start_s, int end_s) {
		if (end_f - start_f == 1 && end_s - start_s == 1) {
			float x = Math.max(first[start_f], second[start_s]);
			float y = Math.min(first[end_f], second[end_s]);
//			System.out.println(x + " " + y);
			return (x + y) / 2;
		}
		else {
			int m1 = getMedian(first, start_f, end_f);
			int m2 = getMedian(second, start_s, end_s);
//			System.out.println(m1 + " " + m2);
			if (first[m1] > second[m2]) {
				return findMedian(first, start_f, m1, second, m2, end_s);
			}
			else {
				return findMedian(first, m1, end_f, second, start_s, m2);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = new int[] {1, 6, 8, 10, 12};
		int[] second = new int[] {2, 3, 4, 9, 11};
		
		float index = findMedian(first, 0, first.length-1, second, 0, second.length-1);
		System.out.println(index);
		
		int i = 0, j = 0, k = 0;
		while (i < first.length && j < second.length) {
			if (k == index) {
				if (first[i] < second[j])
					System.out.println(first[i]);
				else
					System.out.println(second[j]);
				break;
			}
			if (first[i] < second[j]) {
				i++;
			}
			else {
				j++;
			}
			k++;
		}
	}

}
