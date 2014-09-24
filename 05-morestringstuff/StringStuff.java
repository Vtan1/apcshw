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

   public boolean nearHundred(int n) {
       if (Math.abs(n - 100) <= 10) {
	   return true;
       } else if (Math.abs(n-200) <= 10) {
	   return true;
       } else {
	   return false;
       }
   }
    public int teaParty(int tea, int candy) {
	if (tea < 5 || candy < 5) {
	    return 0;
	} else if (tea >= 2 * candy || candy >= 2*tea) {
	    return 2;
	} else {
	    return 1;
	}
    }
    public boolean lastDigit(int a, int b, int c) {
	if(a%10 == b%10 || a%10 == c%10 || b%10 == c%10) {
	    return true;
	}
	else {
	    return false;
	}
    }
}
