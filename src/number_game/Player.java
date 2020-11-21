package number_game;

public class Player {
	int number = 0;
	
	public void guess() {
		this.number = (int)(Math.random() * 10);
	}
}