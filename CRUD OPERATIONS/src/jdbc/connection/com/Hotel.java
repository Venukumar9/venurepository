package jdbc.connection.com;

public class Hotel {
public String locations;
public String hotelname;
public String type;
public String services;
public String businessType;
public double costPerDay;
public String getLocations() {
	return locations;
}
public void setLocations(String locations) {
	this.locations = locations;
}
public String getHotelname() {
	return hotelname;
}
public void setHotelname(String hotelname) {
	this.hotelname = hotelname;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getServices() {
	return services;
}
public void setServices(String services) {
	this.services = services;
}
public String getBusinessType() {
	return businessType;
}
public void setBusinessType(String businessType) {
	this.businessType = businessType;
}
public double getCostPerDay() {
	return costPerDay;
}
public void setCostPerDay(double cost) {
	this.costPerDay = cost;
}

}
