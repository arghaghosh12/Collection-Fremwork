package generalization;

import java.util.ArrayList;

class SwiggyMainClass {
	public static void main(String[] args) {
		ArrayList <MobileApplication> al=new ArrayList<MobileApplication>();
		al.add(new Swiggy());
		al.add(new PhonePe());
		al.add(new Uber());
		for(MobileApplication ma:al)
		{
			if(ma instanceof Swiggy)
			{
				Swiggy sw=(Swiggy) ma;
				sw.orderFood();
			}
			else if(ma instanceof PhonePe)
			{
				PhonePe pe=(PhonePe) ma;
				pe.makePayment();
			}
			else if(ma instanceof Uber)
			{
				Uber ub=(Uber) ma;
				ub.bookCab();
				
				//((Uber) ma).bookCab();
			}
		}
	}

}
