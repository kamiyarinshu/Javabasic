package page112;
/**
 * Design and test a Student class
 * @author 2018212219
 */
public class Student {
	private String name;//Create a String variable to store name
	private int achievement;//Create a integer variable to store achievement
	//Create a non-parameter constructor Student
	public Student() {
		super();
	}
	public Student(String name,int achievement) {
		this.name=name;
		this.achievement=achievement;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAchievement(int achievement) {
		this.achievement=achievement;
	}
	public int getAchievement() {
		return this.achievement;
	}
	public String getName() {
		return this.name;
	}
}