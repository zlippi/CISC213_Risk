
/**
 * 
 */
import java.util.*;
/**
 * @author David Amos
 *
 */
public class Player implements GameObject{

	Scanner scan;
	
	String PlayerColor;
	
	static ArrayList<String> ColorList;
	
	int choice;
	
	static int TurnOrder = 1;
	
	int PlayerTurn;
	
	int territoriesOwned;
	
	int unitsOwned;
	
	boolean didWin = false;
	
	boolean myTurn = false;
	
	
	public Player() {
		
		scan = new Scanner(System.in);
		
		//create color list for users to pick from
		ColorList = new ArrayList<>();	
		
		//add colors to color list
		ColorList.add("Red");
		ColorList.add("Blue");
		ColorList.add("Green");
		ColorList.add("Yellow");
		ColorList.add("Brown");
		ColorList.add("Pink");
	}
	
	public void setColorSelection() {
		
		//prompt color choice
		System.out.println("Please pick one of the following colors");
		
		int index = 0;
		
		for (String colors : ColorList) {
			
			//prompt/display colors
			//Enter index to select color
			System.out.println("Enter " + index + " to select " + colors);

			index++; 
			}
		
		choice = scan.nextInt();
		
		PlayerColor = ColorList.get(choice);
		
		//remove the color from the list so it no longer available to other players
		ColorList.remove(choice);
	}
	
	public ArrayList<String> getColorList() {
		return ColorList;
	}
	
	
	public String getPlayerColor() {
		
		return PlayerColor;
	}
	
	public void setPlayerTurn(int NumberPlayers) {
		
		PlayerTurn = TurnOrder;
		TurnOrder++;
	}
	
	public int getPlayerTurn() {
		
		return PlayerTurn;
	}
	public static int getTurnOrder() {
		
		return TurnOrder;
	}

	/**
	 * @return the territoriesOwned
	 */
	public int getTerritoriesOwned() {
		return territoriesOwned;
	}
	/**
	 * @param territoriesOwned the territoriesOwned to set
	 */
	public void setTerritoriesOwned(int territoriesOwned) {
		this.territoriesOwned = territoriesOwned;
	}
	/**
	 * @return the unitsOwned
	 */
	public int getUnitsOwned() {
		return unitsOwned;
	}
	/**
	 * @param unitsOwned the unitsOwned to set
	 */
	public void setUnitsOwned(int unitsOwned) {
		this.unitsOwned = unitsOwned;
	}
	/**
	 * @return the didWin
	 */
	public boolean isDidWin() {
		return didWin;
	}
	/**
	 * @param didWin the didWin to set
	 */
	public void setDidWin(boolean didWin) {
		this.didWin = didWin;
	}
	/**
	 * @return the myTurn
	 */
	public boolean isMyTurn() {
		return myTurn;
	}
	/**
	 * @param myTurn the myTurn to set
	 */
	public void setMyTurn(boolean myTurn) {
		this.myTurn = myTurn;
	}
	
	// Method to check if the player has won
	private void checkWin(int territoryAmount)
	{
		// If they hold all the territories they win
		if (territoryAmount == 42)	// Compares their amount of owned territories to the max possible
		{
			didWin = true;	// Sets didWin to true
		}
		
	}

	@Override
	public String toString() {
		return "Player [scan=" + scan + ", PlayerColor=" + PlayerColor + ", choice=" + choice + ", PlayerTurn="
				+ PlayerTurn + ", territoriesOwned=" + territoriesOwned + ", unitsOwned=" + unitsOwned + ", didWin="
				+ didWin + ", myTurn=" + myTurn + "]";
	}
}
