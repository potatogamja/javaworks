package singleton;

public class Car {
	private int carNum; //자동차 시리얼넘버
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
