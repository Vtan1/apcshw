public class Driver {
    public static void main(String[] args){
	String s="victor tan";
	int space = s.indexOf(" ");
	String fname = s.substring(0,space);
	String lname = s.substring(space+1);
	System.out.println(fname);
	System.out.println(lname);
    }
}
	    