import java.util.ArrayList;
import java.util.Arrays;

public class Squad /*extends Score*/{
	ArrayList<Player> Players;
	String sName;
 	int playerCount = 0;
	static final int maxnum = 15;
	static final int minnum = 11;
	int sum=0;
	
	public Squad(String sName ) 
	   {
		 this.sName = sName;
		 this.Players = new ArrayList<Player>(maxnum);
		
	   }
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	
	 public String getsName() {
		return sName;
	}
	public void addPlayer(Player p) {
		 
		this.Players.add(p);
		this.playerCount++;
        System.out.println("Player was added " + p.getName());
	}
	public void removePlayer(Player p) {
		 
		this.Players.remove(p);
		this.playerCount--;
        System.out.println("Player was removed " + p.getName());
  }
	
	  public void getPlayerInfo(String pname) {
		  
          Player player = null;
          for (int i = 0; i < playerCount ; i++) {
              if (Players.get(i).name.equals(pname)) {
                  player = Players.get(i);
                  break;
              }
          }
           player.RetrivePlayer();
           
	
          }
	  
	  public void getPlayerInfo() {
		  
		  Player player = null;
          for (int i = 0; i < playerCount ; i++) {
              {   
                  player = Players.get(i);
                  player.RetrivePlayer();
              }
          }
          
          
      }
	  
	  public int getCount() {
		  return playerCount;
	  }

	  public int Calcpts() {
		  sum=0;
		for(int i=0;i<this.playerCount;i++)
		{
			sum+=this.Players.get(i).getPpoints();
		}
		return sum;
	}
	  
	  }
	  
  



