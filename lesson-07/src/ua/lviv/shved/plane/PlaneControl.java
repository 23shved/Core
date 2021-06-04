package ua.lviv.shved.plane;

public class PlaneControl {
	double distance = 0  ;
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getDistance() {
		return distance;
	}
	public void moveTop() {
		double move = Math.round(100 * Math.random());
		distance += move;
		System.out.println("«д≥йснено рух вверх на " + move + " км, нараз≥ пройдено в≥дстань у " + distance + " км");
	}
	public void moveBottom() {
		double move = Math.round(100 * Math.random());
		distance += move;
		System.out.println("«д≥йснено рух вниз на " + move + " км, нараз≥ пройдено в≥дстань у " + distance + " км");
	}

	public void moveLeft() {
		double move = Math.round(100 * Math.random());
		distance += move;
		System.out.println("«д≥йснено рух л≥воруч на " + move + " км, нараз≥ пройдено в≥дстань у " + distance + " км");
	}

	public void moveRight() {
		double move = Math.round(100 * Math.random());
		distance += move;
		System.out.println("«д≥йснено рух праворуч на " + move + " км, нараз≥ пройдено в≥дстань у " + distance + " км");
	}

}
