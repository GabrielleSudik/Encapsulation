//encapsulation is basically
//public private protected continued
//why we use them...

class Plant {
	
	private String name;
	//why make it private?
	//to stop anyone outside of the class from tinkering with its elements
	//instead, you allow people to access the stuff another way
	//usually getters and setters
	//which are methods that allow access to private data
	//you can create them in Eclipse via source -- generate Gs and Ss.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//even when stuff inside the class changes,
	//these public methods allow others to keep working with it.
	
	public static final int id = 7;
	//here's another way to keep a "variable" from changing from outside the class.
	//make it a constant! (final)
	
	public String getData() {
		String data = "Some text here";
		return data;
	}
	
	private int calculateGrowth() {
		return 9;
	}
	
	//in general:
	//if you can, make it private
	//next, make it protected for child classes
	//make public only what you want users to tinker with
	
}

public class Application {

	public static void main(String[] args) {
		
	}
}
