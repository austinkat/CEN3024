//Author Name: Kevin Taylor
//Date: 5/14/2019
//Program Name: Taylor_Drone
//Purpose: Simulation using button, drone movement in x, y,z location

public class Drone extends DroneMovements{
	
	private int x_pos = 0;
	private int y_pos = 0;
	private int z_pos = 0;

	public int getX_pos() {
		return x_pos;
	}

	public void setX_pos(int x_pos) {
		this.x_pos = x_pos;
	}

	public int getY_pos() {
		return y_pos;
	}

	public void setY_pos(int y_pos) {
		this.y_pos = y_pos;
	}

	public int getZ_pos() {
		return z_pos;
	}

	public void setZ_pos(int z_pos) {
		this.z_pos = z_pos;
	}
	
	public String getCoordinates() {
		return (getX_pos() + ", " + getY_pos() + ", " + getZ_pos());
	}

}
