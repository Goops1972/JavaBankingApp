package bankAccountApp;

public interface IBaseRate {
	
//write a method that return the baserate
	default double getBaseRate(){
		return 2.5;
	}

}
