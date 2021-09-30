package example1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person = new Person();
		//tenemos acceso a los metodos de la
		//clase object 
//		person.equals(person);
//		Student student = new Student("Maria", "Loredo", "23454354");
//		student.setName("Maria");
//		student.setAddress("Ciudad Satelite, av. Murillo");
//		student.progranMatters();
		Point3d points = new Point3d(1.2, 2.5, 6.9);
		System.out.println(points.getPoints());
		Point3d points2 = new Point3d(1.7, 2.1, 4.9);
		System.out.println(points2.getPoints());
		System.out.println(points.toString());
		System.out.println(points2.toString());
	}

}
