//컴퓨터학과_20220740_가유빈
public class Plane {

	int id;
	String model;
	int capacity;
	
	public String toString() {
		String rslt = "";
		
		rslt += "식별번호: " + id + "편";
		rslt += "\n모델: " + model;
		rslt += "\n승객수: " + capacity + "명";
		
		return rslt;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Plane() {
		this(0,"모름",0);

	}
	public Plane(int id, String model, int capacity) {
		setId(id);
		setModel(model);
		setCapacity(capacity);
	}

}
