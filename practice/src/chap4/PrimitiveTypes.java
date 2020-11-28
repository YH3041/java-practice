package chap4;

public class PrimitiveTypes {
	byte age;
	String name;
	boolean isMarried;	
	
	public static void main(String args[]) {
		
		PrimitiveTypes p1 = new PrimitiveTypes();
		
		p1.setAge((byte) 26);
		p1.setName("lee");
		p1.setMarried(false);
		
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		System.out.println(p1.isMarried());
		
	}
	
	//메소드
	//age
	public void setAge(byte age) {
		this.age = age;
	}
	
	public byte getAge() {
		return age;
	}
	
	//name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//married
	public void setMarried(boolean Married) {
		isMarried = Married;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
}
