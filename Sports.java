package assignments;

//Method Overloading

public class Sports {
	public void acheiver(String name , int medalCount) {
		System.out.println("Player Name And Medal Count :"+" "+name+" , "+"("+medalCount+")");
	}
	private void acheiver(String country ,String sportName ,int rank) {
		System.out.println("Player Country,Sportaname & Rank :"+" "+country+" , "+sportName+" , "+" , "+"("+rank+")");
	}
	public void acheiver(float weight,int height,long contactNo) {
		System.out.println("Player Weight,Height,Contact Number :"+" "+weight+" , "+height+" , "+contactNo);
	}
	public void acheiver(String tournament,long prizeMoney) {
		System.out.println("Tournament Name And Prize Money :"+" , "+tournament+" , "+prizeMoney);
	}
	public static void main(String[] args) {
		Sports details =new Sports();
		details.acheiver("MATHI MARAN R", 5);
		details.acheiver("INDIA","POWERLIFTING",1);
		details.acheiver(105.5f,182,638/3585161);
		details.acheiver("Subatra Classic ",500000000l);
	}

}
