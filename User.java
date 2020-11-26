import java.io.IOException;

public class User {

	String name;
	String password;
	String email;
	String FavTeam;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getFavTeam() {
		return FavTeam;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFavTeam(String favTeam) {
		FavTeam = favTeam;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	boolean Login(String email , String Password) {
		Validation vd = new Validation();
		boolean bo = vd.Login(email, Password);
		 
			if(bo) {
				  System.out.println("You logged in succesfully");
				  return true;
			}
			else
				System.out.println("Email or password not match");
			return false;
	}
	
	boolean Register(String name , String password , String email , String FavTeam) {
	try {	
		Validation vd = new Validation();
		 vd.Register(name, password, email, FavTeam);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
