package nz.ac.vuw.ecs.swen225.gp21.domain;

public class Free extends AbstractTile{

	private String key = "";
	private boolean treasure = false;
	
	/**
	 * Constructor if this free tile contains something
	 * 
	 * @param key the colour of the key
	 * @param treasure if this tile contains treasure
	 */
	public Free(String key, boolean treasure) {
		this.key = key;
		this.treasure = treasure;
	}
	
	/**
	 * Default constructor for a regular tile
	 */
	public Free() {
		
	}
	
	public boolean hasKey() {
		if(key.equals("")) {
			return false;
		} else {
			return true;
		}
	}
	
	public String getKey() {
		return key;
	}
	
	public void removeKey() {
		this.key = "";
	}
	
	@Override
	public void removeTreasure() {
		if(treasure) {
			treasure = false;
		} else {
			throw new IllegalStateException("This free tile doesn't have treasure");
		}
	}
	
	@Override
	public boolean hasTreasure() {
		return treasure;
	}
	
	
	@Override
	public boolean canMoveHere() {
		return super.canMoveHere();
	}
	
	public String toString() {
		
		if(actor.equals("Chap")) {
			return "C";
		} else if(key.equals("") && treasure == false) {
			return "_";
		} else if(treasure == true) {
			return "T";
		} else {
			return key;
		}
		
		
	}

}
