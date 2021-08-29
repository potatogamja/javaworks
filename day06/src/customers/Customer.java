package customers;

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
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	//보너스 포인트 계산
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	//정보 출력
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade +
				"이고, 보너스 포인트는 " + bonusPoint + "점입니다."; 
	}
	

}
