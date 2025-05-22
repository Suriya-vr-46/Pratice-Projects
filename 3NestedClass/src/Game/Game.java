package Game;
import java.util.*;

public class Game {
	String name;
	List<Player> players;
	
	class Player{
		int id;
		String name;
		int score;
		
		public Player(int id,String name,int score) {
			this.id = id;
			this.name = name;
			this.score = score;
		}
		
		public void display() {
			System.out.println("Id : "+id);
			System.out.println("Name : "+name);
			System.out.println("Score : "+score);
		}
		
		public int getScore() {
			return score;
		}
	}
	
	public Game(String name) {
		this.name = name;
		this.players = new ArrayList<>();
	}
	
	public void getWinner() {
		System.out.println("Game Name : "+name);
		int t = 0;
		for(Player p : players) {
			if(p.getScore()>t) {
				t = p.getScore();
			}
		}
		
		for(Player p : players) {
			if(p.getScore() == t) {
				p.display();
				break;
			}
		}
	}
	
	public void createPlayer(int id,String name,int score) {
		Player p = new Player(id,name,score);
		this.players.add(p);
	}
}
