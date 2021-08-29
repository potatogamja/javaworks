package singleton;

public class Car {
	private int carNum; //�ڵ��� �ø���ѹ�
	private String brand;
	private static int serialNum = 1000;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}

}
