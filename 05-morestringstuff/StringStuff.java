public class StringStuff {
    public String nonStart (String a, String b) {
	String newa = a.substring(1);
	String newb = b.substring(1);
	return newa + newb;
    }

    public String makeAbba (String a, String b) {
	return a + b + b + a;
    }

    public int diff21(int n) {
	if (n > 21) {
	    return (n - 21) * 2;
	} else {
	    return 21 - n;
	}
    }
}