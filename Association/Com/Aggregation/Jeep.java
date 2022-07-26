package Com.Aggregation;
import Com.Aggregation.*;

public class Jeep {
	private String name;
	private int cost;
	private   Musicplayer musicplayer;
	@Override
	public String toString() {
		return "Jeep [name=" + name + ", cost=" + cost + "]";
	}
	public Jeep(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Musicplayer getMusicplayer() {
		return musicplayer;
	}
	public void setMusicplayer(Musicplayer musicplayer) {
		this.musicplayer = musicplayer;
	}
	
	
	

} 
 
