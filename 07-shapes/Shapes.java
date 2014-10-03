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
	int space = h-1;
	String ans = "";
	while (h>=row) {
	    int x = 2*row -1;
	    int space2 = space;
	    while (space2 > 0){
		ans = ans + " ";
		space2 = space2 - 1;
	    }
	    space = space - 1;
	    while (x > 0){
		ans = ans + "*";
		x = x - 1;
	    }
	    row = row + 1;
	    ans = ans + "\n";
	}
	return ans;
    }
    public String tri3ud(int h){
	int row = h-1;
	String ans = "";
	while (row >= 0) {
	    int stars = 2*row + 1;
	    int space = h - row;
	    while (space > 0){
		ans = ans + " ";
		space = space - 1;
	    }
	    while (stars > 0){
		ans = ans + "*";
		stars = stars - 1;
	    }
	    row = row - 1;
	    ans = ans + "\n";
	}
	return ans;
    }
    public String diamond(int h){
	int x = h/2;
	return tri3(x+1) + tri3ud(x);
    }
    public String tri4(int h){
	String ans = "";
	int rows = 0;
	while (rows < h){
	    int space = h;
	    int stars = h;
	    while (space > (h - rows)){
		ans = ans + " ";
		space = space - 1;
	    }
	    while (stars > rows){
		ans = ans + "*";
		stars = stars - 1;
	    }
	    ans = ans + "\n";
	    rows = rows + 1;
	}
	return ans;
    }
}
