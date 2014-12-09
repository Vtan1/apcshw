import java.io.*;
import java.util.*;

class Interval {

    private int low,high;
    private Random r = new Random();				
    private static int numIntervals = 0;
		
    public Interval(int l, int h){
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }
		
    public Interval() {
	int l = r.nextInt(100);
	int h = l + 1 + r.nextInt(100);
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }

    public String toString() {
	//String s = "Inteval: "+numIntervals+": "+ "["+low+","+high+"]";
	String s = "["+low+","+high+"]";

	return s;
    }
    
    public int compareTo(Interval other) {
	if (this.low > other.low) {
	    return 1;
	} else if (this.low < other.low) {
	    return -1;
	} else {
	    if (this.high > other.high) {
		return 1;
	    } else if (this.high < other.high) {
		return -1;
	    } else {
		return 0;
	    }
	}   
    }

    public static void printstuff() {
	System.out.println("Stuff");
    }
    public static void main(String[] args) {

	Interval ival = new Interval(4,4);
	Interval ival2 = new Interval(4,5);
	System.out.println(ival.compareTo(ival2));
	ival.printstuff(); // normal calling off of an instance
	printstuff(); // since printStuff is static we can call it without an instance
	Interval.printstuff(); // we can also call it right off a class

	Interval[] a = new Interval[10];
	for (int i = 0; i < a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println(Arrays.toString(a));
    }
}
