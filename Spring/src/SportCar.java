
public class SportCar extends Car {
	boolean turbo;
	
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed = speed +(2*increment);
		System.out.println(speed);
	}
	
	
	
	@Override
	public void speedDown(int increment) {
		// TODO Auto-generated method stub
		speed = speed - (2 * increment);
		System.out.println(speed);
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("람보");
	}
	
	public void setTurbo(boolean newValue) {
		turbo = newValue;
	}
	
}

class SUVCar extends Car{
	boolean sunloof;
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("에스유븨");
	}
	
	
	
	public void setsunloof(boolean setsunloof) {
		sunloof = setsunloof;
		if (true == setsunloof) {
			System.out.println("선루프가 있습니다.");
		}else {
			System.out.println("선루프가 없습니다.");
		}
	}
}