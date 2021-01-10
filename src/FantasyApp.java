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
        	System.out.println("4- Remove player from squad");
        	System.out.println("5- Add Event");
        	System.out.println("6- Get Squad score");
        	System.out.println("7- List players in existing squad");
        	System.out.println("8- List players");
        	System.out.println("9- List Event");//gameweek
        	System.out.println("10- Exit");
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
			   
		   else if ( choice == 3)
		   {
				      Scanner ss= new Scanner(System.in);
					   System.out.println("Which Squad do u want to add players to?");
					   sname=ss.next();
					   boolean b= false;
					   int sq=0;
					   for (int i = 0; i < squads.size() ; i++)
					   {
						   if (squads.get(i).getsName().equals(sname)) {
							   b=true;
							   sq=i;
							   break;

						   }
					   }
				          if(b)
				          {
				        	      Scanner integ = new Scanner(System.in);

				        		  if (squads.get(sq).playerCount<=15) // squads.get(i).playerCount  >=11 &&
				        		  {

					    				   System.out.println("Which player do u want to add ?");
					    				  pname = input.next();
					    				  boolean f=false;
					    				  int pl=0;
					    				  for(int i=0;i<players.size();i++)
					    		    	 if (players.get(i).name.equals(pname)) {
						    		    		f=true;
						    		    		pl=i; 
						    		    		break;
					    		    		}
					    				  p=players.get(pl);
					    				  if(f) {
					    		    		 if(GK<=2 && FWD<=3 && MID<=5 && DEF<=5)
					        	             {
								        	   switch(p.Position)
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
								        	   squads.get(sq).addPlayer(p);

					        	             }

					    		    		 else
						        		   {
						        			   System.out.println(p.getName()+ " exceeds position limit");

						        		   }

					    		    			 }
					    				  else
					    				  {
					    					  System.out.println("Player doesn't exist");
					    				  }


								       }
				        		  else
				        			  System.out.println("Squad is full");

						       }


				          else

							   System.out.println("Squad doesn't exists");

				          }
		   else if (choice == 4) {
			   
			   Scanner kk= new Scanner(System.in);
			   System.out.println("Which Squad do u want to remove players from?");
			   sname=kk.next();
			   boolean b= false;
			   int sq=0;
			   for (int i = 0; i < squads.size() ; i++)
			   {
				   if (squads.get(i).getsName().equals(sname)) {
					   b=true;
					   sq=i;
					   break;
				   }
			   }
			   System.out.println("Which player do u want to remove ?");
				  pname = input.next();
				  boolean f=false;
				  int pl=0;
				  for(int i=0;i<players.size();i++) 
				    	 if (players.get(i).name.equals(pname)) {
		 		    		f=true;
		 		    		pl=i; 
		 		    		break;
				    	 }
						  p=players.get(pl);
						  if(f) {
		    		    		 if(GK<=2 && FWD<=3 && MID<=5 && DEF<=5)
		        	             {
					        	   switch(p.Position)
					        	   {
						        	   case "GK":
						        	   {
						        		   GK--;
						        		   break;
						        	   }
						        	   case "FWD" :
						        	   {
						        		   FWD--;
						        		   break;
						        	   }
						        	   case "DEF":
						        	   {
						        		   DEF--;
						        		   break;

						        	   }
						        	   case "MID":
						        	   {
						        		   MID--;
						        		   break;
						        	   }

			        	            }
					        	   squads.get(sq).removePlayer(p);
		        	             
			   }
			          
				  }
						  else
    				  {
    					  System.out.println("Player doesn't exist");
    				  }
		   }
		    
		   else if(choice==5) 
		   {
			     System.out.println("1- Forward score a goal");
				 System.out.println("2- Midfielder score a goal");
				 System.out.println("3- Defender score a goal");
				 System.out.println("4- Goalkeeper score a goal");
				 System.out.println("5- Player made an assist");
				 System.out.println("6- Player got a yellow card");
				 System.out.println("7- Player got a red card");
				 System.out.println("8- Player conceded a goal");
				 int c;
				 Scanner cc=new Scanner (System.in);
				 c=cc.nextInt();
				 System.out.println("Which player?");
				 pname = input.next();
				 int pl=0;
				  for(int i=0;i<players.size();i++)
		    	 if (players.get(i).name.equals(pname)) {
			    		pl=i; 
			    		break;
		    		}
				  p=players.get(pl);
				  
				 switch (c)
				 {
					 case 1:
					 {
						if(p.getPosition().equals("FWD"))
						{
							p.goalFWD();
							System.out.println(p.getName() + " Scored " + p.getPpoints() );
						}
						break;
					 }
					 case 2:
					 {
						 if(p.getPosition().equals("MID"))
							{
								p.goalMID();
								System.out.println(p.getName() + " Scored " + p.getPpoints() );
							}
						 break;
					 }
					 case 3:
					 {
						 if(p.getPosition().equals("DEF"))
							{
								p.goalDEF();
								System.out.println(p.getName() + " Scored " + p.getPpoints() );
							}
						 break;
					 }
					 case 4:
					 {
						 if(p.getPosition().equals("GK"))
							{
								p.goalGK();
								System.out.println(p.getName() + " Scored " + p.getPpoints() );
							}
						 break;
					 }
					 case 5:
					 {
						p.assist(); 
						System.out.println(p.getName() + " Made Assist " + p.getPpoints() );
						break;
					 }
					 case 6:
					 {
						p.yellowcard(); 
						System.out.println(p.getName() + " got yellow card " + p.getPpoints() );
						break;
					 }
					 case 7:
					 {
						 p.redcard();
						 System.out.println(p.getName() + " got red card " + p.getPpoints() );
						 break;
					 }
					 case 8:
					 {
						 p.owngoal();
						 System.out.println(p.getName() + " own goal  " + p.getPpoints() );
						 break;
					 }
				 }
			     
		   }
		   
		   else if (choice == 6) {
			   Scanner ss= new Scanner(System.in);
			   System.out.println("Which Squad do u want to get score?");
			   sname=ss.next();
			   
			   for (int i = 0; i < squads.size() ; i++) 
			   { 
				   if (squads.get(i).getsName().equals(sname)) {
					   System.out.println("Squads points are " + squads.get(i).Calcpts()) ;  
				   }
			   
		   }
         }
		   
		   
		   
		   else if(choice == 7)
		   {   
			   Scanner ss= new Scanner(System.in);
			   System.out.println("Which Squad do u want to list players?");
			   sname=ss.next();
			   
			   for (int i = 0; i < squads.size() ; i++) 
			   { 
				   if (squads.get(i).getsName().equals(sname))
				   {
					   squads.get(i).getPlayerInfo(); 
					   break;
					   
				   }
				   
			   }  
	
			   
		   }
		   
		   else if(choice == 8)
		   {
			   for(int ii=0; ii< players.size();ii++) 
			   {
				   players.get(ii).RetrivePlayer();  
			   }
		   }
		   
		   else if(choice == 9)
		   {
			
				

		   }
		   
		   else if(choice == 10)
		   {
			 break;
		   }
		  
        }
        }

	}
}