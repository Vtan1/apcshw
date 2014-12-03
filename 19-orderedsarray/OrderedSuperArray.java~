import java.util.*;

public class OrderedSuperArray extends Sarray {
    /*
    public OrderedSuperArray() {
	data = {"hello", "groovy"};
	last = 0;
    }
    */
    public void add1(String s) {
	String[] ans = new String[data.length + 1];
	for (int x = 0; x < data.length;x++) {
	    for (int y = 0; y < data[x].length();y++) {
		if (data[x].charAt(y) > s.charAt(y)) {
		    add(y,s);
		}
	    }
	}
    }
    public static void main(String[] args) {
	OrderedSuperArray osa = new OrderedSuperArray();
	osa.add1("hi");
	System.out.println(osa);
    }
}
