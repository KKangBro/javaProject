package com.shinhan.day05;

// modifier
// 접근 권한: public, protected, 생략, private 중에 하나 선택
// 활용 방법: static, fianl 여러개 선택 가능
public class Student {
	// 1. field(data 저장하기위한 변수들 정의): instance 변수, static 변수
	private String stdId; // private: Student class 내에서만 접근 가능.
	public String name; // public: 모든 package에서 접근 가능
	String major; // 생략: 같은 package에서 접근 가능
	protected int score; // protected: 같은 package에서 접근 가능, 다른 package이면 상속받은 자식은 접근 가능.
	final String schoolName = "신한금융대학"; // final: 초기화가 1회 (선언시, 생성시)
	public static final String NATION = "대한민국"; // static fianl: 상수, class변수, 초기화가 1회 (선언시)
	public static int count; // class변수.

	public Student(String stdId, String name) {
		// default생성자는 컴파일시에 자동으로 .class에 추가된다. 재정의하면 생성안됨.
		this(stdId, name, null, 0);
	}

	public Student(String stdId, String name, String major) {
		this(stdId, name, major, 0);
	}

	public Student(String stdId, String name, String major, int score) {
		this.stdId = stdId;
		this.name = name;
		this.major = major;
		this.score = score;
		count++;
	}

	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public static String getNation() {
		return NATION;
	}

	@Override
	public String toString() {
		return "Student정보 [stdId=" + stdId + ", name=" + name + ", major=" + major + ", score=" + score + ", schoolName="
				+ schoolName + "]";
	}

}
