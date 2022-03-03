package Pacemaker;

import heart.heart;

public class Pacemaker {
    private heart heart;
	private boolean isPacing;
    
    private int batterySize;
    private int batteryLoad;

    private int targetBpm;
    private int targetDiff; //The delay between the atrium and ventricle pulsing
    private int pulseDuration; // The time that each pulse lasts

    private int paced; // 0 = none, 1 = A, 2 = V, 3 = DUAL
    private int sensed; // 0 = none, 1 = A, 2 = V, 3 = DUAL
    private int response; // 0 = none, 1 = Trigger, 2 = Inhibit, 3 = Dual

    public Pacemaker(heart heart) {
        this.heart = heart;
        this.paced = 0;
        this.sensed = 0;
        this.response = 0;
    }

    private void pace(int toPace) throws InterruptedException {
        if (toPace > 0) {
            // If pacing the atrium
            if (toPace == 1) {
                this.heart.setIs_A_Pulsed(true);
                Thread.sleep(pulseDuration);
                this.heart.setIs_A_Pulsed(false);
            } 

            // If pacing the ventricle
            else if (toPace == 2) {
                this.heart.setIs_V_Pulsed(true);
                Thread.sleep(pulseDuration);
                this.heart.setIs_V_Pulsed(false);
            } 

            // If pacing both chambers.
            else {
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

    public void runPacemaker() throws InterruptedException{
        while (this.isPacing) {
            int beatDelay = this.heart.getHeart_Rate();

            if (this.sensed > 0) {
                // If sensing the atrium.
                if (this.sensed == 1) {
                    if (this.heart.isIs_A_Pulsed() & this.response == 1) {
                        Thread.sleep(this.targetDiff);
                        this.pace(this.paced);
                    }
                } 

                // If sensing the ventricle.
                else if (this.sensed == 2) {
                    if (this.heart.isIs_V_Pulsed() & this.response == 1) {
                        Thread.sleep(beatDelay);
                        this.pace(this.paced);
                    }
                }

                // If sensing both chambers.
                else {
                    if (this.response == 1) {
                        //  TODO
                    }
                }
            } 
            
            // If not sensing, just pace the selected chamber(s).
            else {
                this.pace(this.paced);
            }
        }
    }
}
