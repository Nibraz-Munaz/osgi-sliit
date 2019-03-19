package lk.sliit.sa.osgi.persistence.service;

public class Room {

	public static final String RESERVED = "reserved";
	public static final String AVAILABLE = "available";

	private int id;
	private String status;
	private String title;
	private double price;
	private String type;
	
	public static interface Type {
		public String SINGLE = "single";
		public String DOUBLE = "double";
		public String CUSTOM = "custom";
	}
	
	public Room(int id, String status, String title) {
		super();
		this.id = id;
		this.status = status;
		this.title = title;
	}
	
	
	
	public Room(String title, double price, String type) {
		super();
		this.title = title;
		this.price = price;
		this.type = type;
	}



	public Room(int id, String title, double price, String type) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.type = type;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Room() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", status=" + status + ", title=" + title + ", price=" + price + ", type=" + type
				+ "]";
	}


	
	
}
