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
		System.out.println("Name: " + name + ", Age: " + age + ", House Number: " + houseNumber + ", Sex: " + sex
				+ ", Married: " + married);
	}

	public static void main(String[] args) {
		Sky sky1 = new Sky();
		Sky sky2 = new Sky("Numan", 29, (byte) 41, 'M', true);

	}
	

}
