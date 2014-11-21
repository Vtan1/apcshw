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
	if (c+w.length()<=board[r].length && r < board.length && c < board[r].length){
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
	if (c-w.length()>=-1 && row > 0 && col > 0){
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
	if (r+w.length()<=board.length && r < board.length && c < board[r].length){
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
	if (r-w.length()>=-1 && r > 0 && c > 0){
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

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWordHR("hello",3,25);
	w.addWordHR("look",3,22);
	w.addWordHL("look",10,3);
     	w.addWordHL("look",3,5);
	//w.addWordH("hello",100,5);
	//w.addWordH("hello",30,555);
	w.addWordVD("howdy",15,1);
	System.out.println(w);
    }
}
