import java.io.IOException;
import java.util.Scanner;

public class FantasyApp {
        
	public static void main(String[] args) {
		
		for(;;)
        {
        System.out.println("1-Register");
        System.out.println("2-Login");
        System.out.println("3-Exit");
        
        User usr = new User();
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
              usr.Register(nam, pass, email, fteam);
        
        }
       
        else if (respond == 2)
        {
        	
          	    System.out.println("Enter your email: ");
                email = s.nextLine();
                email += s.nextLine();
                System.out.println("Enter your password: ");
                pass=s.nextLine();    
                usr.Login(email, pass);
        }
        else {
          break;
        }

        
       
        }
       
	}

}
