class Time{
	private int hour;
	private int min;
	private int sec;
	
	public Time() {
		this(0,0,0);
	}
	
	public Time(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	
	public void setTime(int h, int m, int s) {
		hour = ((h >= 0 && h<24) ? h : 0);
		min = ((m>= 0 && m < 60) ? m : 0);
		sec = ((s >= 0 && s < 60) ? s : 0);
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, min, sec);
	}
	
}
public class TimeTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time time = new Time();
		
		System.out.print("기본생성자 호출후 시간:");
		System.out.println(time.toString());
		
		Time time2 = new Time(13, 27 , 54 );
		
		System.out.print("기본생성자 호출후 시간:");
		System.out.println(time2.toString());
		
		Time time3 = new Time(78,67,87);
		
		System.out.print("기본생성자 호출후 시간:");
		System.out.println(time3.toString());
		
		
		
	}

}
