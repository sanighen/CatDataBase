package data;

public class Cat implements FelineInterface {

	private String name;
	private String race;
	private int year;
	private Integer id;

	public Cat(Integer id, String name, String race, int year) {
		this.id = id;
		this.name = name;
		this.race = race;
		this.year = year;
	}

	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Race: " + race + ", Year: " + year;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setRace(String race) {
		this.race = race;

	}

	@Override
	public String getRace() {
		return race;
	}

	@Override
	public void setYear(int year) {
		this.year = year;

	}

	@Override
	public int getYear() {
		return year;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;

	}

	@Override
	public Integer getId() {
		return id;
	}

	public Cat clone() {
		try {
			return (Cat) super.clone();
		} catch (CloneNotSupportedException e) {
			return new Cat(this.id, this.name, this.race, this.year);
		}

	}
	
	public FelineInterface setCat (Cat cat) {
		return cat;
	}

}