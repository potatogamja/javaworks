package list;

import java.util.ArrayList;

public class DogList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		
		//������ 3���� ����
		Dog dog1 = new Dog("�鱸1","������");
		Dog dog2 = new Dog("�鱸2","��Ʈ����");
		Dog dog3 = new Dog("�鱸3","�ҵ�");
		
		
		//����
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		
		
		//���
		for(int i=0; i<dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
		
		
	}

}
