package taketrans;

public class Bus {
	int busNum; //���� ��ȣ
	int passenger; // �°� ��
	int money; // ����
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	//����� �¿��
	public void take(int money) {
		this.money += money;  //��� ����
		passenger++; //�°� �� 1 ����
	}
	
	//���� ���
	public void showInfo() {
		System.out.println(busNum + "�� ������ ������ " + money
				+ "���̰�, �°� ���� " + passenger + "�� �Դϴ�.");
	}

}
