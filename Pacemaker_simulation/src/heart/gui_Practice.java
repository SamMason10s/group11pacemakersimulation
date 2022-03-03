package heart;

public class gui_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated constructor stub
		
		 // Heart (object instantiation)
		 heart heart1 = new heart();
		 // Heart (Set values)
		 heart1.setArterial_Pulse_Width(3000);
		 heart1.setVentricular_Pulse_Width(4000);
		 heart1.setArterial_pulse_Amplitude(38000);
		 heart1.setVentricular_pulse_Amplitude(38000);
		 
		 // Create new thread
		 new Thread(() -> {
			    try {
			    	// Start simulation
					heart1.start_sim();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}).start();
		
		 // Infinite while loop... To test thread and ensure values are printed.
		 while (true) {
			System.out.println(heart1.toString());
			Thread.sleep(100);
		}
		 
	}

}
