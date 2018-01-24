
public class Car {

	//필드 선언
//	private
	String color;
//	private
	int speed, gear;
	
	//생성자
	public Car() {
		color = "W";
		speed = 3;
		this.gear = 7;
	}
	public Car(String abc) {
		color = abc;
	}
	public Car(String abc, int a, int gear) {
		color = abc;
		speed = a;
		this.gear = gear;
	}
	public Car(String abc, int a) {
		color = abc;
		speed = a;
	}
	
	
	//메소드 선언
	public void sound() {
		System.out.println("부릉부릉");
	}
	public void speedUp(int increment) {
		speed += increment;
	}
	public void speedDown(int increment) {
		speed -= increment;
	}
	void print()
	{
		System.out.println(color + "," + speed + "," + gear /*+ "," + (speed * gear)*/);
	}
}
