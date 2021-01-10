import java.util.ArrayList;

public class Rules {
	
	
	 
	public boolean checkpos( Squad sq , String c) 
	{
		 boolean f= false;
		 int LIMIT_GK = 1;
		 int LIMIT_DEF = 1;
		 int LIMIT_FWD = 1;
		 int LIMIT_MID = 1;

		System.out.println(c);
		 for(int i = 0 ; i < sq.Players.size() ; i++) {
				System.out.println("before GK counter "+ LIMIT_GK);
				 System.out.println("el position" +c);
			 if(sq.Players.get(i).getPosition().contains(c)) {
	       			if(c.equals("GK"))
			       	   {
				       		if(LIMIT_GK<2)
				       		{	
				       			LIMIT_GK++;
				       			f= true;
				       		}
				       		else
				       		{
				       			f=false;
				       		}
				       		 
			       	   }
	       			else if(c.equals("FWD" ))
			       	   {
				       		
				       		if(LIMIT_FWD<3) {
				       			LIMIT_FWD++;
				       			f= true;
				       		}
				       		else
				       		{
				       			f=false;
				       		}
			       	   }
	       			else if(c.equals("DEF"))
			       	   {
				       		   
				       		if(LIMIT_DEF<5)
				       		{
				       			LIMIT_DEF++;
				       			
				       			f= true;
				       		}
				       		else
				       		{
				       			f=false;
				       		}
			       	   }
	       			else if(c.equals("MID" ))

			       	   {
				       		
				       		if(LIMIT_MID<5)
				       		{
				       			LIMIT_MID++;
				       			
				       			f= true;
				       		}
				       		else
				       		{
				       			f=false;
				       		}
			       	   }
			       	 

		           }
				 
			 }
		return f;
		 }
		
		
		 
	
		public boolean checkclub( Squad sq , String c)
		{
			
			int clubcount =1;
			for(int i = 0 ; i < sq.Players.size() ; i++) {
					if(sq.Players.get(i).getClub().contains(c)) {
						clubcount ++; 
					}
					
				}
			
			if(clubcount>3) {
				return false;
			}
			else {
			  return true;
			}

			
		}




}
