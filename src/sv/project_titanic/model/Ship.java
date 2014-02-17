package sv.project_titanic.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Ship 
{
	private static ArrayList<Coordinate> coords;

	
	public Ship(ArrayList<Coordinate> inputCoords){
		coords = new ArrayList<Coordinate>();
		addShip(inputCoords);
	}
	
	/**
	 * Private method to add coords to arrayList.
	 */
	private void addShip(ArrayList<Coordinate> inputCoords)
	{
		for(Coordinate inputCoord : inputCoords)
		{
			coords.add(inputCoord);
		}
	}
	public ArrayList<Coordinate> getCoords(){
		return coords;
	}
	
	
	/**
	 * Checks if coord is a hit on the ship.
	 * Returns nothing but removes the corresponding Coordinate object if hit.
	 */
	public void shipHit(Coordinate coord)
	{
		Iterator<Coordinate> it = coords.iterator();
		
		while(it.hasNext()){
			Coordinate shipCoord = it.next();
			
			if(shipCoord.equals(coord)){
				it.remove();
				return;
			}
		}
	}
	
	/**
	 * Checks if coords contains any Coordinate objects.
	 * @return True if no Coordinate objects exist in coords.
	 */
	public boolean noMoreShip()
	{
		if(coords.isEmpty()){
			return true;
		}
		return false;
	}
	
	/**
	 * Returns True if coords contains coord.
	 * @return True if the ship contains the coordinate.
	 */
	public boolean hasCoordinate(Coordinate coord)
	{
		for(Coordinate shipCoord : coords){
			if(shipCoord.equals(coord)){
				return true;
			}
		}
		return false;
	}

	public ArrayList<Coordinate> getCoordinates() {
		return coords;
	}
}


