package ua.lviv.shved.annotation;

public class Phone {
	
	@MyAnnotation("Model of your phone")
	public String model;
	@MyAnnotation("Production country of your phone")
	public String productionCountry;
	@MyAnnotation("Weight of your phone")
	public int weight;
	public int capacity;
	
	public Phone(String model, String productionCountry, int weight, int capacity) {
		super();
		this.model = model;
		this.productionCountry = productionCountry;
		this.weight = weight;
		this.capacity = capacity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProductionCountry() {
		return productionCountry;
	}

	public void setProductionCountry(String productionCountry) {
		this.productionCountry = productionCountry;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", productionCountry=" + productionCountry + ", weight=" + weight
				+ ", capacity=" + capacity + "]";
	}
	
	
	
}
