import java.util.ArrayList;

public class Player {
	   String name;
	   String nationality;
	   String Position;
	   String Club;
	   double Price;
	   static int Countt=0;
	   
	   public Player() 
	   {
		this.name="";
		this.nationality="";
		this.Position="";
		this.Club="";
		this.Price=0;
	
	   }
	   public String getClub() {
		return Club;
	}
	   public String getName() {
		return name;
	}
	   public String getNationality() {
		return nationality;
	}
	   public String getPosition() {
		return Position;
	}
	   public double getPrice() {
		return Price;
	}
	   public void RetrivePlayer() {
		
           System.out.println("Player name: " + name);
           System.out.println("Nationality: " + nationality);
           System.out.println("Position: " + Position);
           System.out.println("Club: " + Club);
           System.out.println("------------------");
	   }
	   
	   public  void Create(String name , String nationality , String Position , String Club)
		{
			this.name = name;
			this.nationality = nationality;
			this.Position=Position;
			this.Club = Club;
			Countt++;
			
		}
		
	   
		public  Player(String name , String nationality , String Position , String Club)
		{
			this.name = name;
			this.nationality = nationality;
			this.Position=Position;
			this.Club = Club;
			Countt++;
			
		}
		

		
		
}
