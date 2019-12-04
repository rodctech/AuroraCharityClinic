package database;

public class Aurora_Charity_Clinic {
	
	
	private int item;
	private String category;
	private String sub_Category;
	private String desc;
	private String size;
	private String item_unit;
	private int min_qty;
	private int qty;
	private int ven;
	public Aurora_Charity_Clinic(int item, String category, String sub_Category, String desc, String size,
			String item_unit, int min_qty, int qty, int ven) {
		super();
		this.item = item;
		this.category = category;
		this.sub_Category = sub_Category;
		this.desc = desc;
		this.size = size;
		this.item_unit = item_unit;
		this.min_qty = min_qty;
		this.qty = qty;
		this.ven = ven;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSub_Category() {
		return sub_Category;
	}
	public void setSub_Category(String sub_Category) {
		this.sub_Category = sub_Category;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getItem_unit() {
		return item_unit;
	}
	public void setItem_unit(String item_unit) {
		this.item_unit = item_unit;
	}
	public int getMin_qty() {
		return min_qty;
	}
	public void setMin_qty(int min_qty) {
		this.min_qty = min_qty;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getVen() {
		return ven;
	}
	public void setVen(int ven) {
		this.ven = ven;
	}
	
	

}
