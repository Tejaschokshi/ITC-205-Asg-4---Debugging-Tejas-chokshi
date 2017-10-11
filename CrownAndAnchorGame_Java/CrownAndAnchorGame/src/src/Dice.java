public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}
// All rolls are the same in each run through 
//bug 3 testing
	public DiceValue roll() {
		return DiceValue.getRandom();
	}		
	
	public String toString() {
		return value.toString();
	}
}
