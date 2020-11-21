package dot_com_game;

import java.util.ArrayList;

public class DotCom {
	
	private ArrayList<String> locationCells;
	private String name;
	
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput) {
		String status = "miss";
		
		// userInput이 존재하면 위치하는 index를 반환
		// 존재하지 않으면 -1을 반환
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if(locationCells.isEmpty()) {
				status = "kill";
				System.out.println("Ouch! You sunk " + name + " : ( ");
			} else {
				status = "hit";
			}
		}
		return status;
	}

}
