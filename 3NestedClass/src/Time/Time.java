package Time;

public class Time {
	
	class Conveter{
		int h;
		int m;
		
		public Conveter(int h,int m){
			this.h = h;
			this.m = m;
		}
		
		public int getSeconds() {
			return (h*60 + m);
		}
	}
	
	public Time(int h, int m) {
		Conveter c = new Conveter(h,m);
		System.out.println("Seconds : "+c.getSeconds());
	}
}
