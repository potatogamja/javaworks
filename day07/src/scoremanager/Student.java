package scoremanager;

public class Student {
	int id; //�й�
	String stdName; //�л��̸�
	Subject korean; //�������
	Subject math; //���а���
	
	public Student (int id, String name) {
		this.id= id;
		this.stdName = stdName;
		korean = new Subject();
		math = new Subject();
	}
	
	//���� ����� ���� ���� �޼���
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
		
	}
	//���� ���
	public void showInfo() {
		System.out.println(stdName + "�� ���� ������ " + korean.getScorePoint() + "���Դϴ�.");
	}

}
