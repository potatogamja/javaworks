package customers;

public class VIPTest {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		VipCustomer vip1 = new VipCustomer();
		
		c1.setCustomerName("�Ż��Ӵ�");
		vip1.setCustomerName("�̼���");
		vip1.setAgentId(123);
		
		//���ʽ� ����Ʈ ���
		int price = 10000;
		price = vip1.calcPrice(price);
		
		//�������
		System.out.println(c1.showInfo());
		System.out.println("���� ������ " + price);
		System.out.println(vip1.showInfo());
	}

}
