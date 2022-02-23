package heart;

public class heart {
	
	// Variable - Simulation start
	boolean start_Simulation = false;

	// Variables - Heart
	String heart_Status;
	int heart_Rate;
	int lower_rate_Limit = 70;
	int higher_rate_Limit = 180;
	int atrial_pulse;
	int ventricular_pulse;
	
	// Getters and Setters
	
	// Heart status
	public String getHeart_Status() {
		return heart_Status;
	}
	public void setHeart_Status(String heart_Status) {
		this.heart_Status = heart_Status;
	}
	
	// Heart rate
	public int getHeart_Rate() {
		return heart_Rate;
	}
	public void setHeart_Rate(int heart_Rate) {
		this.heart_Rate = heart_Rate;
	}

	// Lower limit
	public int getLower_rate_Limit() {
		return lower_rate_Limit;
	}
	public void setLower_rate_Limit(int lower_rate_Limit) {
		this.lower_rate_Limit = lower_rate_Limit;
	}

	// Higher limit
	public int getHigher_rate_Limit() {
		return higher_rate_Limit;
	}
	public void setHigher_rate_Limit(int higher_rate_Limit) {
		this.higher_rate_Limit = higher_rate_Limit;
	}

	// Atrial pulse
	public int getAtrial_pulse() {
		return atrial_pulse;
	}
	public void setAtrial_pulse(int atrial_pulse) {
		this.atrial_pulse = atrial_pulse;
	}

	// Ventricular pulse
	public int getVentricular_pulse() {
		return ventricular_pulse;
	}
	public void setVentricular_pulse(int ventricular_pulse) {
		this.ventricular_pulse = ventricular_pulse;
	}

	// Constrcutor
	public heart() 
	{
		// Requires variables to be declared based upon user input
		
		heart_Status = getHeart_Status();
		heart_Rate = getHeart_Rate();
		lower_rate_Limit = getLower_rate_Limit();
		higher_rate_Limit = getHigher_rate_Limit();
		atrial_pulse = getAtrial_pulse();
		ventricular_pulse = getVentricular_pulse();
		
	}
	
	// Method to return calculated pulse while the simulation is running
	public int return_calculated_pulse(int heart_rate)
	{	
		// Calculate pulse
		int pulse = heart_rate / 60;
		
		// If the simulation has started, Ensure pulse is alternated between lower and higher limits
		while (start_Simulation == true)
		{
			pulse = (int)Math.floor(Math.random()*(higher_rate_Limit-lower_rate_Limit+1)+lower_rate_Limit);
			return pulse;
		}
		
		return 0;
							
	}

}
