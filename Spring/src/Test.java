
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar c = new SportCar();
		c.color = "Red";
		c.gear = 3;
		c.speedUp(100);
		c.speedDown(30);
		c.setTurbo(true);
		c.sound();
		c.print();
		
		SUVCar suv = new SUVCar();
		suv.setsunloof(false);
		suv.setsunloof(true);
		suv.sound();
		suv.speedUp(40);
		suv.speedDown(20);
		suv.print();
		
		Car car1 = new Car();
		Car car2 = new Car();
		System.out.println(car1);
		System.out.println(car2);
		
		car2 = car1;
		System.out.println(car1);
		System.out.println(car2);
		
		car1 = null;
		System.out.println(car1);
		System.out.println(car2);
	}

}
