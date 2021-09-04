package customermanage;

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01; //1%
	}
	
	//�Ű� ������ �ִ� ������
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01; //1%
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	//���ʽ� ����Ʈ ���
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	//���� ���
	public String showInfo() {
		return customerName + "���� ����� " + customerGrade +
				"�̰�, ���ʽ� ����Ʈ�� " + bonusPoint + "���Դϴ�."; 
	}
	

}
