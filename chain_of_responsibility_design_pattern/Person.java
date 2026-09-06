package chain_of_responsibility_design_pattern;

public class Person {
	private String skillType;
	
	public Person(String skillType) {
		this.skillType = skillType;
	}
	public String getSkillType() {
		return skillType;
	}
}
