package chain_of_responsibility_design_pattern;

public class MAANGBased implements IJobChain{
	
	private IJobChain jobchain;
	@Override
	public void SetNextChain(IJobChain jobChain) {
		// TODO Auto-generated method stub
		this.jobchain = jobChain;
	}

	@Override
	public void getJob(Person person) {
		// TODO Auto-generated method stub
		if(person.getSkillType().equals("MAANG")) {
			System.out.println("Got Selected in MAANG");
		}else {
			System.out.println("Got Rejected in MAANG");
			System.out.println("Apply for Product Based Company");
			this.jobchain.getJob(person);
		}
		
	}
	

}
