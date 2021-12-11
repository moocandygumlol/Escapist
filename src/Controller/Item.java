package Controller;

public class Item {
	
	private String name;
	private String imgURL;
	
	public Item(String name) {
		this.name = name;
		if(name.equals("Key")) {
			imgURL = "";
		}
		else if(name.equals("Shovel")) {
			imgURL = "";
		}
		else if(name.equals("Ladder")) {
			imgURL = "";
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getImgURL() {
		return imgURL;
	}
}
