package chain_of_responsibility_design_pattern;

public class ServiceBased implements IJobChain{

	private IJobChain jobchain;
	@Override
	public void SetNextChain(IJobChain jobChain) {
		// TODO Auto-generated method stub
		this.jobchain = jobChain;
	}

	@Override
	public void getJob(Person person) {
		// TODO Auto-generated method stub
		if(person.getSkillType().equals("Service")) {
			System.out.println("Got Selected in Service Based Company");
		}else {
			System.out.println("Got Rejected in Service Based Company");
			System.out.println("Need to Prepare More");
		}
		
	}

}
