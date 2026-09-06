package builder_design_pattern_example_2;

public class Order {
	// Mandatory Attributes
	private float price;
	private String name;
	// Optional Attributes
	private String wrapping;
	
	public Order(OrderBuilder orderBuilder) {
		this.price = orderBuilder.price;
		this.name = orderBuilder.name;
		this.wrapping = orderBuilder.wrapping;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String val = String.format("Order price=%s, Name = %s, wrapping = %s",
                price, name, wrapping);
		return val;
	}
	
	
	public static class OrderBuilder implements IOrder{
		// Mandatory Attributes
		private float price;
		private String name;
		// Optional Attributes
		private String wrapping;
		
		public OrderBuilder(float price, String name) {
			this.price = price;
			this.name = name;
		}
		
		public OrderBuilder setWrapping(String wrapping) {
			this.wrapping= wrapping;
			return this;
		}
		
		@Override
		public Order buildOrder() {
			// TODO Auto-generated method stub
			return new Order(this);
		}
		
	}
	
}
