
public class BuildingStr extends Building {
private String choice1;
private String choice2;
private String choice3;

	
	public BuildingStr(String name,String ch1,String ch2,String ch3) {
		super(name);
		this.choice1=ch1;
		this.choice2=ch2;
		this.choice3=ch3;
	}


	public String getChoice1() {
		return choice1;
	}


	public String getChoice2() {
		return choice2;
	}


	public String getChoice3() {
		return choice3;
	}

	
	
	
}
