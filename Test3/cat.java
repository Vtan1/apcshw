public class cat extends pet {
    public Cat(String name) {
	super(name);
	//calls super's constructor with (name)
    }

    public String speak() {
	return "meow";
    }
}

public class loudDog extends pet {
    public String speak() {
	return super.speak() + " " + super.speak();
    }
}

//Kennel

for (int i = 0;i < petList.length;i++) {
    System.out.println(petList[i].getName() + ": " + petList[i].speak())
	}
