

public class Student {
	private int studentId;
	private String name;
	private String birthday;
	private boolean isman;
	
	
	public Student(int id,String name,String bir,boolean isman) {
		this.studentId=id;
		this.name=name;
		this.birthday=bir;
		this.isman=isman;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public boolean isIsman() {
		return isman;
	}
	public void setIsman(boolean isman) {
		this.isman = isman;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
}
