package pl.daniels.common;

public class ShipData {

	private String name;
	private int value;
	private String comment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "ShipData [name=" + name + ", value=" + value + ", comment=" + comment + "]";
	}
	
}
