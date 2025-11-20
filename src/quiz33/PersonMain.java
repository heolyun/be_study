package quiz33;

public class PersonMain {
	// 13.
    public void printName(Person p) {
        System.out.println("이름: " + p.name);
    }
    public static Person createP(String name, int age) {
        Person p = new Person();
        p.name = name;
        p.age = age;
        return p;
    }
    public static void increase(Person p) {
        p.age++;
    }
    

	public void main(String[] args) {
		// 11.
        Person p1 = new Person();
        p1.name = "허륜";
        p1.age = 29;
        System.out.println("11. " + p1.name + ", " + p1.age);

        // 12. 
        System.out.print("12. ");
        p1.hello();

        // 13. 
        System.out.print("13. ");
        printName(p1);
        //14.
        Person p2 = createP("유영광", 27);
        System.out.println("14. 새로운 사람: " + p2.name + ", " + p2.age);
        //15.
        System.out.print("15. 나이가 더 많은 사람: ");
        Person older = (p1.age > p2.age) ? p1 : p2;
        System.out.println(older.name + " (" + older.age + ")");
        // 16.
        System.out.println("16. 나이 증가 전: " + p1.age);
        increase(p1);
        System.out.println("    나이 증가 후: " + p1.age);


	}

}
