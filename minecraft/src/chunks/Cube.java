package chunks;

public abstract class Cube {
	private Integer hard;
	private Integer with;
	private Integer height;
	private String name;
	public Cube (Integer hard, Integer with, Integer height, String name) {
		this.hard = hard;
		this.with = with;
		this.height = height;
		this.name = name;
	}
	
	public Boolean mine(Integer miner) {
		if (this.hard < miner) {
			return true;
		}
		this.hard -= miner;
		return false;
	}
	
	public abstract Cube destroy();
	
	public Integer getHard() {
		return hard;
	}
	public void setHard(Integer hard) {
		this.hard = hard;
	}
	public Integer getWith() {
		return with;
	}
	public void setWith(Integer with) {
		this.with = with;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
