package chain_of_responsibility_design_pattern;

public class Main {
	public static void main(String[] args) {
		
		MAANGBased maangJob =new MAANGBased();
		ProductBased productBasedJob = new ProductBased();
		ServiceBased serviceBasedJob = new ServiceBased();
		
		maangJob.SetNextChain(productBasedJob);
		productBasedJob.SetNextChain(serviceBasedJob);
		
//		Person person = new Person("");
//		Person person = new Person("MAANG");
//		Person person = new Person("Product");
		Person person = new Person("Service");
		maangJob.getJob(person);
		
	}
}
