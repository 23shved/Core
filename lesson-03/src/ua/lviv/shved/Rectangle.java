package ua.lviv.shved;

public class Rectangle {
	private int w;
	private int h;

	Rectangle() {
	}

	public void setWidth(int width) {
		this.w = width;
	}

	public void setHeight(int height) {
		this.h = height;
	}

	Rectangle(int width, int height) {
		this.w = width;
		this.h = height;
	}

	public int areaRect() {
		return calculationOfareaRect(w, h);
	}

	private int calculationOfareaRect(int width, int height) {
		return width * height;
	}

	public int perimeterRect() {
		return calculationOfperimeterRect(w, h);
	}

	private int calculationOfperimeterRect(int width, int height) {
		return 2 * (width + height);
	}
}
