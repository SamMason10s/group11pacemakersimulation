package heart;

public class heart implements Runnable {
	
	 // Variable - Simulation
	boolean start_Simulation = true;

	// Variables - Heart
	
	// Status
	private String heart_Status;
	
	// Heart rate
	private int heart_Rate = 100;
	
	// AP and AV 
	private int arterial_Pulse_Width;
	private int ventricular_Pulse_Width;
	private int chamber_Distance;
	private int arterial_pulse_Amplitude;
	private int ventricular_pulse_Amplitude;
	
	// is inhibited (Chamber)
	
	// Is pulsed
	private boolean is_V_Pulsed;
	private boolean is_A_Pulsed;
	
	// Getters and Setters
	
	// Atrial and Ventricular pulse width
	public int getArterial_Pulse_Width() {
		return arterial_Pulse_Width;
	}
	public void setArterial_Pulse_Width(int arterial_Pulse_Width) {
		this.arterial_Pulse_Width = arterial_Pulse_Width;
	}
	public int getVentricular_Pulse_Width() {
		return ventricular_Pulse_Width;
	}
	public void setVentricular_Pulse_Width(int ventricular_Pulse_Width) {
		this.ventricular_Pulse_Width = ventricular_Pulse_Width;
	}
	
	// Artrial and Ventricular pulse amplitude
	public int getArterial_pulse_Amplitude() {
		return arterial_pulse_Amplitude;
	}
	public void setArterial_pulse_Amplitude(int arterial_pulse_Amplitude) {
		// Amplitude is limited to 4000 Mv... To replicate regular heart function
		if (arterial_pulse_Amplitude > 4000)
		{
			// If value is greater than 4000 Mv... Simply set value to 4000 Mv
			this.arterial_pulse_Amplitude = 4000;
		}
		else
		{
			// Else stick with user input
			this.arterial_pulse_Amplitude = arterial_pulse_Amplitude;
		}
	}
	public int getVentricular_pulse_Amplitude() {
		return ventricular_pulse_Amplitude;
	}
	public void setVentricular_pulse_Amplitude(int ventricular_pulse_Amplitude) {
		// Amplitude is limited to 4000 Mv... To replicate regular heart function
		if (ventricular_pulse_Amplitude > 4000)
		{
			// If value is greater than 4000 Mv... Simply set value to 4000 Mv
			this.ventricular_pulse_Amplitude = 4000;
		}
		else
		{
			// Else stick with user input
			this.ventricular_pulse_Amplitude = ventricular_pulse_Amplitude;
		}
	}

	// Heart rate
	public int getHeart_Rate() {
		return heart_Rate;
	}
	
	// calculating heart rate
	public void calculateHeart_Rate()
	{	
		// Calculate the heart rate... Taking into consideration both Nodes
		float Rate = (((arterial_Pulse_Width + ventricular_Pulse_Width)/1000)*60);
		
		// Divide by 2... To calculate heart rate 
		Rate = Rate/2;
		
		heart_Rate = (int) Rate;
	}
	
	// Is pulsed (Atrium and Ventricle)
	public boolean isIs_V_Pulsed() {
		return is_V_Pulsed;
	}
	public void setIs_V_Pulsed(boolean is_V_Pulsed) {
		this.is_V_Pulsed = is_V_Pulsed;
	}
	public boolean isIs_A_Pulsed() {
		return is_A_Pulsed;
	}
	public void setIs_A_Pulsed(boolean is_A_Pulsed) {
		this.is_A_Pulsed = is_A_Pulsed;
	}
	
	// Heart status
	public String getHeart_Status() {
		// If heart rate is greater than 0... We can assume that the patient is considered to be 'Alive'
		if(heart_Rate > 0)
		{
			return heart_Status = "Heart is functioning";
		}
		// Else... We can assume that the patient is considered to be 'Dead'
		else
		{
			return heart_Status = "Heart is not functioning";
		}
	}
	
	// function calculate difference in atrium and Ventrical
	public void calculate_Chamber_Difference()
	{
		int diff = ventricular_Pulse_Width - arterial_Pulse_Width;
		chamber_Distance = diff;
	}
	

	// Constrcutor function
	public heart() 
	{
		// Requires variables to be declared based upon user input
		arterial_Pulse_Width = getArterial_Pulse_Width();
		ventricular_Pulse_Width = getVentricular_Pulse_Width();
		arterial_pulse_Amplitude = getArterial_pulse_Amplitude();
		ventricular_pulse_Amplitude = getVentricular_pulse_Amplitude();
		heart_Rate = getHeart_Rate();
		heart_Status = getHeart_Status();
	}
	
	// toString function
	public String toString()
	{
		return ("Current vitals: " + "\n" +
				"--------------------" + "\n" +
				"AP Width: " + arterial_Pulse_Width + "\n" +
				"VP Width: " + ventricular_Pulse_Width + "\n" +
				"AP Amplitude: " + arterial_pulse_Amplitude + "\n" +
				"VP Amplitude: " + ventricular_pulse_Amplitude + "\n" +
				"Heart rate: " + heart_Rate + " (BPM)" + "\n" +
				"Status: " + heart_Status + " Atrium is pulsed: " + is_A_Pulsed + " Ventrical is pulsed: " + is_V_Pulsed);
		
	}
	
	// thread
	
	// Start simulation
	 public void start_sim() throws InterruptedException 
	 {	 
		 	// While simulation is true
			while(this.start_Simulation != false)
				{
				calculate_Chamber_Difference();
					// print out heart details
					//System.out.println(h.toString());
					try {		
						Thread.sleep(arterial_Pulse_Width);
						is_A_Pulsed = true;
						is_V_Pulsed = false;
						Thread.sleep(chamber_Distance);						
						is_V_Pulsed = true;
						is_A_Pulsed = false;
						} 
					
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}	
	 };
	 
	// Stop simulation
	public void stop_sim(heart h) 
	 {
		 h.start_Simulation = false;		
	 }
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
