package homework5.exe1;

public class Customer {
	private Profile profile;
	private int id;

	public Customer(Profile profile, int id) throws InvalidCustomerException {
		if (profile == null) {
			throw new InvalidCustomerException("Profile is missing.");
		}
		if (id < 0) {
			throw new InvalidCustomerException("Customer ID cannot be negative.");
		}
		this.setProfile(profile);
		this.setId(id);
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	  // The way to fix for Law of Demeter
    public String getShippingCity() {
        return profile.getShippingInfo().getCity();
    }
}
