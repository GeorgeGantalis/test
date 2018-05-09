
public class BuildingwithLifes extends Building{
private int lifes;
private int money;
private int time;

	public BuildingwithLifes(String name, int money,int time,  int lifes) {
		super(name);
		this.money=money;
		this.time=time;
		this.lifes=lifes;
       
	}
	
    public int getLifes() {
		return lifes;
	}

	public int getMoney() {
		return money;
	}

    public int getTime() {
		return time;
	}
	public void DecrementOfLifes()
    {
    	lifes-=1;
    }
	
	public void DecrementTime()
	{
		time-= 1;
	}

    
	

}
