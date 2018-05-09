import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList <String> CardsofThief = new ArrayList<String>();
		ArrayList <String> CardsofPolice = new ArrayList<String>();
		
		//Δημιουργία ταμπλού
		TableGame table = new TableGame("COC");
		
		//Δημιουργία των τετραγώνων κτιρίων
		BuildingwithLifes home1= new BuildingwithLifes ("home1",100000,0,1);
		BuildingwithLifes home2= new BuildingwithLifes("home2",100000,0,1);
		BuildingwithLifes home3= new BuildingwithLifes ("home3",100000,0,1);
		BuildingwithLifes home4= new BuildingwithLifes("home4",100000,0,1);
		BuildingwithLifes home5= new BuildingwithLifes ("home5",100000,0,1);
		BuildingwithLifes home6= new BuildingwithLifes ("home6",100000,0,1);
		BuildingwithLifes home7= new BuildingwithLifes("home7",100000,0,1);
		BuildingwithLifes home8= new BuildingwithLifes ("home8",100000,0,1);
		BuildingwithLifes home9= new BuildingwithLifes ("home10",100000,0,1);
		BuildingwithLifes home10= new BuildingwithLifes("home11",100000,0,1);
		BuildingwithLifes home11= new BuildingwithLifes ("home12",100000,0,1);

		BuildingwithLifes kiosk1 = new BuildingwithLifes("kiosk1",50000,0,1);
		BuildingwithLifes kiosk2 = new BuildingwithLifes ("kiosk2",50000,0,1);
		BuildingwithLifes kiosk3 = new BuildingwithLifes("kiosk3",50000,0,1);

		BuildingwithLifes supermarket = new BuildingwithLifes("supermarket",200000,0,1);

		BuildingwithLifes mall = new BuildingwithLifes ("mall",600000,0,1);
        
		BuildingwithLifes hotel1 = new BuildingwithLifes ("hotel1",300000,0,1);
		BuildingwithLifes hotel2 = new BuildingwithLifes ("hotel2",300000,0,1);
	
		BuildingwithLifes villa1 = new BuildingwithLifes ("villa1",400000,0,1);
		BuildingwithLifes villa2 = new BuildingwithLifes ("villa2",400000,0,1);
		BuildingwithLifes villa3 = new BuildingwithLifes ("villa3",400000,0,1);

		BuildingwithLifes TownHall = new BuildingwithLifes ("TownHall",600000,0,1);

		BuildingwithLifes Bank1 = new BuildingwithLifes ("Bank1",1000000,3,3);
		BuildingwithLifes Bank2 = new BuildingwithLifes ("Bank2",1000000,3,3);

		BuildingwithLifes Casino = new BuildingwithLifes ("Casino",1000000,2,1);

		//Δημιουργία στρατόπεδο
		BuildingStr Camp = new BuildingStr("Camp","Κερδισες 1.000.000","Χανεις μια ζωη","Πανε σπιτι");
		
		//Δημιουργία αφετηριών. Η μεταβητή true δηλώνει πως το αντικείμενο αποτελεί ενεργή αφετηρία
		StartPoint Favela = new StartPoint ("Favela",true);
		StartPoint Police = new StartPoint ("Police",true);
		
		//Δημιουργία στάσεων Αστυνομικών
		StartPoint state1 = new StartPoint("State 1 for police officers",false); 
		StartPoint state2 = new StartPoint("State 2 for police officers",false);

		//Δημιουργία πακέτου καρτών για τον κλέφτη 
		String cardThief1= "κάρτα ασυλίας για μια χρήση";
		String cardThief2= "Βγές απο τη φυλακή";
		String cardThief3= "Πήγαινε στη φαβέλα";

		CardsofThief.add(cardThief1);
		CardsofThief.add(cardThief2);
		CardsofThief.add(cardThief3);

        BuildingCards ThiefCards = new BuildingCards("ThiefCards",CardsofThief);
		
		//Δημιουργία πακέτου καρτών για τον αστυνόμο 
		String cardPolice1= "Χάνεις τη σειρά σου";
		String cardPolice2= "Ξαναρίξε το ζάρι";
		String cardPolice3= "Πήγαινε σε μία απο τις 2 γωνίες στάθμευσης";

	    CardsofPolice.add(cardPolice1);
	    CardsofPolice.add(cardPolice2);
	    CardsofPolice.add(cardPolice3);

	    
        BuildingCards PoliceCards = new BuildingCards("PoliceCards",CardsofPolice);
        
        //Δημιουργία ταμπλού με τα κατάλληλα κουτιά
        
		table.addBuildind(Favela);
		table.addBuildind(kiosk1);
		table.addBuildind(home1);
		table.addBuildind(home2);
		table.addBuildind(Bank1);
		table.addBuildind(home3);
		table.addBuildind(supermarket);
		
		table.addBuildind(state1);
		table.addBuildind(Casino);
		table.addBuildind(hotel1);
        table.addBuildind(home4);
		table.addBuildind(home5);
//      Cards
		table.addBuildind(kiosk2);
		table.addBuildind(Bank2);
		table.addBuildind(home6);
		table.addBuildind(Police);

		table.addBuildind(TownHall);
		table.addBuildind(home7);
		//Cards
		table.addBuildind(home8);
		table.addBuildind(villa1);
		table.addBuildind(villa2);
		table.addBuildind(state2);

		table.addBuildind(mall);
		table.addBuildind(hotel2);
		table.addBuildind(home8);
		//Cards
		table.addBuildind(Camp);
		table.addBuildind(home9);
		table.addBuildind(home5);
		table.addBuildind(kiosk3);
		table.addBuildind(home10);
		table.addBuildind(home11);


		

       		



		
		


		
	}

}
