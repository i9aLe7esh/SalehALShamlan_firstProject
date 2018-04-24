
public class order {
	private String type;
	private int quantity;
	  
	
	
	public order() {
		type=null;
		quantity=0;
	}
	public order(String x, int y) {
		type=x;
		quantity=y;
	}
	public void setType(String x) {
		type=x;
	}
	public void setQuantity(int y) {
		quantity=y;
	}
	public String getType() {
		return type;
	}
	public int getQuantity() {
		return quantity;
	}
}
