import java.util.*;

public class Sarray {
    int[] data; //should be object[] to store wide range of things.
    int last;

    public Sarray () {
	data = new int[10];
	last = 0;
    }

    public boolean add(int i) {
	if (size() == data.length) {
	    int[] ans = new int[data.length + 1];
	    for (int x = 0; x < data.length; x ++) {
		ans[x] = data[x];
	    }
	    ans[data.length] = i;
	    data = ans;
	    last += 1;
	} else {
	    data[last] = i;
	    last += 1;
	}
	return true;
    }

    public void add(int index, int i) {
	int[] ans = new int[last + 1];
	for (int x = 0;x < ans.length;x++) {
	    if (x < index) {
		ans[x] = data[x];
	    } else if (i == index) {
		ans[x] = i;
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

    public int get(int index) {
	return data[index];
    }

    public int set(int index, int i) {
	int ans = data[index];
	data[index] = i;
	return ans;
    }

    public int remove(int index) {
	int[] ans = new int[size() - 1];
	int old = 0;
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
}
    /*
      add(int i) adds to end
      add(int index, int i) adds to location index and shift things down
      get(int index)
      set(int index, index i)
      size()
      remove(int index) shift things over to the left when you remove
    */
