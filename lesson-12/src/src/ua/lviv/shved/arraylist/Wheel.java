package src.ua.lviv.shved.arraylist;



public class Wheel {

	private int diamter;
	private String material;

	

	public Wheel(int diamter, String material) {
		super();
		this.diamter = diamter;
		this.material = material;
	}




	public int getDiamter() {
		return diamter;
	}




	public void setDiamter(int diamter) {
		this.diamter = diamter;
	}




	public String getMaterial() {
		return material;
	}




	public void setMaterial(String material) {
		this.material = material;
	}




	@Override
	public String toString() {
		return " Wheel diamter is " + diamter + ", and created of " + material + " material";
	}
	
	
	
	
	
	
}
