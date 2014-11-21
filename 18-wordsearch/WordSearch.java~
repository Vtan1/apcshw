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
	if (c+w.length()<=board[r].length && r < board.length && c < board[r].length){
	    for (int i=0;i<w.length();i++){
		if (board[r][c] == '.') {
		    board[r][c] = w.charAt(i);
		    c++;
		} else {
		    if (board[r][c] == w.charAt(i)) {
			c++;
		    } else {
			System.out.println(w + " encountered a different word while going forwards horizontally.");
		    }
		}	
	    }
	} else {
	    System.out.println(w + "is out of bounds.");
	}
    }
    public void addWordHL(String w,int row, int col){
	int r = row, c = col;
	if (c-w.length()>=0 && row > 0 && col > 0){
	    for (int i=0;i<w.length();i++){
		if (board[r][c] == '.') {
		    board[r][c] = w.charAt(i);
		    c--;
		} else {
		    if (board[r][c] == w.charAt(i)) {
			c--;
		    } else {
			System.out.println(w + " encountered a different word while going backwards horizontally.");
		    }
		}	
	    }
	} else {
	    System.out.println(w + " is out of bounds.");
	}
    }
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	//System.out.println(w);
	w.addWordHR("hello",3,25);
	w.addWordHR("look",3,8);
	w.addWordHL("look",3,1);
     	w.addWordHL("look",3,5);
	//w.addWordH("hello",100,5);
	//w.addWordH("hello",30,555);
	System.out.println(w);
    }
}
