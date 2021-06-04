package ua.lviv.shved.plane;

public abstract class Plane extends PlaneControl{

	int length;
	int width;
	int weight;
	
	public Plane(int length, int width, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	
	public void engineStart() {
		System.out.println("Двигун запущено");
	};
	public void planeTakeoff() {
		System.out.println("Літак здійснює взліт");
	};
	public void planeLanding() {
		System.out.println("Літак здійснює посадку");
	};

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
