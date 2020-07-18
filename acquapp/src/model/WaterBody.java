package model;

public class WaterBody {

	// Mandatory
	private int id;
	private String name;
	private String river;
	private String basin;
	
	// Optional
	private String type;
	private String city;
	private String province;//
	
	public WaterBody(int id, String name, String river, String basin, String type, String city, String province) {
		super();
		this.id = id;
		this.name = name;
		this.river = river;
		this.basin = basin;
		this.type = type;
		this.city = city;
		this.province = province;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRiver() {
		return river;
	}

	public void setRiver(String river) {
		this.river = river;
	}

	public String getBasin() {
		return basin;
	}

	public void setBasin(String basin) {
		this.basin = basin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	
}
