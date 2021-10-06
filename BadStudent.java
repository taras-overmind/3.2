package task2;

public class BadStudent extends Student {
	public BadStudent(String name) {
		super(name);
		this.state="Bad";
	}
	@Override
	void Study() {
		Relax();Relax();Relax();Relax();Read();
	};
}
