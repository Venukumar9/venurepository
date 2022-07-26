package Com.Aggregation;

public class Musicplayer {
	private String type;

	public Musicplayer(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Musicplayer [type=" + type + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
