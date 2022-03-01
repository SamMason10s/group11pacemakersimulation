package Pacemaker;

import heart.heart;

public class Pacemaker {
    private heart heart;
	private boolean isPacing;

    private int targetBpm;
    private int targetDiff; //The delay between the atrium and ventricle pulsing
    private int pulseDuration; // The time that each pulse lasts

    private int paced; // 0 = none, 1 = A, 2 = V, 3 = DUAL
    private int sensed; // 0 = none, 1 = A, 2 = V, 3 = DUAL
    private int response; // 0 = none, 1 = Trigger, 2 = Inhibit, 3 = Dual

    public Pacemaker(heart heart) {
        this.heart = heart;
    }

    private void pace(int toPace) throws InterruptedException {
        if (toPace > 0) {
            if (toPace == 1) {
                this.heart.setIs_A_Pulsed(true);
                Thread.sleep(pulseDuration);
                this.heart.setIs_A_Pulsed(false);
            } else if (toPace == 2) {
                this.heart.setIs_V_Pulsed(true);
                Thread.sleep(pulseDuration);
                this.heart.setIs_V_Pulsed(false);
            } else {
                this.heart.setIs_A_Pulsed(true);
                Thread.sleep(pulseDuration);
                this.heart.setIs_A_Pulsed(false);
                
                Thread.sleep(targetDiff-pulseDuration);
                
                this.heart.setIs_V_Pulsed(true);
                Thread.sleep(pulseDuration);
                this.heart.setIs_V_Pulsed(false);
            }
        }
    }

    public void runPacemaker(){
        while (isPacing) {
            
            
        }
    }
}
