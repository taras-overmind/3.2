package task2;

public class Programm {

	public static void main(String[] args) {
		Student s1= new GoodStudent("Biba");
		Student s2=new BadStudent("Boba");
		Group gr=new Group("k25");
		gr.addStudent(s1);
		gr.addStudent(s2);
		gr.getInfo();
		gr.getFullInfo();
		s1.Study();
		s2.Study();
		gr.getInfo();
		gr.getFullInfo();

	}

}
