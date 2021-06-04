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
		System.out.println("�������� ��� ����� �� " + move + " ��, ����� �������� ������� � " + distance + " ��");
	}
	public void moveBottom() {
		double move = Math.round(100 * Math.random());
		distance += move;
		System.out.println("�������� ��� ���� �� " + move + " ��, ����� �������� ������� � " + distance + " ��");
	}

	public void moveLeft() {
		double move = Math.round(100 * Math.random());
		distance += move;
		System.out.println("�������� ��� ������ �� " + move + " ��, ����� �������� ������� � " + distance + " ��");
	}

	public void moveRight() {
		double move = Math.round(100 * Math.random());
		distance += move;
		System.out.println("�������� ��� �������� �� " + move + " ��, ����� �������� ������� � " + distance + " ��");
	}

}
