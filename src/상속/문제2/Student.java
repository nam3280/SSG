package 상속.문제2;

public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;

	public Student(String name, String subject, int fee){
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getFee() {
		return fee;
	}

	public double getReturnFee() {
		return returnFee;
	}

	public void setReturnFee(double returnFee) {
		this.returnFee = returnFee;
	}

	public boolean calcReturnFee(){
		double fee = 0;
		boolean bool = true;
		if(getSubject().equals("javaprogram"))
			fee = getFee() * 0.25;
		else if (getSubject().equals("jspprogram"))
			fee = getFee() * 0.2;
		else {
			System.out.println("그런 과정명은 없습니다.");
			bool = false;
		}

		setReturnFee(fee);

		return bool;
	}

	public void print(){
		System.out.printf("%s씨의 과정명은 %s이고 교육비는 %d이며 환급금은 %.1f입니다.",getName(),getSubject(),getFee(),getReturnFee());
	}

	public static void main(String[] args){
		Student stu = new Student("차은우", "jspprogram", 500000);
		boolean bool = stu.calcReturnFee();

		if(bool)
			stu.print();
	}
}