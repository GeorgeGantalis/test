
public class player {
	
private String name;
private int lifes;
private double amount=0;

 public player(String name,int lifes)
 {
	 this.name=name;
	 this.lifes=lifes;
 }
 public void addMoney(double amount)
 {
	 amount+=amount;
 }
 
 public void DecrementOfLifes()
 {
 	lifes-=1;
 }
public String getName() {
	return name;
}
public int getLifes() {
	return lifes;
}
public double getAmount() {
	return amount;
}
 
 
 
}
