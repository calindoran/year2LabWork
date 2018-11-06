package lab13;
// Author	: Oisin Cawley
// Date		: March 2017
// Purpose	: Demo showing how to implement a simple listener

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservablePropertyDemo 
{
	public static void main(String[] args) 
	{
		//DoubleProperty is an Abstract class.
		//SimpleDoubleProperty is a concrete class.
		DoubleProperty balance = new SimpleDoubleProperty();

		balance.addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable ov) {
				System.out.println("The new value is " + balance.doubleValue());
			}
		});

		balance.set(4.5);
		balance.set(46.56);
	}
}
