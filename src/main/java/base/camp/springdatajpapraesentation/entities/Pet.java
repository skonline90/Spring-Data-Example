package base.camp.springdatajpapraesentation.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pet {
	// FIELDS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String animalType;
	private String owner;
	private Date dob;

	// CONSTRUCTORS
	public Pet() {
	}

	public Pet(String name, String animalType, String owner, Date dob) {
		this.name = name;
		this.animalType = animalType;
		this.owner = owner;
		this.dob = dob;
	}

	// GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", animalType=" + animalType + ", owner=" + owner + ", dob=" + dob
				+ "]";
	}
}
