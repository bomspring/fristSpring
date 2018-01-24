package SSpring;

public class SmartPhone extends Device implements RemoteControl, Print{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Sound");
	}
	@Override
		public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TurnOn");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TurnOff");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("VolumeUp");
	}
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("VolumeDown");
	}

}
