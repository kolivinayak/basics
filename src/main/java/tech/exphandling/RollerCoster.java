package tech.exphandling;

public class RollerCoster {

	
	void validAge(int age) throws AgeException {
		
		if (age < 12 )
		{

			throw new AgeException("Please come after " + (12 - age) + " Years");
		
			
		} else if ( age > 60 ) {
			int ageDiff = age - 60;
			String errMsg = "You should have come before " + ageDiff + " Years";
			throw new AgeException(errMsg);
		} else
			System.out.println("Enjoy the ride");
	}
	
}
