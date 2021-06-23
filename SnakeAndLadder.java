  
class LadderSnake{
	
	public static void main(String[] args){
		int position = 0;
		System.out.println("Welcome to Snake-Ladder Program Problem");
		System.out.println("You are at Starting Position::" + position);
		Dice();
	}

	public static void Dice(){
		int diceCheck = (int) Math.floor(Math.random() * 10) % 6+1;
		System.out.println("Dice Value::"+ diceCheck);
		}
}
