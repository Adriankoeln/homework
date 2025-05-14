package homework5.exe1;

public class EComController {
	static public void main(String[] args) {
		//exe2
		 try {
	            ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
	            Profile profile = new Profile(info);
	            Customer customer = new Customer(profile, 123);

	            System.out.println("Shipping to: " + customer.getShippingCity());

	        } catch (InvalidShippingInfoException e) {
	            System.err.println("Invalid shipping info: " + e.getMessage());
	        } catch (MissingShippingInfoException e) {
	            System.err.println("Missing shipping info: " + e.getMessage());
	        } catch (InvalidCustomerException e) {
	            System.err.println("Invalid customer: " + e.getMessage());
	        }
		
		 
		 
		 //2)Catching specific exceptions allows more accurate error messages.
		//exe1
		try {
		ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
		System.out.println(info.getCity());
		Profile profile = new Profile(info);
		System.out.println(profile.getShippingInfo().getCity());
		Customer customer = new Customer(profile, 123);
		System.out.println(customer.getProfile().getShippingInfo().getCity());
		//Violates the Law of Demeter because of the degree of method chaining. 
		//This causes tight coupling and makes the code fragile to changes in internal structure.
        System.out.println("Shipping to: " + customer.getProfile().getShippingInfo().getCity());
        //as an improvement, we can add a method getShippingCity to reduce the coupling
        System.out.println("Shipping to: " + customer.getShippingCity());
		}
		catch(Exception e) {
			System.out.println("");
		}
	}

}
