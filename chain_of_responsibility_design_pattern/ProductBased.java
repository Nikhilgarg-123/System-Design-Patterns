package chain_of_responsibility_design_pattern;

public class ProductBased implements IJobChain{
	
	private IJobChain jobchain;
	@Override
	public void SetNextChain(IJobChain jobChain) {
		// TODO Auto-generated method stub
		this.jobchain = jobChain;
	}

	@Override
	public void getJob(Person person) {
		// TODO Auto-generated method stub
		if(person.getSkillType().equals("Product")) {
			System.out.println("Got Selected in Product Based Company");
		}else {
			System.out.println("Got Rejected in Product Based Company");
			System.out.println("Apply for Service Based Company");
			this.jobchain.getJob(person);
		}
		
	}
}
