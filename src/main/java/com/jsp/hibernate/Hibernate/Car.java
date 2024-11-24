package com.jsp.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
@Id
private int carId;
private String carBrand;
private String carModel;
private int price;

public Car() {
}

public Car(int carId, String carBrand, String carModel, int price) {
	
	this.carId = carId;
	this.carBrand = carBrand;
	this.carModel = carModel;
	this.price = price;
}

public int getCarId() {
	return carId;
}

public void setCarId(int carId) {
	this.carId = carId;
}

public String getCarBrand() {
	return carBrand;
}

public void setCarBrand(String carBrand) {
	this.carBrand = carBrand;
}

public String getCarModel() {
	return carModel;
}

public void setCarModel(String carModel) {
	this.carModel = carModel;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Car [carId=" + carId + ", carBrand=" + carBrand + ", carModel=" + carModel + ", price=" + price + "]";
}


}
