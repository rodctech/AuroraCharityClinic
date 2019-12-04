package finalProject;

import java.util.Comparator;

public class Clinic_Inventory {
	
	private int ITEM_NUMBER;
	private String MAIN_CATEGORY;
	private String SUBCATEGORY;
	private String DESCRIPTION;
	private String SIZE;
	private String ITEM_UNIT;
	private int MIN_QTY_REQUIRED;
	private int QTY_ON_HAND;
	private int VEND_NUMBER;
	
	public Clinic_Inventory (int ITEM_NUMBER, String MAIN_CATEGORY, String SUBCATEGORY,
			String DESCRIPTION, String SIZE, String ITEM_UNIT, int MIN_QTY_REQUIRED,
			int QTY_ON_HAND, int VEND_NUMBER) {
		
		this.ITEM_NUMBER = ITEM_NUMBER;
		this.MAIN_CATEGORY  = MAIN_CATEGORY;
		this.SUBCATEGORY = SUBCATEGORY;
		this.DESCRIPTION = DESCRIPTION;
		this.SIZE = SIZE;
		this.ITEM_UNIT = ITEM_UNIT;
		this.MIN_QTY_REQUIRED = MIN_QTY_REQUIRED;
		this.QTY_ON_HAND = QTY_ON_HAND;
		this.VEND_NUMBER = VEND_NUMBER;
	}
	
	public int getITEM_NUMBER() { return ITEM_NUMBER; }
	public void setITEM_NUMBER(int ITEM_NUMBER) { this.ITEM_NUMBER = ITEM_NUMBER; }
	
	public String getMAIN_CATEGORY() { return MAIN_CATEGORY; }
	public void setMAIN_CATEGORY(String MAIN_CATEGORY) { this.MAIN_CATEGORY = MAIN_CATEGORY; }
	
	public String getSUBCATEGORY() { return SUBCATEGORY; }
	public void setSUBCATEGORY(String SUBCATEGORY) { this.SUBCATEGORY  = SUBCATEGORY; }
	
	public String getDESCRIPTION() { return DESCRIPTION; }
	public void setDESCRIPTION(String DESCRIPTION) { this.DESCRIPTION = DESCRIPTION; }
	
	public String getSIZE() { return SIZE; }
	public void setSIZE(String SIZE) { this.SIZE  = SIZE; }
	
	public String getITEM_UNIT() { return ITEM_UNIT; }
	public void setITEM_UNIT(String ITEM_UNIT) { this.ITEM_UNIT  = ITEM_UNIT; }
	
	public int getMIN_QTY_REQUIRED() { return MIN_QTY_REQUIRED; }
	public void setMIN_QTY_REQUIRED(int MIN_QTY_REQUIRED) { this.MIN_QTY_REQUIRED  = MIN_QTY_REQUIRED; }
	
	public int getQTY_ON_HAND() { return QTY_ON_HAND; }
	public void setQTY_ON_HAND(int QTY_ON_HAND) { this.QTY_ON_HAND  = QTY_ON_HAND; }
	
	public int getVEND_NUMBER() { return VEND_NUMBER; }
	public void setVEND_NUMBER(int VEND_NUMBER) { this.VEND_NUMBER = VEND_NUMBER; }
	
	
	public String toMapString() { return "\nMAIN_CATEGORY: " + this.MAIN_CATEGORY + "\nSUBCATEGORY: " + this.SUBCATEGORY +  "\nDESCRIPTION: " +
			 this.DESCRIPTION + "\nSIZE: " + this.SIZE + "\nITEM_UNIT: " + this.ITEM_UNIT + "\nMIN_QTY_REQUIRED: " + 
			 this.MIN_QTY_REQUIRED + "\nQTY_ON_HAND: " + this.QTY_ON_HAND + "\nVEND_NUMBER: " + this.VEND_NUMBER; }
			 
	
	public String LinkedListString() { return "ITEM_NUMBER: " + "\n" + this.ITEM_NUMBER + "SUBCATEGORY" + "\n" + this.SUBCATEGORY + "DESCRIPTION" + "\n" + this.DESCRIPTION + 
			"SIZE\n" + this.SIZE + "ITEM_UNIT\n" + this.ITEM_UNIT + "MIN_QTY_REQUIRED\n" + this.MIN_QTY_REQUIRED + "QTY_ON_HAND\n" + this.QTY_ON_HAND + 
			"\n" + "VEND_NUMBER%15s" + this.VEND_NUMBER; }
	 
	static class Clinic_Inventory_Comparator implements Comparator<Clinic_Inventory> {

		@Override
		public int compare(Clinic_Inventory o1, Clinic_Inventory o2) {
			
			return 0;
		}
		
	}
}