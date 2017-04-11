package πÈ±‚«œ30212;

public class book {

	private String Name;
	private String Bmaker;
	private String Pub;
	private String Cost;

	public String setName() {
		return Name;
	}

	public void getname(String Name) {
		this.Name = Name;
	}

	public String Bmaker() {
		return Bmaker;
	}

	public void getBmaker(String Bmaker) {
		this.Bmaker = Bmaker;
	}

	public String Pub() {
		return Pub;
	}

	public void getPub(String Pub) {
		this.Pub = Pub;
	}

	public String Cost() {
		return Cost;
	}

	public void getCost(String Cost) {
		this.Cost = Cost;
	}

	public String toString() {
		return Name + "," + Bmaker + "," + Pub + "," + Cost;
	}

}
