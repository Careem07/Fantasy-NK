import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FantasyApp {
        
	public static void main(String[] args) {
        User usr = new User();
    	ArrayList<Player> players  = new ArrayList<Player>();
    	Player p = null;
    	ArrayList<Squad> squads  = new ArrayList<Squad>();
		boolean n= false;
		String pname , nation , posti , club , sname ;
		Scanner input = null;
		int GK=0 , FWD=0 ,  DEF=0 ,  MID=0;  
        System.out.println("1-Register");
        System.out.println("2-Login");
        System.out.println("3-Exit");
        
		String pass= "" , nam = "", email = "" , fteam = "";
        Scanner s = new Scanner(System.in);
		int respond;
        respond = s.nextInt();
        
        if (respond == 1) {
          
        	  System.out.println("Enter a unique name: ");
        	  nam = s.nextLine();
              nam += s.nextLine();
              usr.setName(nam);
              System.out.println("Enter your password: ");
              pass=s.nextLine();
              usr.setPassword(pass);
              System.out.println("Enter your email: ");
              email=s.nextLine();
              usr.setEmail(email);
              System.out.println("Enter your favourite team: ");
              fteam=s.nextLine();
              usr.setFavTeam(fteam);
              if(usr.Register(nam, pass, email, fteam))
              {
            	  n= true;
              }
        }
       
        else if (respond == 2)
        {
        	
          	    System.out.println("Enter your email: ");
                email = s.nextLine();
                email += s.nextLine();
                System.out.println("Enter your password: ");
                pass=s.nextLine();    
                if(usr.Login(email, pass))
                {
                	 n= true;
                }
               

        }
        else if(respond == 3) {
        	System.exit(0);
        }
        
       
        if(n)    
        { 
        	
       	for(;;)
        {
        	int choice;
        	System.out.println("1- Create player");
        	System.out.println("2- Create Squad");
        	System.out.println("3- Add player to squad");
        	System.out.println("4- List players in existing squad");
        	System.out.println("5- List players");
        	System.out.println("6- Exit");
        	input = new Scanner(System.in);
        	choice = input.nextInt();

		   if(choice == 1)
		   {   Scanner ss= new Scanner(System.in);
		  
			      pname = ss.nextLine();
			   	  nation=ss.nextLine();
			   	  posti = ss.nextLine();
			   	  club = ss.nextLine();
			   	   p = new Player(pname, nation, posti, club);
			      players.add(p); 
			   	  System.out.println("=======Player was created=======");
		   
        }
		   
		   else if(choice == 2)
		   {  
			   Scanner x= new Scanner(System.in);
			   System.out.println("Enter squad name");
			   sname = x.next();
			   squads.add(new Squad(sname));
			   System.out.println("Squad was created with name : "+ sname);
        }
			   
		   else if ( choice == 3) {  
			      Scanner ss= new Scanner(System.in);
				   System.out.println("Which Squad do u want to add players to?");
				   sname=ss.next();
				   boolean b= false;
				   for (int i = 0; i < squads.size() ; i++) 
				   {
					   if (squads.get(i).getsName().equals(sname)) {
						   b=true;
						   break;
					   } 
				   }
			          if(b)
			          {
			        	  Scanner integ = new Scanner(System.in);
			        	  for ( int i = 0 ; i < squads.size() ; i++ ) 
					       {  
			        		  squads.get(i).setPlayerCount(i);
			        		  if (squads.get(i).playerCount<=15) // squads.get(i).playerCount  >=11 &&
			        		  {
			        			
				    				   System.out.println("Which player do u want to add ?");
				    				  pname = input.next();
				    		    	 if (players.get(i).name.equals(pname)) {
				    		    		// squads.get(i).addPlayer(p);
				    		    		 if(GK<=2 && FWD<=3 && MID<=5 && DEF<=5)
				        	             {
							        	   switch(players.get(i).Position)
							        	   {
								        	   case "GK":
								        	   {   
								        		   GK++;      
								        		   break;
								        	   }
								        	   case "FWD" :
								        	   {
								        		   FWD++;
								        		   break;
								        	   }
								        	   case "DEF":
								        	   {  
								        		   DEF++;
								        		   break;
								        	   
								        	   }
								        	   case "MID":
								        	   {
								        		   MID++;
								        		   break;
								        	   }
								        	   
					        	            }
							        	  
					    		    		
				        	             }
				    		    		 
				    		    		 else
					        		   {
					        			   System.out.println(players.get(i-1).name+ " exceeds limit");
					        			   break;
					        		   }
				    		    		squads.get(i).addPlayer(p);
					    		        System.out.println("Player was added " + p.getName()); 
							       }
				    		  }
			        		  else
			        			  break;	 
					       }
			        		  
			        	  }
			          else
					   
						   System.out.println("Squad doesn't exists");
					   
			          }
				       
		   else if(choice == 4)
		   {   
			   Scanner ss= new Scanner(System.in);
			   System.out.println("Which Squad do u want to list players?");
			   sname=ss.next();
			   
			   for (int i = 0; i <= squads.size() ; i++) 
			   { 
				   if (squads.get(i).getsName().equals(sname))
				   {
					   squads.get(i).getPlayerInfo(); 
					   break;
					   
				   }
				   
			   }  
		    
		   }
		   
		   else if(choice == 5)
		   {
			   for(int ii=0; ii< players.size();ii++) 
			   {
				   players.get(ii).RetrivePlayer();  
			   }
		   }
		   else if(choice == 6)
		   {
			 break;
		   }
}
  
        }

	}
}

