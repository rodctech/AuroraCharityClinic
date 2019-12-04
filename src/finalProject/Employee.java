package finalProject;

public class Employee {

	private int ID_NUMBER;
	private String EMP_LNAME;
	private String EMP_FNAME;
	private String EMP_MID_INITIAL;
	private String EMP_DOB;
	private String EMP_JOB_TITLE;
	private String CREATE_DELETE_ITEM_ALLOW;
	private String EDIT_ITEM_ALLOW;
	private String READ_DATA_ALLOW;
	private String REPORT_ENABLED;
	private String EMP_PASSWORD;
	
	public Employee(int ID_NUMBER, String EMP_LNAME, String EMP_FNAME, String EMP_MID_INITIAL,
			String EMP_DOB, String EMP_JOB_TITLE, String CREATE_DELETE_ITEM_ALLOW, String EDIT_ITEM_ALLOW,
			String READ_DATA_ALLOW, String REPORT_ENABLED, String EMP_PASSWORD) {
		
		
		this.ID_NUMBER = ID_NUMBER;
		this.EMP_LNAME  = EMP_LNAME;
		this.EMP_FNAME = EMP_FNAME;
		this.EMP_MID_INITIAL = EMP_MID_INITIAL;
		this.EMP_DOB = EMP_DOB;
		this.EMP_JOB_TITLE = EMP_JOB_TITLE;
		this.CREATE_DELETE_ITEM_ALLOW  = CREATE_DELETE_ITEM_ALLOW;
		this.EDIT_ITEM_ALLOW  = EDIT_ITEM_ALLOW;
		this.READ_DATA_ALLOW  = READ_DATA_ALLOW;
		this.REPORT_ENABLED = REPORT_ENABLED;
		this.EMP_PASSWORD  = EMP_PASSWORD;
	}
	
	public int getID_NUMBER() { return ID_NUMBER; }
	public void setID_NUMBER(int ID_NUMBER) { this.ID_NUMBER = ID_NUMBER; }
	
	public String getEMP_LNAME() { return EMP_LNAME; }
	public void setEMP_LNAME(String EMP_LNAME) { this.EMP_LNAME = EMP_LNAME; }
	
	public String getEMP_FNAME() { return EMP_FNAME; }
	public void setEMP_FNAME(String EMP_FNAME) { this.EMP_FNAME = EMP_FNAME; }
	
	public String getEMP_MID_INITIAL() { return EMP_MID_INITIAL; }
	public void setEMP_MID_INITIAL(String EMP_MID_INITIAL) { this.EMP_MID_INITIAL  = EMP_MID_INITIAL; }
	
	public String getEMP_DOB() { return EMP_DOB; }
	public void setEMP_DOB(String EMP_DOB) { this.EMP_DOB  = EMP_DOB; }
	
	public String getEMP_JOB_TITLE() { return EMP_JOB_TITLE; }
	public void setEMP_JOB_TITLE(String EMP_JOB_TITLE) { this.EMP_JOB_TITLE  = EMP_JOB_TITLE; }
	
	public String getCREATE_DELETE_ITEM_ALLOW() { return CREATE_DELETE_ITEM_ALLOW; }
	public void setCREATE_DELETE_ITEM_ALLOW(String CREATE_DELETE_ITEM_ALLOW) { this.CREATE_DELETE_ITEM_ALLOW  = CREATE_DELETE_ITEM_ALLOW; }
	
	public String getEDIT_ITEM_ALLOW() { return EDIT_ITEM_ALLOW; }
	public void setEDIT_ITEM_ALLOW(String EDIT_ITEM_ALLOW) { this.EDIT_ITEM_ALLOW  = EDIT_ITEM_ALLOW; }
	
	public String getREAD_DATA_ALLOW() { return READ_DATA_ALLOW; }
	public void setREAD_DATA_ALLOW(String READ_DATA_ALLOW) { this.READ_DATA_ALLOW  = READ_DATA_ALLOW; }
	
	public String getREPORT_ENABLED() { return REPORT_ENABLED; }
	public void setREPORT_ENABLED(String REPORT_ENABLED) { this.REPORT_ENABLED  = REPORT_ENABLED; }
	
	
	public String getEMP_PASSWORD() { return EMP_PASSWORD; }
	public void setEMP_PASSWORD(String EMP_PASSWORD) { this.EMP_PASSWORD  = EMP_PASSWORD; }
	

}
