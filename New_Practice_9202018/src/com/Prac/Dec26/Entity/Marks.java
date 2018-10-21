package com.Prac.Dec26.Entity;

public class Marks {
	
	private String Stuject;
	private double score;
	public String getStuject() {
		return Stuject;
	}
	public void setStuject(String stuject) {
		Stuject = stuject;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	public Marks(String stuject, double score) {
		super();
		Stuject = stuject;
		this.score = score;
	}
	public Marks() {
		super();
	}
	@Override
	public String toString() {
		return "Marks [Stuject=" + Stuject + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Stuject == null) ? 0 : Stuject.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marks other = (Marks) obj;
		if (Stuject == null) {
			if (other.Stuject != null)
				return false;
		} else if (!Stuject.equals(other.Stuject))
			return false;
		if (Double.doubleToLongBits(score) != Double
				.doubleToLongBits(other.score))
			return false;
		return true;
	}
	
	

}
