package excercise;

public class Engineer extends Employee{
	
	private String skillset;
	
	public Engineer(String name, String skillset) {
		super(name);
		this.skillset = skillset;
	}
	//�Ű� ������ �ִ� ����� ��ӹ��� ���� �ݵ�� �θ��� ��������� super()�� �����
	


	
	public String getSkillSet() {
		return skillset;
		
	}

	public void setSkillset() {
		this.skillset = skillset;
		
	}
}
