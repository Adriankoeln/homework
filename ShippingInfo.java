package homework5.exe1;

public class ShippingInfo {
	
	 private String city;
	 private int zip;
	 private String country;
	 public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
		 //exe2
		 if (city == null || city.isEmpty()) {
	            throw new InvalidShippingInfoException("City cannot be empty.");
	        }
	        if (zip <= 0) {
	            throw new InvalidShippingInfoException("Zip code must be a positive number.");
	        }
		 this.setCity(city);
		 this.setZip(zip);
		 this.setCountry(country);
	 }
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	// exe2
	

		

}
