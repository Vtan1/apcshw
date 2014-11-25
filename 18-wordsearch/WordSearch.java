import java.io.*;
import java.util.*;

public class WordSearch{

    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }

    public WordSearch(){
	this(20,30);
    }

    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void addWordHR(String w,int row, int col){
	int r = row, c = col;
	int orig = col;
	boolean work = true;
	if (c+w.length()<=board[0].length && r < board.length && c < board[0].length && r > 0 && c > 0){
	    for (int i=0;i<w.length();i++){
		if (work) {
		    if (board[r][c] == '.') {
			//board[r][c] = w.charAt(i);
			c++;
		    } else {
			if (!(board[r][c] == w.charAt(i))) {
			    System.out.println(w + " encountered a different word while going forwards horizontally.");
			    work = false;
			} else {
			    c++;
			}
		    }
		}
	    }
	    c = orig;
	    if (work) {
		 for (int i=0;i<w.length();i++){
		      if (board[r][c] == '.') {
			board[r][c] = w.charAt(i);
			c++;
		      } else {
			  if (board[r][c] == w.charAt(i)) {
			      c++;
			  }
		      }
		 }
	    }
	} else {
	    System.out.println(w + " is out of bounds.");
	}
    }

     public void addWordHL(String w,int row, int col){
	int r = row, c = col;
	int orig = col;
	boolean work = true;
	if (c-w.length()>=-1 && row >= 0 && col >= 0 && r < board.length && c < board[0].length){
	    for (int i=0;i<w.length();i++){
		if (work) {
		    if (board[r][c] == '.') {
			//board[r][c] = w.charAt(i);
			c--;
		    } else {
			if (!(board[r][c] == w.charAt(i))) {
			    System.out.println(w + " encountered a different word while going backwards horizontally.");
			    work = false;
			} else {
			    c--;
			}
		    }
		}
	    }
	    c = orig;
	    if (work) {
		 for (int i=0;i<w.length();i++){
		      if (board[r][c] == '.') {
			board[r][c] = w.charAt(i);
			c--;
		      } else {
			  if (board[r][c] == w.charAt(i)) {
			      c--;
			  }
		      }
		 }
	    }
	} else {
	    System.out.println(w + " is out of bounds.");
	}
    }

    public void addWordVD(String w,int row, int col){
	int r = row, c = col;
	int orig = row;
	boolean work = true;
	if (r+w.length()<=board.length && r < board.length && c < board[0].length && row >= 0 && col >= 0){
	    for (int i=0;i<w.length();i++){
		if (work) {
		    if (board[r][c] == '.') {
			//board[r][c] = w.charAt(i);
			r++;
		    } else {
			if (!(board[r][c] == w.charAt(i))) {
			    System.out.println(w + " encountered a different word while going forwards vertically.");
			    work = false;
			} else {
			    r++;
			}
		    }
		}
	    }
	    r = orig;
	    if (work) {
		 for (int i=0;i<w.length();i++){
		      if (board[r][c] == '.') {
			board[r][c] = w.charAt(i);
			r++;
		      } else {
			  if (board[r][c] == w.charAt(i)) {
			      r++;
			  }
		      }
		 }
	    }
	} else {
	    System.out.println(w + " is out of bounds.");
	}
    }

    public void addWordVU(String w,int row, int col){
	int r = row, c = col;
	int orig = row;
	boolean work = true;
	if (r-w.length()>=-1 && r >= 0 && c >= 0 && r < board.length && c < board[0].length){
	    for (int i=0;i<w.length();i++){
		if (work) {
		    if (board[r][c] == '.') {
			//board[r][c] = w.charAt(i);
			r--;
		    } else {
			if (!(board[r][c] == w.charAt(i))) {
			    System.out.println(w + " encountered a different word while going backwards vertically.");
			    work = false;
			} else {
			    r--;
			}
		    }
		}
	    }
	    r = orig;
	    if (work) {
		 for (int i=0;i<w.length();i++){
		      if (board[r][c] == '.') {
			board[r][c] = w.charAt(i);
			r--;
		      } else {
			  if (board[r][c] == w.charAt(i)) {
			      r--;
			  }
		      }
		 }
	    }
	} else {
	    System.out.println(w + " is out of bounds.");
	}
    }

     public void addWordDDL(String w,int row, int col){
	int r = row, c = col;
	int orig = row;
	int orig2 = col;
	boolean work = true;
	if (c-w.length()>=-1 && r >= 0 && c >= 0 && r+w.length()<=board.length && r < board.length && c < board[0].length){
	    for (int i=0;i<w.length();i++){
		if (work) {
		    if (board[r][c] == '.') {
			//board[r][c] = w.charAt(i);
			r++;
			c--;
		    } else {
			if (!(board[r][c] == w.charAt(i))) {
			    System.out.println(w + " encountered a different word while going backwards and down diagonally.");
			    work = false;
			} else {
			    r++;
			    c--;
			}
		    }
		}
	    }
	    r = orig;
	    c = orig2;
	    if (work) {
		 for (int i=0;i<w.length();i++){
		      if (board[r][c] == '.') {
			board[r][c] = w.charAt(i);
			r++;
			c--;
		      } else {
			  if (board[r][c] == w.charAt(i)) {
			      r++;
			      c--;
			  }
		      }
		 }
	    }
	} else {
	    System.out.println(w + " is out of bounds.");
	}
    }

    public void addWordDDR(String w,int row, int col){
	int r = row, c = col;
	int orig = row;
	int orig2 = col;
	boolean work = true;
	if (c+w.length()<=board[0].length && r >= 0 && c >= 0 && r+w.length()<=board.length && r < board.length && c < board[0].length){
	    for (int i=0;i<w.length();i++){
		if (work) {
		    if (board[r][c] == '.') {
			//board[r][c] = w.charAt(i);
			r++;
			c++;
		    } else {
			if (!(board[r][c] == w.charAt(i))) {
			    System.out.println(w + " encountered a different word while going forwards and down diagonally.");
			    work = false;
			} else {
			    r++;
			    c++;
			}
		    }
		}
	    }
	    r = orig;
	    c = orig2;
	    if (work) {
		 for (int i=0;i<w.length();i++){
		      if (board[r][c] == '.') {
			board[r][c] = w.charAt(i);
			r++;
			c++;
		      } else {
			  if (board[r][c] == w.charAt(i)) {
			      r++;
			      c++;
			  }
		      }
		 }
	    }
	} else {
	    System.out.println(w + " is out of bounds.");
	}
    }

    public void addWordDUL(String w,int row, int col){
	int r = row, c = col;
	int orig = row;
	int orig2 = col;
	boolean work = true;
	if (c-w.length()>=-1 && r >= 0 && c >= 0 && r-w.length()>=-1 && r < board.length && c < board[0].length){
	    for (int i=0;i<w.length();i++){
		if (work) {
		    if (board[r][c] == '.') {
			//board[r][c] = w.charAt(i);
			r--;
			c--;
		    } else {
			if (!(board[r][c] == w.charAt(i))) {
			    System.out.println(w + " encountered a different word while going backwards and up diagonally.");
			    work = false;
			} else {
			    r--;
			    c--;
			}
		    }
		}
	    }
	    r = orig;
	    c = orig2;
	    if (work) {
		 for (int i=0;i<w.length();i++){
		      if (board[r][c] == '.') {
			board[r][c] = w.charAt(i);
			r--;
			c--;
		      } else {
			  if (board[r][c] == w.charAt(i)) {
			      r--;
			      c--;
			  }
		      }
		 }
	    }
	} else {
	    System.out.println(w + " is out of bounds.");
	}
    }

    public void addWordDUR(String w,int row, int col){
	int r = row, c = col;
	int orig = row;
	int orig2 = col;
	boolean work = true;
	if (c+w.length()<=board[0].length && r >= 0 && c >= 0 && r-w.length()>=-1 && r < board.length && c < board[0].length){
	    for (int i=0;i<w.length();i++){
		if (work) {
		    if (board[r][c] == '.') {
			//board[r][c] = w.charAt(i);
			r--;
			c++;
		    } else {
			if (!(board[r][c] == w.charAt(i))) {
			    System.out.println(w + " encountered a different word while going forwards and up diagonally.");
			    work = false;
			} else {
			    r--;
			    c++;
			}
		    }
		}
	    }
	    r = orig;
	    c = orig2;
	    if (work) {
		 for (int i=0;i<w.length();i++){
		      if (board[r][c] == '.') {
			board[r][c] = w.charAt(i);
			r--;
			c++;
		      } else {
			  if (board[r][c] == w.charAt(i)) {
			      r--;
			      c++;
			  }
		      }
		 }
	    }
	} else {
	    System.out.println(w + " is out of bounds.");
	}
    }

    public void addWord(String w) {
	Random R = new Random();
	int RandomCall = R.nextInt(8);
	Random r = new Random();
	int randomc = r.nextInt(30);
	int randomr = r.nextInt(20);
	if (RandomCall == 0){
	    addWordHR(w,randomr,randomc);
	    //return true;
	} else if (RandomCall == 1){
	    addWordHL(w,randomr,randomc);
	    //return true;
	} else if (RandomCall == 2){
	    addWordVD(w,randomr,randomc);
	    //return true;
	} else if (RandomCall == 3){
	    addWordVU(w,randomr,randomc);
	    //return true;
	} else if (RandomCall == 4){
	    addWordDDL(w,randomr,randomc);
	    //return true;
	} else if (RandomCall == 5){
	    addWordDDR(w,randomr,randomc);
	    //return true;
	} else if (RandomCall == 6){
	    addWordDUR(w,randomr,randomc);
	    //return true;
	} else {
	    addWordDUL(w,randomr,randomc);
	    //return true;
	}
    }

    public void fillUp() {
	char[] s = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	Scanner sc = null;
	try {
	    sc = new Scanner(new File("Words.txt"));
	} catch (Exception e) {
	    System.out.println("Can't open file");
	    System.exit(0);
	}
	while (sc.hasNext()) {
	    String x = sc.next();
	    addWord(x);
	}
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		if (board[i][j] == '.') {
		    Random r = new Random();
		    int random = r.nextInt(26);
		    board[i][j] = s[random];
		}
	    }
	}
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	/*
	w.addWordHR("hello",1,25);
	w.addWordHR("look",3,22);
	w.addWordHL("look",1,20);
	w.addWordHL("look",3,5);
	w.addWordVD("howdy",0,18);
	w.addWordDDL("swag",0,3);
	w.addWordDDR("swoosh",14,24);
	w.addWordDUL("tan",10,12);
	w.addWordDUR("tan",10,10);
	w.addWord("adding");
	*/
	w.fillUp();
	System.out.println(w);
    }
}
