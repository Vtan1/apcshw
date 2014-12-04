import java.util.*;

public class Sarray {
    String[] data; //should be object[] to store wide range of things.
    int last;

    public Sarray () {
	data = new String[10];
	last = 0;
    }

    public boolean add(String s) {
	if (size() == data.length) {
	    String[] ans = new String[data.length + 1];
	    for (int x = 0; x < data.length; x ++) {
		ans[x] = data[x];
	    }
	    ans[data.length] = s;
	    data = ans;
	    last += 1;
	} else {
	    data[last] = s;
	    last += 1;
	}
	return true;
    }
    
    public void add(int index, String s) {
        String[] ans = new String[last + 1];
	for (int x = 0;x < ans.length;x++) {
	    if (x < index) {
		ans[x] = data[x];
	    } else if (x == index) {
		ans[x] = s;
	    } else {
		ans[x] = data[x - 1];
	    }
	}
	last += 1;
	data = ans;
    }
    
    public int size() {
	return last;
    }

    public String get(int index) {
	return data[index];
    }

    public String set(int index, String s) {
	String ans = data[index];
	data[index] = s;
	return ans;
    }

    public String remove(int index) {
	String[] ans = new String[size() - 1];
	String old = "";
	for (int i = 0; i < ans.length; i ++) {
	    if (i < index) {
		ans[i] = data[i];
	    } else if (i > index) {
		ans[i] = data[i + 1];
	    } else {
		old = ans[i];
	    }
	}
	last -= 1;
	data = ans;
	return old;
    }
    //insertion sort
    public void toShift(int pos, String newvalue) {
	int i;
	for (i = pos; i > 0 && newvalue.compareTo(data[i-1]) < 0 ; i--) {
	    data[i] = data[i-1];    
	}
	data[i]=newvalue;
    }
    //insertion sort
    public void isort() {
	for (int x = 1; x <= last;x++) {
	    toShift(x, data[x]);
	}
    }
    //selection sort
    public void sSort() {
	String min;
	int index = 0;
	for (int y = 0; y < last; y++) {
	    for (int x = 0; x < last;x++) {
		if (data[x].compareTo(data[x+1]) > 0) {
		    min = data[x+1];
		    index = x+1;
		}
	    }
	    data[y] = data[index];
	    data[index] = data[y];
	    min = "";
	}
    }	
}

    /*
      add(int i) adds to end
      add(int index, int i) adds to location index and shift things down
      get(int index)
      set(int index, index i)
      size()
      remove(int index) shift things over to the left when you remove
    */
