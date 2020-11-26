import java.util.ArrayList;

public class Stocks {
	
	static class Result {
		int buy, sell;
	}
	
	public static void findProfit(int[] array) {
		ArrayList<Result> result = new ArrayList<Result>();
		for (int i = 1; i < array.length; i++) {
			
			Result temp = new Result();
			
			while (i < array.length && array[i - 1] > array[i]) {
				i++;
			}
			
			if (i == array.length) {
				System.out.println("No profit is possible!");
				break;
			}
			
			temp.buy = i - 1;
			i++;
			
			while (i < array.length && array[i - 1] < array[i]) {
				i++;
			}
			
//			if (i == array.length)
//				i--;
			
			temp.sell = i - 1;
			result.add(temp);
			
		}
		
		for (int j = 0; j < result.size(); j++) {
			System.out.println(result.get(j).buy + " " + result.get(j).sell);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {94, 78, 32, 20, 12, 8, 90};
		findProfit(array);
	}

}
