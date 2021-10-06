package task2;

public abstract class Student {
	protected String name, state;
	public Student() {};
	public Student(String name) {
		this.name=name;
		state="";
	}
	abstract void Study() ;
	void Read() {
		state+=" Read";
	};
	void Write() {
		state+=" Write";	
	};
	void Relax() {
		state+=" Relax";
	};
	public void getInfo() {
	System.out.println(name);
	}
	public void getFullInfo() {
		System.out.println(name+" "+state);
	}

}
