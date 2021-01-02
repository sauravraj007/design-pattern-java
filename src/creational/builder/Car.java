package creational.builder;

public class Car {
	private int modelNumber;
	private String modelName;
	private String manufacturedBy;
	private String type;
	private String color;
	private int makeYear;
	private double price;
	
	private Car(CarBuilder car) {
		this.type = car.type;
		this.manufacturedBy = car.manufacturedBy;
		this.modelNumber = car.modelNumber;
		this.modelName = car.modelName;
		this.color = car.color;
		this.makeYear = car.makeYear;
		this.price = car.price;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public String getModelName() {
		return modelName;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", modelName=" + modelName + ", manufacturedBy=" + manufacturedBy
				+ ", type=" + type + ", color=" + color + ", makeYear=" + makeYear + ", price=" + price + "]";
	}

	public static class CarBuilder {
		
		private int modelNumber;
		private String modelName;
		private String manufacturedBy;
		private String type;
		private String color;
		private int makeYear;
		private double price;
		
		public CarBuilder setModelNumber(int modelNumber) {
			this.modelNumber = modelNumber;
			return this;
		}
		public CarBuilder setModelName(String modelName) {
			this.modelName = modelName;
			return this;
		}
		public CarBuilder setManufacturedBy(String manufacturedBy) {
			this.manufacturedBy = manufacturedBy;
			return this;
		}
		public CarBuilder setType(String type) {
			this.type = type;
			return this;
		}
		public CarBuilder setColor(String color) {
			this.color = color;
			return this;
		}
		public CarBuilder setMakeYear(int makeYear) {
			this.makeYear = makeYear;
			return this;
		}
		public CarBuilder setPrice(double price) {
			this.price = price;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
		
		
	}
}
