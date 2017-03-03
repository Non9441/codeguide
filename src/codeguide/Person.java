package codeguide;

/**
 * Person class contain information of one person.
 * Once it has been created it should not be modifiable.
 * @author Non Puthikanon
 *
 */
public class Person {
	long id;
	String name;
	String gender;
	//TODO modify this attributes so the class become immutable.
	
	//TODO modify some methods of this class so that it become immutable.
	/**
	 * Constructor of Person class.
	 * @param id is a person id.
	 * @param name is a person name.
	 * @param gender is a person gender.
	 */
	public Person(long id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	/**
	 * This method return name of this person
	 * @return is a name of this person.
	 */
	public String getName() {
		return this.name;
	}
	
	//Should it has a set method here??
	/**
	 * This method set name variable of this person.
	 * @param name is a name you want to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * return gender of this person.
	 * @return gender of this person.
	 */
	public String getGender() {
		return this.gender;
	}
	
	/**
	 * set gender for this person.
	 * @param gender is gender you want for this person.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * get this person id.
	 * @return id of this person.
	 */
	public long getID() {
		return this.id;
	}
	
	/**
	 * set id for this person.
	 * @param id is a id you want to set.
	 */
	public void setID(long id) {
		this.id = id;
	}
	
	/**
	 * return String of this person.
	 * @return String of this person.
	 */
	public String toString() {
		return (this.name+" "+this.id+" "+this.gender);
	}

}
