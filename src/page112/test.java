package page112;
/**
 * test Student class
 * @author 2018212219
 *
 */
public class test {

	public static void main(String[] args) {
		Student StudentOne=new Student();
		Student StudentTwo=new Student("AlexanderSpears",59);
		StudentOne.setName("Kamiyarinshu");
		StudentOne.setAchievement(233);
		System.out.println(StudentOne.getName()+"'s achievements£º"+StudentOne.getAchievement());
		System.out.println(StudentTwo.getName()+"'s achievements£º"+StudentTwo.getAchievement());
		
	}

}
