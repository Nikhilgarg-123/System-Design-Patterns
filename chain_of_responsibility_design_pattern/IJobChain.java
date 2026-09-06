package chain_of_responsibility_design_pattern;

public interface IJobChain {
	
	public void SetNextChain(IJobChain jobChain);
	
	/*
	 * Help person to get job
	 * 1. MAANG
	 * 2. Product Based
	 * 3. Service Based
	 * 
	 */
	public void getJob(Person person);
	  
}
