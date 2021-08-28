package taketrans;

public class Bus {
	int busNum; //버스 번호
	int passenger; // 승객 수
	int money; // 수입
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	//사람을 태우다
	public void take(int money) {
		this.money += money;  //요금 누적
		passenger++; //승객 수 1 증가
	}
	
	//정보 출력
	public void showInfo() {
		System.out.println(busNum + "번 버스의 수입은 " + money
				+ "원이고, 승객 수는 " + passenger + "명 입니다.");
	}

}
