package BaiTap1;

public class BaiTap1_5 {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	public BaiTap1_5() {
	
	}

	public BaiTap1_5(String id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotal() {
		return unitPrice * qty;
	}

	@Override
	public String toString() {
		return "BaiTap1_5 "
				+ "[id=" + id 
				+ ", desc=" + desc 
				+ ", qty=" + qty 
				+ ", unitPrice=" + unitPrice + "]";
	}
}
