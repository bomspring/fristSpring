
public class Car {

	//�ʵ� ����
//	private
	String color;
//	private
	int speed, gear;
	
	//������
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
	
	
	//�޼ҵ� ����
	public void sound() {
		System.out.println("�θ��θ�");
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
