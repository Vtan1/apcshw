public class Frame {
    public String stringSplosion(String str) {
	String ans = "";
	for (int x = 1; x <= str.length(); x++) {
	    ans = ans + str.substring(0,x);
	}
	return ans;
    }
    public String stringX(String str) {
	String ans = "";
	for (int i = 0; i < str.length(); i++) {
	    if (!(i > 0 && i < (str.length()-1) && str.substring(i,i+1).equals("x"))) {
		ans = ans + str.substring(i,i+1);
	    }
	}
	return ans;
    }
    public String frame(int a, int b){
	String ans = "";
	for (int i = 0; i < a; i++) {
	    for (int x = 0; x < b; x++) {
		if ((x == 0 || x == (b - 1))||(i == 0 ||i == (a-1))) {
		    ans = ans + "*";
		} else {
		    ans = ans + " ";
		}
	    }
	    ans = ans + "\n";
	}
	return ans;
    }
}