import java.util.Scanner;

public class Spring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		Car myCar = new Car();
//		myCar.print();
//		
//		myCar.color = "red";
//		myCar.speed = 0;
//		myCar.gear = 1;
//		myCar.print();
//		
//		
//		Car car1 = new Car("»¡°­");
//		car1.print();
//		Car car2 = new Car("³ë¶û", 3);
//		car2.print();
//		Car car3 = new Car("ÃÊ·Ï", 2, 4);
//		car3.print();
//		
//		Car yourCar = myCar;
//		yourCar.color = "blue";
//		yourCar.speed = 7;
//		yourCar.gear = 2;
//		yourCar.print();
//		myCar.print();
//		
//		myCar = car1;
//		car1.print();
//		myCar.print();
		
		Car carA = new Car();
		Car carB = new Car("»¡°­",5,2);
//		carB = carA;
//		carA.print();
//		carB.print();
		carA = carB;
//		carA = null;
		carA.print();
		carB.print();
	}
}
