package bean.pac;

public class Main {
	
	public void Student(StudentBean sBean)
	{
		System.out.println(sBean.getName());
		System.out.println("amresh");
	}

	public static void main(String[] args) {
		StudentBean student=new StudentBean();
	     student.setName("Amresh Gupta");
		Main m1=new Main();
		m1.Student(student);

	}

}
