
public class MarkSheetModel  {
	
	int calculateTotal(int num1, int num2, int num3) {
		int total = num1 + num2 + num3;
		return total;
	}
	float calculatePercentage(int total){
		float per = (float) ((total)/3.0);
		return per;
	}
	String calculateDivision(float per) {
		
		if (per >= 60) {
			return "First Division";
        } else if (per >= 45) {
        	return "Second Division";
        } else if (per >= 35) {
        	return "Third Division";
        } else {
        	return "Fail";
        }
		
	}
	String calculateResult(int num1, int num2, int num3) {
		
		if(num1 < 40 || num2 < 40 || num3 < 40) {
			return "Fail";
		} else {
			return "Pass";
		}
	

}
}