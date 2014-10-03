public class Shapes {
    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
    //25 minutes
    public String tri1(int a){
	String ans = "";
	int x = 0; //counts stars
	int c = 1; //counts rows
	while (a >= c){
	    while (c > x) {
		ans = ans + "*";
		x = x + 1;
	    }
	    ans = ans + "\n";
	    c = c + 1;
	    x = 0;
	}
	return ans;
    }
    // 20 minutes
    public String tri2(int a){
	String ans = "";
	int x = 0; //counts stars
	int c = 1; //counts rows
	int s = 0; //counts spaces
	while (a >= c){
	    while (c > x){
		while (a - c > s){
		    ans = ans + " ";
		    s = s + 1;
		}
		ans = ans + "*";
		x = x + 1;
	    }
	    ans = ans + "\n";
	    c = c + 1;
	    s = 0;
	    x = 0;
	}
	return ans;
    }
    public String tri3(int h){
	int stars = 1;
	int row = 1;
	int last = 2*h - 1;
	int space = 0;
	String ans = "";
	while (h>=row) {
	    while (stars <= last){
		while (((last - stars)/2)>=0){
	
    	
}
