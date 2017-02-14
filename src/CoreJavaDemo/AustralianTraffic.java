package CoreJavaDemo;
import Interface.CentralTraffic;
import Interface.ContinentalTraffic;
public class AustralianTraffic implements CentralTraffic, ContinentalTraffic{
	
	public static void main(String[] args){
		CentralTraffic a = new AustralianTraffic();
		a.goGreen();
		a.redStop();
		a.flashYellow();
		
		AustralianTraffic at = new AustralianTraffic();
		ContinentalTraffic ct = new AustralianTraffic();
		
		at.walkOnSymbol();
		ct.TrainSymbol();
	}

	@Override
	public void goGreen() {
		// TODO Auto-generated method stub
		System.out.println("go green implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop implementation");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flasing yellow implementation");
	}
	
	public void walkOnSymbol(){
		System.out.println("Walk when you see hand symbol.");
	}

	@Override
	public void TrainSymbol() {
		System.out.println("Stop on train symbol.");
		
	}
	
	
	


}