public class Driver {
    public static void main(String[] args) {
	public int sum13(int[] nums) {
	    int sum = 0;
	    for (int i = 0;i < nums.length;i++) {
		if (nums[i] < 13) {
		    sum = sum + nums[i];
		} else {
		    i = i + 1;
		}
	    }
	    return sum;
	}
	
	public int[] frontPiece(int[] nums) {
	    int[] ans;
	    if (nums.length < 2) {
		ans = new int[nums.length];
	    } else {
		ans = new int[2];
	    }
	    for (int i = 0; i < 2 && i < nums.length; i++) {
		ans[i] = nums[i];
	    }
	    return ans;
	}
    }
}
