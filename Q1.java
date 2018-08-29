interface Animals
{
	void speak();
	void eat();
}

class Cat implements Animals
{
	public void speak()
	{
		System.out.println("I am a Cat");
	}
	public void eat()
	{
		System.out.println("cat eating food");
	}
}
class Dog implements Animals
{
	public void speak()
	{
		System.out.println("I am a dog");
	}
	public void eat()
	{
		System.out.println("dog eating food");
	}
}
class Q1
{
	public static void main(String[] x)
	{
		Dog d = new Dog();
		Cat c = new Cat();
		
		c.speak();
		c.eat();
		
		d.speak();
		d.eat();
	}
}