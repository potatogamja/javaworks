package polymorphism;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
}

class Eagel extends Animal{
	
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
}

public class AnimalTest {
	
	public void moveAnimal(Animal animal) { //�Ű������� ������
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		Animal animal = new Animal();
		Animal human = new Human();
		Animal eagle = new Eagel();
		
		//moveAnimal() ȣ��
		aTest.moveAnimal(animal);
		aTest.moveAnimal(human);
		aTest.moveAnimal(eagle);
	}

}
