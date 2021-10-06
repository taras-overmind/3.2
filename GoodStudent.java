package task2;

public class GoodStudent extends Student {
	public GoodStudent(String name) {
		super(name);
		this.state="Good";
	}
	@Override
	void Study() {
		Read(); Write(); Read(); Write(); Relax();
	};
}
