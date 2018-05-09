import java.util.ArrayList;

public class BuildingCards  extends Building {
private ArrayList<String> cards = new ArrayList<String>();
	
	public BuildingCards(String name,ArrayList<String> Cards) {
		super(name);
		this.cards=Cards;
	}

	public ArrayList<String> getCards() {
		return cards;
	}

	
}
