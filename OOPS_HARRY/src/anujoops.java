
public class anujoops {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Ravi";
		p1.age = 15;
		
		Person p2 = new Person();
		//static keyword is access by class because now it is class type not an object type
		System.out.println(Person.count);
		
		p1.walk();
		p2.age=100;
		p2.walk();
		
	
		
		

	}
	
}
	
class Person{
		String name;
		int age;
		
		static int count;
		
		//constructor
		public Person() {
			count++;
			System.out.println( "this is basic constructor ");
			System.out.println( "this is basic constructor "+name + age);
		}
		
		void walk() {
			System.out.println("this is the name " + name + " age is "+age);
		}
	}


