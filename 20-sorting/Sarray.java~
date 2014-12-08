import java.util.*;

public class Sarray {
    String[] data; //should be object[] to store wide range of things.
    int last;

    public Sarray () {
	data = new String[10];
	last = 0;
    }

    public Sarray(int len, String[] array) {
	data = new String[len];
	for (int i = 0; i < array.length; i++) {
	    data[i] = array[i];
	}
	last = array.length - 1;
	for (int y = last; y < len; y++) {
	    data[y] = "";
	}
    }

    public String toString() {
	String array = "{";
	for (int i = 0; i < data.length; i++) {
	    array+= data[i] + ",";
	}
	array+= "}";
	return array;
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

    public void isort() {
	for (int x = 1; x <= last;x++) {
	    toShift(x, data[x]);
	}
    }
    //selection sort
    public int indexfinderino(int upTo) {
	int index = 0;
	for (int i = 1;i <= upTo;i++) {
	    if (data[index].compareTo(data[i]) < 0) {
	    index = i;
	    }
	}
	return index;
    }

    public void ssort() {
	for (int x = last;x >= 0; x --) {
	    String biggest = data[indexfinderino(x)];
	    int indexbig = indexfinderino(x);
	    data[indexbig] = data[x];
	    data[x] = biggest;
	}
    }

    // The run times for selection and insertion sort are approximately the same
    // Both are approximately n^2 operations each (loop within a loop)
    
    //bubble sort
    public void bsort() {
	boolean keepgoing = true;
	while (keepgoing) {
	    int numSwaps = 0;
	    for (int i = 0; i < last;i++) {
		if (data[i].compareTo(data[i+1]) > 0) {
		    String temp = data[i];
		    data[i] = data[i+1];
		    data[i+1] = temp;
		    numSwaps++;
		}
	    }
	    if (numSwaps == 0) {
		keepgoing = false;
	    }
	}
    }
    
    //Bubble sort becomes very inefficient once the length of the array gets
    //larger because you need to do many more operations.

    public void builtin() {
	/* This sorts the whole array, but if you only want to sort part of it,
	   you should write Arrays.sort(data,0,n) where n is the index beyond
	   the stopping point.
	*/
	Arrays.sort(data);
	// Would use Collections.sort(list) for ArrayList.
    }
    
    public static void main(String[] args) {
	String[] blah = {"ding","dong","swing","swig","carol","hearts",
			 "convivial","penury","regicide","cadence","misogamy",
			 "candor","fuddle","repulsion","wisenheimer","iris"};
	Sarray s = new Sarray(20,blah);
	System.out.println(s);
	s.builtin();
	System.out.println(s);
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
