import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Validation {
     public boolean Login(String email , String password) {	
    	try {
    		Scanner sc = new Scanner(new File("D:\\eclipse workspace\\FantasyPL\\src\\Logfile.TXT"));
		
    	String linereader;
    	String[] users;
    	
    	while(sc.hasNext()) {
    		
    		linereader = sc.nextLine();
    		users=linereader.split(",");
    		if(users[2].equalsIgnoreCase(email) && users[1].equals(password))
                  return true;
               
    	  }
    	}
    	catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("Falied to login");
    	}
    	 return false;
    	}    
     
     boolean Register(String name , String password , String email , String FavTeam) throws IOException {
    	
    	 try {
    		 File fil = new File("D:\\eclipse workspace\\FantasyPL\\src\\Logfile.TXT");
			BufferedReader br = new BufferedReader(new FileReader(fil));
			String linereader;
			boolean checkname = false;
			
            while ((linereader = br.readLine()) != null) {
               if(linereader.contains(name) && linereader.contains(email) ) {
            	   checkname = true;
               }
            	
    	    }
            
            if (checkname)
            	System.out.println("Name or email is not unique");
            else {
            FileWriter f = new FileWriter(fil.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(f);
            if(email.contains("@") && email.contains(".com")) {
            	 bw.append(name);
                 bw.append(',');
                 bw.append(password);
                 bw.append(',');
                 bw.append(email);
                 bw.append(',');
                 bw.append(FavTeam);
                 bw.append("\n");
                 bw.close();
                 br.close();  
                 System.out.println("You registered succesfully");
                 return true;
            }
             else {
             	System.out.println("Email format is not correct..");
                 	
             }
            bw.close();
            }
           
    	 }
		 catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
    	 
 		return false;
 	}
}
