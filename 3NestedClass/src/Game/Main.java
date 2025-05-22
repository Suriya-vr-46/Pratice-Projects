package Game;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Game> ob = new HashMap<>();
		
		ob.put("XO game",new Game("XO game"));
		ob.get("XO game").createPlayer(01, "Suriya", 7);
		ob.get("XO game").createPlayer(02, "Kishore", 9);
		ob.get("XO game").createPlayer(03, "Jeeva", 6);
		
		ob.get("XO game").getWinner();
		
		ob.put("Hand Criket game",new Game("Hand Criket game"));
		ob.get("Hand Criket game").createPlayer(01, "Vijay", 8);
		ob.get("Hand Criket game").createPlayer(02, "Aakash", 9);
		ob.get("Hand Criket game").createPlayer(03, "Mohan", 10);
		
		ob.get("Hand Criket game").getWinner();
	}
}
