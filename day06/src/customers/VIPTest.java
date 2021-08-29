package customers;

public class VIPTest {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		VipCustomer vip1 = new VipCustomer();
		
		c1.setCustomerName("신사임당");
		vip1.setCustomerName("이순신");
		vip1.setAgentId(123);
		
		//보너스 포인트 계산
		int price = 10000;
		price = vip1.calcPrice(price);
		
		//정보출력
		System.out.println(c1.showInfo());
		System.out.println("구매 가격은 " + price);
		System.out.println(vip1.showInfo());
	}

}
