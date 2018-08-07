package test261;

import java.util.ArrayList;

public class ListTest04 {
	public static void main(String[] args) {
		ArrayList<Animal> aniList = new ArrayList<Animal>();
		Cat c = new Cat();
		c.setName("나비");
		System.out.print(c.getName()+ "가 ");
		c.bark();
		aniList.add(c);
		
		c = new Cat();
		c.setName("미미");
		System.out.print(c.getName()+ "가 ");
		c.bark();
		aniList.add(c);
		
		Dog d = new Dog();
		d.setName("바둑이");
		System.out.print(d.getName()+ "가 ");
		d.bark();
		aniList.add(d);
		
		d = new Dog();
		d.setName("순돌이");
		System.out.print(d.getName()+ "가 ");
		d.bark();
		aniList.add(d);
		
		for(Animal a : aniList) {
			System.out.println(a);
		}
	}
}
