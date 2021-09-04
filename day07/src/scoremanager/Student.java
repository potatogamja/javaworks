package scoremanager;

public class Student {
	int id; //학번
	String stdName; //학생이름
	Subject korean; //국어과목
	Subject math; //수학과목
	
	public Student (int id, String name) {
		this.id= id;
		this.stdName = stdName;
		korean = new Subject();
		math = new Subject();
	}
	
	//국어 과목과 점수 생성 메서드
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
		
	}
	//정보 출력
	public void showInfo() {
		System.out.println(stdName + "의 국어 점수는 " + korean.getScorePoint() + "점입니다.");
	}

}
