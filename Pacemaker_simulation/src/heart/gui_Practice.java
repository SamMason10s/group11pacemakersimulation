package heart;

public class gui_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated constructor stub
		
		 heart heart1 = new heart();
		 heart1.setArterial_Pulse_Width(3000);
		 heart1.setVentricular_Pulse_Width(4000);
		 heart1.setArterial_pulse_Amplitude(38000);
		 heart1.setArterial_pulse_Amplitude(38000);
		// ------------------------------------	
		 
		 new Thread(() -> {
			    try {
					heart1.start_sim();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}).start();
			
		while (true) {
			System.out.println(heart1.toString());
			Thread.sleep(100);
		}
		 
	}

}
