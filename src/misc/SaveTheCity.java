package misc;

interface TestFriend {

	void getStatus();
}

class Acquintance implements TestFriend {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Acquintance(String name) {
		super();
		this.name = name;
	}

	@Override
	public void getStatus() {
		System.out.println(this.getName() + " is just an aquantance");
	}

}

class Friend extends Acquintance {
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Friend(String name, String city) {
		super(name);
		this.city = city;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getStatus() {
		System.out.println(this.getName() + " is a friend and he is from " + this.getCity());
	}

}

class BestFriend extends Friend {

	private String favSong;

	public String getFavSong() {
		return favSong;
	}

	public void setFavSong(String favSong) {
		this.favSong = favSong;
	}

	public BestFriend(String name, String city, String favSong) {
		super(name, city);
		this.favSong = favSong;
	}

	@Override
	public void getStatus() {
		System.out.println(name + " is my best friend He is from " + this.getCity() + " and his fav song is "
				+ this.getFavSong());
	}

}

public class SaveTheCity {

	public static void main(String[] args) {
		Acquintance acquintance = new Acquintance("Atish");
		Friend friend = new Friend("vijay", "mumbai");
		BestFriend bestFriend = new BestFriend("Anurag", "Thane", "cheap thrills");

		acquintance.getStatus();
		friend.getStatus();
		bestFriend.getStatus();
	}

}
