package edu.kh.poly.ex1.model.dto;

public class Tesla extends Car {
	// 전기차의 일종
	
	private int batteryCapacity;
	
	public Tesla() {
	}

	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) { // 부모의 매개변수 생성자도 있는 상태로
		super(engine, fuel, wheel); // super 매개변수 생성자 => car의 매개변수 생성자
		// 여기서 받은 값도 부모의 세 private 변수로 가게 딤
		this.batteryCapacity = batteryCapacity;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString(); 부모인 Car에서 정의 된 toString 메서드를 재정의하겠다.
		return super.toString()+" / " + batteryCapacity;
	}
}
