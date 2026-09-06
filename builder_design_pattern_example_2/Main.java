package builder_design_pattern_example_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order.OrderBuilder(500, "Book").buildOrder();
		System.out.println(order);
		Order order2 = new Order.OrderBuilder(500, "Book").setWrapping("Gift Paper").buildOrder();
		System.out.println(order2);
		
		
	}

}
