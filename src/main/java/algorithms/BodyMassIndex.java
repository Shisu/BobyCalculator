package algorithms;

public class BodyMassIndex {

	private long bmi;
	
	/**
	 * Calculating the BMI regarding to the formula.
	 * 
	 * @param height in meters.
	 * @param weight in kilograms. 
	 */
	public BodyMassIndex(long height, long weight){
		bmi = height/(weight*weight);
	}
	
	public long getBMI(){
		return bmi;
	}	
}