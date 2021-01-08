import java.util.ArrayList;

public class Player extends Event{
	   String name;
	   String nationality;
	   String Position;
	   String Club;
	   double Price;
	   static int Countt=0;
	   boolean goal = false;
	   int points=0;

	   
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
           System.out.println("Player points: " + points);
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

		/*int Calcpts() {
			switch(this.getPosition()) {
			  
			case "GK":
     	   {
     		   this.score+=6;
     		   break;
     	   }
     	   case "FWD" :
     	   {
     		   this.score+=4;
     		   break;
     	   }
     	   case "DEF":
     	   {
     		   this.score+=6;
     		   break;

     	   }
     	   case "MID":
     	   {
     		   this.score+=5;
     		   break;
     	   }

         }
			//p.setsum+=this.score;
			return this.score;
		}
		*/
		public int getPpoints() {
		  return points;
		}
		public void goalMID()
		{
			this.points += 5;
		}
		public void goalFWD()
		{
			this.points +=4;
		}
		public void goalGK()
		{
			this.points += 6;
		}
		
		public void goalDEF()
		{
			this.points += 6;
		}
		
		public void assist()
		{
			this.points += 3;
		}
		public void yellowcard()
		{
			this.points -= 1;
		}
		public void redcard()
		{
			this.points -= 3;
		}
		public void owngoal()
		{
			this.points -= 2;
		}
         
		
		
		
}
