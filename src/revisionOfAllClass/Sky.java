package revisionOfAllClass;

public class Sky {
	String name;
	int age;
	byte houseNumber;
	char sex;
	boolean married;

	public Sky() {
		System.out.println("This is default constroctor");

	}
	public Sky(String name, int age, byte houseNumber, char sex, boolean married) {
		super();
		this.name = name;
		this.age = age;
		this.houseNumber = houseNumber;
		this.sex = sex;
		this.married = married;
	}
	public Sky(String name, int age, byte houseNumber, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.houseNumber = houseNumber;
		this.sex = sex;
	}
	public Sky(String name, int age, byte houseNumber) {
		super();
		this.name = name;
		this.age = age;
		this.houseNumber = houseNumber;
	}
	public int numan(int a, int b) {
		//int add = 10 + 10;
		System.out.println(a+b);
		return 0;
		
	}
	public int numan(int b, int a, int c) {
		return 0;
	}
	
	public static void main(String[] args) {
		Sky sky = new Sky();
		sky.numan(5,5);
	}

}
