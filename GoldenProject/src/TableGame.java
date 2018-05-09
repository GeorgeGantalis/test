import java.util.ArrayList;

public class TableGame {
 private String name;	
 private ArrayList <Building> buildings = new ArrayList<Building>(); 
	
 public TableGame(String name)
 {
	 this.name=name;
 }
 
 public void addBuildind(Building b)
 {
	 buildings.add(b);
 }
 
	
	
}
