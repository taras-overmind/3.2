
package task2;
import java.util.List;
import java.util.ArrayList;

public class Group {
	private String name;
	private List <Student> students= new ArrayList<>(3);	
	public Group(String name) {
		this.name=name;
	
		
	};
	public void addStudent (Student st) {
		this.students.add(st);
	}
	public void getInfo() {
		System.out.println(name);
		for (int i=0; i<this.students.size(); i++) {
			students.get(i).getInfo();
		}
	}
	public void getFullInfo() {
		System.out.println(name);
		for (int i=0; i<this.students.size(); i++) {
			students.get(i).getFullInfo();
		}
	}

}
