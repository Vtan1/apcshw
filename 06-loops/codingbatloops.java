public class codingbatloops {
    //5 minutes
    public String frontTimes(String str, int n) {
	if (str.length() <= 3) {
	    String x = "";
	    while (n > 0) {
		n = n - 1;
		x = x + str;
	    }
	    return x;
	} else {
	    String first = str.substring(0,3);
	    String x = "";
	    while (n > 0) {
		n = n - 1;
		x = x + first;
	    }
	    return x;
	}   
    }
    //3 minutes
    public String stringBits(String str) {
	int x = 0;
	String ans = "";
	while (x < str.length()) {
	    String letter = str.substring(x, x + 1);
	    ans = ans + letter;
	    x = x + 2;
	}
	return ans;
    }
    //20 minutes
    public String stringYak(String str) {
	String ans = "";
	int x = 0;
	while (x < str.length()) {
	    if (x+2 < str.length() && str.charAt(x) == 'y' && str.charAt(x+2) == 'k') {
		x = x + 2;
	    } else {
		ans = ans + str.charAt(x);
	    }
	    x = x + 1;
	}
	return ans;
    }
    //5 mins
    public int stringMatch(String a, String b) {
	int x = 0;
	int result = 0;
	while (x+1 < a.length() && x+1 < b.length()) {
	    String a1 = a.substring(x,x+2);
	    String b1 = b.substring(x,x+2);
	    if (a1.equals(b1)) {
		result = result + 1;
	    }
	    x = x + 1;
	}
	return result;
    }
}