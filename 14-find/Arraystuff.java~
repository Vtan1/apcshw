import java.util.*;

public class Arraystuff {
    /*-------------------- Instance Variables --------------------*/

    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment 
    */
    public final int final_example = 123;

    /*-------------------- Constructors --------------------*/
    
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    public Arraystuff() {
	this(100);
    }

    /*-------------------- Methods --------------------*/
    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }
    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	//System.out.println(as);
	//System.out.println(as.find(100));
	//System.out.println(as.maxVal());
	//System.out.println(as.freq(17));
    }
    public int find(int n){
	int ans = -1;
	for (int i = 0; i < a.length && ans == -1; i++) {
	    if (a[i] == n){
		ans = i;
		break;
		//Gets out of loop instantly.
	    }
	}
	return ans;
    }
    public int maxVal(){
	int ans = 0;
	for (int i = 0;i < a.length;i++){
	    if (a[i] > ans){
		ans = a[i];
	    }
	}
	return ans;
    }
    public int freq(int i) {
	int counter = 0;
	int answer = a[i];
	int freq = 0;
	while (counter < a.length) {
	    if (a[counter] == a[i]){
		freq = freq + 1;
	    }
	    counter++;
	}
	return freq;
    }
    public int sum67(int[] nums) {
	int sum = 0;
	for (int i = 0;i < nums.length;i++) {
	    if (nums[i] == 6) {
		while (nums[i] != 7) {
		    i++;
		}
	    } else {
		sum = sum + nums[i];
	    }
	}
	return sum;
    }
    public boolean more14(int[] nums) {
	int fours = 0;
	int ones = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 4) {
		fours++;
	    } else if (nums[i] == 1 ){
		ones++;
	    }
	}
	return ones > fours;
    }
    public int[] tenRun(int[] nums) {
	int temp = 1;
	for (int i = 0; i < nums.length;i++) {
	    if (nums[i] % 10 == 0) {
		temp = nums[i];
	    } else if (temp % 10 == 0) {
		nums[i] = temp;
	    }
	}
	return nums;
    }
    public boolean tripleUp(int[] nums) {
	for (int i = 0; i + 2 < nums.length; i++) {
	    if (nums[i] + 1 == nums[i + 1] && nums[i] + 2 == nums[i + 2]) {
		return true;
	    }
	}
	return false;
    }
    public boolean canBalance(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
	    int sum1 = 0;
	    int sum2 = 0;
	    for (int x = 0; x < i; x ++) {
		sum1 = sum1 + nums[x];
	    }
	    for (int x = i; x < nums.length; x ++) {
		sum2 = sum2 + nums[x];
	    }
	    if (sum1 == sum2) {
		return true;
	    }
	}
	return false;
    }
    //I took part of the code from Nicholas.
    /*public int[] seriesUp(int n) {
	int[] ans = new int[n*(n+1)/2];
	for (int terms = 0;terms < n;terms++){
	    int x = terms * (terms+1)/2;
	    for (int i = 0; i <= terms; i++){
		ans[x] = i + 1;
		x++;
	    }
	}
	return ans;
    }
    */
    public int [] seriesUp(int n) {
	int[] ans = new int[n*(n+1)/2];
	int i = 0;
	for (int terms = 1;terms <= n;terms ++) {
	    for (int x = 1;x <=terms;x++,i++){
		ans[i]=x;
	    }
	}
	return ans;
    }
}
/*
public int[] seriesUp(int n) {
    int[] out = new int[(n*(n + 1)/2)];
    int a = 1;
    int ind = 0;
    while (ind < out.length) {
	for (int k = 1; k <= a; k ++) {
	    out[ind] = k;
	    ind ++;   
	}
	a++;
    }
    return out;
}
*/
