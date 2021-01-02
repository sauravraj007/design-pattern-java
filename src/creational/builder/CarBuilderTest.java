package creational.builder;

public class CarBuilderTest {

	public static void main(String[] args) {
		Car.CarBuilder carbuilder = new Car.CarBuilder();
		
		Car tesla_model_3 = carbuilder.setManufacturedBy("Tesla")
									  .setMakeYear(2020)
									  .setColor("Charcoal Black")
									  .setModelName("Model 3")
									  .setPrice(6_000_000)
									  .setType("Petrol")
									  .setModelNumber(93747)
									  .build();

		System.out.println(tesla_model_3);

	}

}
