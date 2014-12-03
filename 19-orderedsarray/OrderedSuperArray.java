import java.util.*;

public class OrderedSuperArray extends Sarray {
    
    public OrderedSuperArray() {
	super();
    }

    public int place(String s) {
	int index = data.length;
	for (int i = 0; i < data.length;i++) {
	    if (data[i] == null || s.compareTo(data[i]) <= 0) {
		index = i;
		break;
	    }
	}
	return index;
    }

    public boolean add(String s) {
	super.add(place(s),s);
	return true;
    }

    public String set(int index, String s) {
	String ans = data[index];
	super.remove(index);
	add(s);
	return ans;
    }

    public static void main(String[] args) {
	OrderedSuperArray osa = new OrderedSuperArray();
	System.out.println(osa.add("Hello"));
    }
}
