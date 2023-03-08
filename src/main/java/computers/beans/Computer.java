/**
 * Michael Van Riessen - mjvanriessen
 * CIS175 - Spring 2023
 * Mar 7, 2023
 */
package computers.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Computer {
	@Id
	@GeneratedValue
	private int id;
	private String computerDesc;
	private double computerPrice;
	private int numberOfFans;
	private boolean isRGB;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComputerDesc() {
		return computerDesc;
	}
	public void setComputerDesc(String computerDesc) {
		this.computerDesc = computerDesc;
	}
	public double getComputerPrice() {
		return computerPrice;
	}
	public void setComputerPrice(double computerPrice) {
		this.computerPrice = computerPrice;
	}
	public int getNumberOfFans() {
		return numberOfFans;
	}
	public void setNumberOfFans(int numberOfFans) {
		this.numberOfFans = numberOfFans;
	}
	public boolean isRGB() {
		return isRGB;
	}
	public void setRGB(boolean isRGB) {
		this.isRGB = isRGB;
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", computerDesc=" + computerDesc + ", computerPrice=" + computerPrice
				+ ", numberOfFans=" + numberOfFans + ", isRGB=" + isRGB + "]";
	}
	
	
	

}
