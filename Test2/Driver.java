public class Driver {
    public static void main(String[] args) {
	Complex c1 = new Complex(3,4);
	System.out.println(c1);
	System.out.println(c1.norm());
	System.out.println("hello" + 123.45);
	System.out.println(123.45 + "hello");
	int i = Integer.parseInt("12345");
	double d = Double.parseDouble("123.45");
	System.out.println("Doin something");
	
	try {
	    Thread.sleep(2000);
	    //waits 2000 ms, or 2 seconds
	} catch (Exception e) {}

	System.out.println("Did it");
    }
}
