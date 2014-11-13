import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	//makes ordered array list
	ArrayList<Integer> ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 10; i ++) {
	    ai.add(i);
	}
	System.out.println(ai);
	//randomizes array list
	ArrayList<Integer> al = new ArrayList<Integer>();
	for (int i = 10; i > 0; i --) {
	    int x = r.nextInt(i);
	    al.add(ai.get(x));
	    ai.remove(x);
	}
	System.out.println(al);
	//makes ordered array
	int[] a = new int[10];
	for(int i = 0;i < 10; i ++) {
	    a[i] = i;
	}
	//makes randomized array
    }
}
