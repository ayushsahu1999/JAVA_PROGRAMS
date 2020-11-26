
public class JumpGame {
	
	public static int jump(int[] nums) {
		int a = nums[0];
		int b = nums[0];
		int jump = 1;
		
		for (int i=1;i<nums.length;i++) {
			if (i == nums.length-1)
				return jump;
			a--;
			b--;
			
			if (b < nums[i]) {
				b = nums[i];
			}
			
			if (a == 0) {
				jump++;
				a = b;
			}
		}
		return jump;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int jumps = jump(nums);
		System.out.println(jumps);
	}

}
