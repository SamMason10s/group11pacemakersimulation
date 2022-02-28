package pacemaker;

public class pacemaker {
	
	// Variables - Pacemaker
	
	// Pacemaker type
	private String pacemaker_Type;
	
	// Battery life and consumption

	private float battery_Life = 100;
	private float battery_Consumption;
	private float battery_Consumption_Rate;
	private boolean battery_Optimization_Mode;

	// Heart rate limits
	private int lower_Heart_Limit = 120;
	private int upper_Heart_Limit = 60;
	
	// Getters and Setters
	
	// Pacemaker type
	public String getPacemaker_Type() {
		return pacemaker_Type;
	}

	public void setPacemaker_Type(String pacemaker_Type) {
		// If dual chamber is required
		if(pacemaker_Type == "AP + VP")
		{
		this.pacemaker_Type = "AP + VP";
		}
		// If single chamber is required
		else
		{
		this.pacemaker_Type = "VP";
		}
	}
	
	// Battery life
	public float getBattery_Life() {
		return battery_Life;
	}

	// Battery consumption
	public float getBattery_Consumption() {
		return battery_Consumption;
	}

	public void setBattery_Consumption(float battery_Consumption) {
		this.battery_Consumption = battery_Consumption;
	}
	
	// Battery consumption rate
	public float getBattery_Consumption_Rate() {
		return battery_Consumption_Rate;
	}

	public void setBattery_Consumption_Rate(float battery_Consumption_Rate) {
		this.battery_Consumption_Rate = battery_Consumption_Rate;
	}
	
	// Battery optimization
	public boolean getBattery_Optimizsation_Mode() {
		return battery_Optimization_Mode;
	}

	public void setBattery_Optimization_Mode(boolean battery_Optimization_Mode) {
		this.battery_Optimization_Mode = battery_Optimization_Mode;
	}

	// Heart rate - Upper and Lower limits
	public int getLower_Heart_Limit() {
		return lower_Heart_Limit;
	}

	public void setLower_Heart_Limit(int lower_Heart_Limit) {
		this.lower_Heart_Limit = lower_Heart_Limit;
	}

	public int getUpper_Heart_Limit() {
		return upper_Heart_Limit;
	}

	public void setUpper_Heart_Limit(int upper_Heart_Limit) {
		this.upper_Heart_Limit = upper_Heart_Limit;
	}	

	// Constrcutor function
	public pacemaker() {
		
		battery_Life = getBattery_Life();
		battery_Consumption = getBattery_Consumption();
		battery_Consumption_Rate = getBattery_Consumption_Rate();
		battery_Optimization_Mode = getBattery_Optimizsation_Mode();
		
	}

}
