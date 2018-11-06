package ch.makery.eventhandling;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Simple model class for a person.
 * 
 * @author Marco Jakob
 */
public class Person {

	private final StringProperty firstName;
	private final StringProperty lastName;

	public Person(String firstName, String lastName) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
	}
	
	public StringProperty firstNameProperty() {
		return firstName;
	}

	public String getFirstName() {
		return firstName.get();
	}
	
	public String getLastName() {
		return lastName.get();
	}

	public StringProperty lastNameProperty() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}
	
	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}
	
	@Override
	public String toString() {
		return getFirstName() + " " + getLastName();
	}
}