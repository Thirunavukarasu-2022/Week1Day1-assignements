package week1.day1;

public class Mobile {
	public void makeCall()
	{
		String mobileModel = "Vivo";
		float mobileWeight = 200.50f;
		System.out.println("To make Call");
	}
	public void sendMsg() 
	{
		boolean isFullcharged = true;
		int mobileCost = 25000;
		System.out.println("To Send Message");

	}
		public static void main(String[] args) 
		{
			Mobile mobileinfo = new Mobile();
			System.out.println("This is My Mobile");
			mobileinfo.makeCall();
			mobileinfo.sendMsg();
						
		}

}

