package homework5.exe1;

public class Profile {
	private ShippingInfo shippingInfo;
	public Profile(ShippingInfo shippingInfo) throws MissingShippingInfoException{
		if(shippingInfo == null)
			throw new MissingShippingInfoException("missing shipping information");
		
		this.setShippingInfo(shippingInfo);
	}
	public ShippingInfo getShippingInfo() {
		return shippingInfo;
	}
	public void setShippingInfo(ShippingInfo shippingInfo) {
		this.shippingInfo = shippingInfo;
	}

}
