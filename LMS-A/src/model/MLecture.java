package model;

public class MLecture {

	private int id;
	private String name;
	private String lecturer;
	private int credit;
	private String time;
	
	public MLecture() {}

	public int getId() { return id; }
	public void setId(String id) { 
		this.id = Integer.parseInt(id); 
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getLecturer() {return lecturer;}
	public void setLecturer(String lecturer) {this.lecturer = lecturer;}
	public int getCredit() {return credit;}
	public void setCredit(String credit) {
		this.credit = Integer.parseInt(credit);
	}

	public String getTime() {return time;}
	public void setTime(String time) {this.time = time;}
}
