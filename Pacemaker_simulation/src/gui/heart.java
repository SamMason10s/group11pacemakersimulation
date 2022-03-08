package gui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class heart {

    public static class MyFrame extends JFrame {


        public MyFrame() {

            JFrame jf = new JFrame("TEAM 11");
            jf.setFont(new Font("微软雅黑", Font.BOLD, 16));

            jf.setLayout(null);

            jf.setBounds(550,300,1200,1000);
            jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


            JPanel jp = new JPanel(null);
            jp.setPreferredSize(new Dimension(220, 250));
            jp.setBorder(new TitledBorder(new EtchedBorder(), "Heart"));


            JLabel JL1 = new JLabel("User Name");
            JL1.setFont((new Font("微软雅黑", Font.BOLD, 16)));
            JL1.setBounds(20, 20, 90, 40);


            JButton button = new JButton("Detail");
            button.setFont((new Font("微软雅黑", Font.BOLD, 16)));
            button.setBounds(200, 20, 90, 40);
            button.setEnabled(true);
            button.addActionListener((e) -> {

                //detail infobox

                JDialog jdl2 = new JDialog(jf, "Detail");

                jdl2.setBounds(400, 200, 400, 200);

                jdl2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

                jdl2.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

                JLabel JDL1 = new JLabel("User name");
                JTextField JDLX1 = new JTextField(25);
                JLabel JDL2 = new JLabel("User age");
                JTextField JDLX2 = new JTextField(25);
                JLabel JDL3 = new JLabel("Duration of illness");
                JTextField JDLX3 = new JTextField(20);
                JLabel JDL4 = new JLabel("Attending Doctor");
                JTextField JDLX4 = new JTextField(20);

                jdl2.add(JDL1);
                jdl2.add(JDLX1);
                jdl2.add(JDL2);
                jdl2.add(JDLX2);
                jdl2.add(JDL3);
                jdl2.add(JDLX3);
                jdl2.add(JDL4);
                jdl2.add(JDLX4);
                jdl2.setVisible(true);


            });


            JLabel JL2 = new JLabel("Heart Status");
            JL2.setFont(new Font("微软雅黑", Font.BOLD, 16));
            JL2.setBounds(20, 70, 200, 40);
            jp.add(JL2);


            JTextField display = new JTextField();
            display.setFont((new Font("微软雅黑", Font.BOLD, 16)));
            display.setBounds(200, 70, 90, 40);


            JLabel JL3 = new JLabel("Starting Heartrate");
            JL3.setFont((new Font("微软雅黑", Font.BOLD, 16)));
            JL3.setBounds(20, 120, 200, 40);

            JTextField start = new JTextField();
            start.setFont((new Font("微软雅黑", Font.BOLD, 16)));
            start.setBounds(200, 120, 90, 40);


            JLabel JL4 = new JLabel("Heartrate");
            JTextField heartrate = new JTextField();
            JL4.setFont((new Font("微软雅黑", Font.BOLD, 16)));
            JL4.setBounds(20, 170, 90, 40);
            heartrate.setFont((new Font("微软雅黑", Font.BOLD, 16)));
            heartrate.setBounds(200, 170, 90, 40);

            JLabel JL5 = new JLabel("Chamber Delay");
            JTextField CH=new JTextField();
            JL5.setFont((new Font("微软雅黑", Font.BOLD, 16)));
            JL5.setBounds(20, 220, 200, 40);
            CH.setFont((new Font("微软雅黑", Font.BOLD, 16)));
            CH.setBounds(200, 220, 90, 40);


            JButton confirm = new JButton("Start Heart");
            confirm.setFont(new Font("微软雅黑", Font.BOLD, 16));
            confirm.setBounds(300, 120, 180, 40);
            confirm.setEnabled(true);
            confirm.addActionListener((e) -> {
                String dis=display.getText();
                int disL=dis.length();
                String sta=start.getText();
                int staL=sta.length();
                String hea=heartrate.getText();
                int heaL=hea.length();
                String ch=CH.getText();
                int chL=ch.length();

                if( disL == 0 || staL  == 0 || heaL == 0 || chL == 0){

                    JOptionPane.showMessageDialog(jp,"Please Enter All The Information of Heart Setting!");

                }else{
                    /*
                     * This Place should be the operation to activate the Heart to start
                     */
                    JOptionPane.showMessageDialog(jp," Start Successful!");
                }


            });





            jp.add(JL1);
            jp.add(button);

            jp.add(display);
            jp.add(JL3);
            jp.add(start);
            jp.add(confirm);
            jp.add(JL4);
            jp.add(heartrate);
            jp.add(JL5);
            jp.add(CH);
            jp.setVisible(true);

            jf.add(jp, null);
            jp.setBounds(500,20,500,270);



            //JIALIN

            /* 
             * YuxinWang
             * Heart display section and pacemaker section
             */
            /*Declaring variables*/
            //panel
            JPanel heartPanel ;
            JPanel pacemakerPanel;
            JPanel atrialPanel ;
            JPanel ventricularPanel ;
            JPanel startBatteryPanel;

            //label
            JLabel heartFigure;
			/*JLabel pacemakerLabel;
			 JLabel atrialLabel;
			 JLabel ventricularLabel;*/
            JLabel apLabel;
            JLabel apdLabel;
            JLabel vpLabel;
            JLabel vpdLabel;
            JLabel batteryLife;
            //JLabel batteryLifeDay;

            //text field

            JTextField apText;
            JTextField apdText;
            JTextField vpText;
            JTextField vpdText;
            JTextField blDisplay;

            //button
            JButton pacemakerStartButton;
            JButton heartAtriumButton;
            JButton heartVentricleButton;
            /*Instantiating components*/

            /*Panels*/
            //Heart Panel
            heartPanel = new JPanel(null);
            heartPanel.setPreferredSize(new Dimension(450, 270));
            heartPanel.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"Heart Display"));
            
            
            //Pacemaker Panel
            pacemakerPanel = new JPanel();
            pacemakerPanel.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"Pacemaker"));
            //Atrial Panel
            atrialPanel = new JPanel(new GridLayout(2, 2,10,10));
            atrialPanel.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"Atrial"));
            //Ventricular Panel
            ventricularPanel = new JPanel(new GridLayout(2,2,10,10));
            ventricularPanel.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"Ventricular"));
            //StartBattery Panel
            startBatteryPanel = new JPanel(null);
            startBatteryPanel.setPreferredSize(new Dimension(200, 150));
            //startBatteryPanel.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"test"));

            /*Labels*/
            //Heart figure display label
            heartFigure = new JLabel();
            ImageIcon heartImg=new ImageIcon("Pacemaker_simulation\\img\\CartoonHeart.png");//The image can change to the real heart version which in the same folder
            heartImg.setImage(heartImg.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT )); //Scale the image to the required size
            heartFigure.setIcon(heartImg);
            heartFigure.setBounds(150, 30, 150, 150);
            heartFigure.setPreferredSize(new Dimension(150,150));//Setting the label size



			/*//Pacemaker model title label
			 pacemakerLabel = new JLabel("Pacemaker");
			 pacemakerLabel.setHorizontalAlignment(SwingConstants.CENTER);
			 pacemakerLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
			*/
			/* //Atrial label
			 atrialLabel = new JLabel("Atrial");
			 atrialLabel.setHorizontalAlignment(SwingConstants.LEFT);
			 atrialLabel.setFont(new Font("微软雅黑",Font.BOLD,16));*/
			/* //Ventricular label
			 ventricularLabel = new JLabel("Ventricular");
			 ventricularLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			 ventricularLabel.setFont(new Font("微软雅黑",Font.BOLD,16));*/

            //Atrial pulse label, Atrial pulse delay label
            apLabel = new JLabel("Atrial Pulse");
            apLabel.setHorizontalAlignment(SwingConstants.LEFT);
            apLabel.setFont(new Font("微软雅黑",Font.BOLD,16));

            apdLabel = new JLabel("Atrial Pulse Delay");
            apdLabel.setHorizontalAlignment(SwingConstants.LEFT);
            apdLabel.setFont(new Font("微软雅黑",Font.BOLD,16));

            //Ventricular pulse label, Ventricular pulse delay label
            vpLabel = new JLabel("Ventricular Pulse");
            vpLabel.setHorizontalAlignment(SwingConstants.LEFT);
            vpLabel.setFont(new Font("微软雅黑",Font.BOLD,16));

            vpdLabel = new JLabel("Ventricular Pulse Delay");
            vpdLabel.setHorizontalAlignment(SwingConstants.RIGHT);
            vpdLabel.setFont(new Font("微软雅黑",Font.BOLD,16));

            //BatteryLife label, battery life Day;
            batteryLife = new JLabel("Battery Life:");
            //batteryLife.setHorizontalAlignment(SwingConstants.CENTER);
            batteryLife.setFont(new Font("微软雅黑",Font.BOLD,16));
            batteryLife.setBounds(50, 0, 180, 40);
			/* batteryLifeDay = new JLabel("Day");
			 batteryLifeDay.setHorizontalAlignment(SwingConstants.RIGHT);
			 batteryLifeDay.setFont(new Font("微软雅黑",Font.BOLD,16));
			 */

            /*Text Files*/          
            //Atrial pulse text file, Atrial pulse delay text file
            apText = new JTextField(10);
            apText.setFont(new Font("微软雅黑",Font.BOLD,16));
            apText.setPreferredSize(new Dimension(90,40));
            
            apdText = new JTextField(10);
            apdText.setFont(new Font("微软雅黑",Font.BOLD,16));
            apdText.setPreferredSize(new Dimension(90,40));

            //Ventricular pulse text file, Ventricular pulse delay text file
            vpText = new JTextField(10);
            vpText.setFont(new Font("微软雅黑",Font.BOLD,16));
            vpText.setPreferredSize(new Dimension(90,40));

            vpdText = new JTextField(10);
            vpdText.setFont(new Font("微软雅黑",Font.BOLD,16));
            vpdText.setPreferredSize(new Dimension(90,40));

            //Battery life display text file
            /*
             * This Place should be the operation to update Real-time battery charge
             * Maybe can use Event Dispatching Thread in Java Swing to refresh
             */
            blDisplay = new JTextField(10);
            blDisplay.setFont(new Font("微软雅黑",Font.BOLD,10));
            blDisplay.setPreferredSize(new Dimension(40,20));
            blDisplay.setBounds(50, 30, 100, 40);
            /*Buttons*/
            
            //Atrium Button of heart display section
            /*
             * Here is the button that displays the atrium pacing, initial color is Red.
             * Here the event listener for the button is set, and the back-end needs to associate atrium pacing with it.
             * A judgment condition needs to be set. If the listener event is triggered, it will turn blue.
             * 
             */
            heartAtriumButton  = new JButton(" Atrium");
            heartAtriumButton.setFont(new Font("微软雅黑",Font.BOLD,16));
            heartAtriumButton.setPreferredSize(new Dimension(20,20));
            heartAtriumButton.setBounds(90, 200, 140, 50);
            heartAtriumButton.setBackground(Color.RED);
            heartAtriumButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e1) {
                	//There need to add a judgment condition .If the listener event is triggered, it will turn blue.
                	heartAtriumButton.setBackground(Color.BLUE);
                	
                }
            });


            //Ventricle Button of heart display section
            /*
             * Here is the button that displays the ventricular pacing, initial color is blue.
             * Here the event listener for the button is set, and the back-end needs to associate ventricular pacing with it.
             * A judgment condition needs to be set. If the listener event is triggered, it will turn red.
             * 
             */
            heartVentricleButton  = new JButton("Ventricle");
            heartVentricleButton.setFont(new Font("微软雅黑",Font.BOLD,16));
            heartVentricleButton.setPreferredSize(new Dimension(145,50));
            heartVentricleButton.setBounds(250, 200, 145, 50);
            heartVentricleButton.setBackground(Color.BLUE);
            heartVentricleButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e1) {
                	//There need to add a judgment condition .If the listener event is triggered, it will turn red.
                	heartVentricleButton.setBackground(Color.RED);
                	
                }
            });
            //Pacemaker start button;
            pacemakerStartButton = new JButton("Start Pacemaker");
            pacemakerStartButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
            //pacemakerStartButton.setPreferredSize(new Dimension(180,40));
            pacemakerStartButton.setBounds(15, 87, 170, 40);
            pacemakerStartButton.setEnabled(true);
            
            //Determine that all four values of pacemaker have been entered
            pacemakerStartButton.addActionListener((e)->{
                String apt = apText.getText();
                int aptL =apt.length();
                String apdt = apdText.getText();
                int apdtL =apdt.length();
                String vpt = vpText.getText();
                int vptL = vpt.length();
                String vpdt = vpdText.getText();
                int vpdtL = vpdt.length();

                //Determine if the appropriate option is selected.
                //Must fill in the input box with something, even if it is 0
                if( aptL == 0 || apdtL  == 0 || vptL == 0 || vpdtL == 0){

                    JOptionPane.showMessageDialog(pacemakerPanel,"Please Enter All The Information of Pacemaker Setting!");

                }else{
                    /*
                     * This Place should be the operation to activate the pacemaker to start
                     */
                    JOptionPane.showMessageDialog(pacemakerPanel," Add Successful!");
                }
            });


            /*Box hBox = Box.createHorizontalBox();
            hBox.add(atrialPanel);
            hBox.add(ventricularPanel);
            hBox.add(startBatteryPanel);*/




            //Adding the panel
            jf.add(heartPanel,null);
            heartPanel.setBounds(20,20,450,270);

            jf.add(pacemakerPanel,null);
            pacemakerPanel.setBounds(20,300,980,180);
            //Add the two Panels together as a content panel to the frame

             
            //Adding components to the heart panel
            heartPanel.add(heartFigure);
            heartPanel.add(heartAtriumButton);
            heartPanel.add(heartVentricleButton);

            //Adding components to the pacemaker panel
            pacemakerPanel.add(atrialPanel);
            pacemakerPanel.add(ventricularPanel);
            pacemakerPanel.add(startBatteryPanel);

            //Adding components to the atrial panel
            //atrialPanel.add(atrialLabel);
            atrialPanel.add(apLabel);
            atrialPanel.add(apText);
            atrialPanel.add(apdLabel);
            atrialPanel.add(apdText);

            //Adding components to the ventricularPanel panel
            //ventricularPanel.add(ventricularLabel);
            ventricularPanel.add(vpLabel);
            ventricularPanel.add(vpText);
            ventricularPanel.add(vpdLabel);
            ventricularPanel.add(vpdText);

            //Adding components to the startBattery panel
            startBatteryPanel.add(batteryLife);
            //startBatteryPanel.add(batteryLifeDay);
            startBatteryPanel.add(blDisplay);
            startBatteryPanel.add(pacemakerStartButton);

            this.modeBatterySecurityDesign(jf);
            jf.setVisible(true);
        }

        //Mingxing Zhao(Mode + Battery + Security Part)
        public void modeBatterySecurityDesign(JFrame frame)
        {
            JPanel modeBatterySecurityPanel = new JPanel();
            modeBatterySecurityPanel.setLayout( new FlowLayout(FlowLayout.LEADING,15,15));

            //Paced Part
            JLabel pacedLabel = new JLabel("Paced:",SwingConstants.LEFT);
            pacedLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
            JComboBox<String> pacedBox = new JComboBox<>();
            pacedBox.setFont(new Font("微软雅黑",Font.BOLD,16));
            pacedBox.setPreferredSize(new Dimension(115,60));
            pacedBox.addItem("Nothing");
            pacedBox.addItem("Atrium");
            pacedBox.addItem("Ventricle");
            pacedBox.addItem("Dual");


            //Sensed Part
            JLabel sensedLabel = new JLabel("Sensed:",SwingConstants.LEFT);
            sensedLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
            JComboBox<String> sensedBox = new JComboBox<>();
            sensedBox.setFont(new Font("微软雅黑",Font.BOLD,16));
            sensedBox.setPreferredSize(new Dimension(115,60));
            sensedBox.addItem("Nothing");
            sensedBox.addItem("Atrium");
            sensedBox.addItem("Ventricle");
            sensedBox.addItem("Dual");


            //Response Part
            JLabel responseLabel = new JLabel("Response:",SwingConstants.LEFT);
            responseLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
            JComboBox<String> responseBox = new JComboBox<>();
            responseBox.setFont(new Font("微软雅黑",Font.BOLD,16));
            responseBox.setPreferredSize(new Dimension(115,60));
            responseBox.addItem("None");
            responseBox.addItem("Trigger");
            responseBox.addItem("Inhibit");
            responseBox.addItem("Dual");

            // Beautify prompt information
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("微软雅黑", Font.BOLD, 16)));
            UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("微软雅黑", Font.BOLD, 16)));


            /*
             * Select the apply button for different pacemaker modes.
             * Only paced, sensed and response three drop-down box to choose finished, click the Apply button to set mode,
             * otherwise it will pop up error notification box.
             * */
            JButton modeButton = new JButton("Apply");
            modeButton.setFont(new Font("微软雅黑",Font.BOLD,16));
            modeButton.setPreferredSize(new Dimension(90,40));
            modeButton.setEnabled(true);
            modeButton.addActionListener((e)->{
                        //Get the index of content selected for each drop-down box, such as None = 0.
                        int pacedIndex = pacedBox.getSelectedIndex();
                        int sensedIndex = sensedBox.getSelectedIndex();
                        int responseIndex = responseBox.getSelectedIndex();

                        //Determine if the appropriate option is selected.
                        if(pacedIndex==0) {
                            JOptionPane.showMessageDialog(modeBatterySecurityPanel,"Wrong mode selection !!");
                        }
                        else {
                            //Get the content selected for each drop-down box, such as Atrium.
                            String pacedSelected = pacedBox.getSelectedItem().toString();
                            String sensedSelected = sensedBox.getSelectedItem().toString();
                            String responseSelected = responseBox.getSelectedItem().toString();
                            JOptionPane.showMessageDialog(modeBatterySecurityPanel,"Pacemaker "+pacedSelected+
                                    " + "+sensedSelected+" + "+responseSelected+" mode apply successfully !!");
                            //You can add functionality implementation code here.


                        }
                    }
            );

            /*
             * Battery Part
             * Enter the battery charge and total memory in the input box, then click the Confirm button to set.
             * Click Confirm only when both input boxes are complete.
             * Otherwise, an error notification box will be displayed.
             * */
            JLabel batteryLabel = new JLabel("Battery Charge:",SwingConstants.LEFT);
            batteryLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
            JTextField batteryText = new JTextField("",8);
            batteryText.setFont((new Font("微软雅黑",Font.BOLD,16)));
            batteryText.setPreferredSize(new Dimension(90,40));

            JLabel totalMemoryLabel = new JLabel("Total Memory:",SwingConstants.LEFT);
            totalMemoryLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
            JTextField totalMemoryText = new JTextField("",8);
            totalMemoryText.setFont((new Font("微软雅黑",Font.BOLD,16)));
            totalMemoryText.setPreferredSize(new Dimension(90,40));

            JButton confirmButton = new JButton("Confirm");
            confirmButton.setFont(new Font("微软雅黑",Font.BOLD,16));
            confirmButton.setPreferredSize(new Dimension(120,40));
            confirmButton.setEnabled(true);
            confirmButton.addActionListener((e)->{
                // batteryCharge and totalMemory represents the amount of battery power and total memory entered in the input box.
                String batteryCharge = batteryText.getText();
                String totalMemory = totalMemoryText.getText();

                if(batteryCharge.isEmpty()||totalMemory.isEmpty()) {
                    JOptionPane.showMessageDialog(modeBatterySecurityPanel,"Input is empty!!");
                }
                else {
                    JOptionPane.showMessageDialog(modeBatterySecurityPanel,"Battery Charge : "+batteryCharge+"  "+"Total Memory: "+totalMemory+" set successfully !!");

                    // This line of code is only used to test whether to get data, no practical significance, can be deleted.
                    System.out.println(batteryCharge+totalMemory);
                    //You can add functionality implementation code here.

                }

            });

            /*
             * Security Part
             * Click the "Add" button to bring up multiple input boxes, and then enter information about security elements.
             */
            JLabel securityLabel = new JLabel("Security Mode:",SwingConstants.LEFT);
            securityLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
            JButton addButton = new JButton("Add");
            addButton.setFont(new Font("微软雅黑",Font.BOLD,16));
            addButton.setPreferredSize(new Dimension(70,40));
            addButton.setEnabled(true);
            addButton.addActionListener((e)->{
                JDialog addDialog = new JDialog(frame,"Add Security Mode");
                addDialog.setBounds(900,500,500,500);
                addDialog.setVisible(true);
                addDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                addDialog.getContentPane().setLayout(new FlowLayout(FlowLayout.LEADING,15,15));

                JLabel securityNameLabel = new JLabel("Security Name:",SwingConstants.LEFT);
                securityNameLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
                JTextField securityNameText = new JTextField("",18);
                securityNameText.setFont((new Font("微软雅黑",Font.BOLD,16)));
                securityNameText.setPreferredSize(new Dimension(90,40));

                JLabel securityDescribeLabel = new JLabel("Security Description:",SwingConstants.LEFT);
                securityDescribeLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
                JTextField securityDescribeText = new JTextField("",15);
                securityDescribeText.setFont((new Font("微软雅黑",Font.BOLD,16)));
                securityDescribeText.setPreferredSize(new Dimension(90,40));

                JLabel batteryCostLabel = new JLabel("Battery Cost:",SwingConstants.LEFT);
                batteryCostLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
                JTextField batteryCostText = new JTextField("",19);
                batteryCostText.setFont((new Font("微软雅黑",Font.BOLD,16)));
                batteryCostText.setPreferredSize(new Dimension(90,40));

                JLabel memoryCostLabel = new JLabel("Memory Cost:",SwingConstants.LEFT);
                memoryCostLabel.setFont(new Font("微软雅黑",Font.BOLD,16));
                JTextField memoryCostText = new JTextField("",18);
                memoryCostText.setFont((new Font("微软雅黑",Font.BOLD,16)));
                memoryCostText.setPreferredSize(new Dimension(90,40));

                JButton addButton1 = new JButton("Add");
                addButton1.setFont(new Font("微软雅黑",Font.BOLD,16));
                addButton1.setPreferredSize(new Dimension(90,40));
                addButton1.setEnabled(true);
                addButton1.addActionListener((e1)->{
                    // Get the data entered in the input box.
                    String securityNameInput = securityNameText.getText();
                    String securityDescribeInput = securityDescribeText.getText();
                    String batteryCostInput = batteryCostText.getText();
                    String memoryCostInput = memoryCostText.getText();
                    // // check for memory capacity
                    if(securityNameInput.isEmpty()||securityDescribeInput.isEmpty()||batteryCostInput.isEmpty()||memoryCostInput.isEmpty())
                    {
                        JOptionPane.showMessageDialog(addDialog, "Input is empty!! ", "Message ",JOptionPane.ERROR_MESSAGE);
                    }
                    /*
                     * check for memory capacity
                     * This criterion is only for testing, so you need to change it to determine whether there is enough memory.
                     */
                    else if(Integer.parseInt(memoryCostInput)<=0)
                    {
                        JOptionPane.showMessageDialog(addDialog, "Not enough memory!! ", "Message ",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        //This line of code is only used to test whether to get data, no practical significance, can be deleted.
                        System.out.println(securityNameInput+securityDescribeInput+batteryCostInput+memoryCostInput);
                        //You can add functionality implementation code here.
                        JOptionPane.showMessageDialog(addDialog,securityNameInput +" added successfully!! ");


                    }
                });

                addDialog.add(securityNameLabel);
                addDialog.add(securityNameText);
                addDialog.add(securityDescribeLabel);
                addDialog.add(securityDescribeText);
                addDialog.add(batteryCostLabel);
                addDialog.add(batteryCostText);
                addDialog.add(memoryCostLabel);
                addDialog.add(memoryCostText);
                addDialog.add(addButton1);
            });

            JButton removeButton = new JButton("Remove");
            removeButton.setFont(new Font("微软雅黑",Font.BOLD,16));
            removeButton.setPreferredSize(new Dimension(100,40));
            removeButton.setEnabled(true);
            removeButton.addActionListener((e2)->{
                JDialog removeDialog = new JDialog(frame,"Remove Security Mode");
                removeDialog.setBounds(900,500,400,400);
                removeDialog.setVisible(true);
                removeDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                removeDialog.setLayout(new FlowLayout());
                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setPreferredSize(new Dimension(300,250));
                // This string is just for testing, you need to delete this line of code.
                String[] str = {"aa","bb","cc","dd","ee","ff","gg"};
                //You need to replace the "str" list passed in by this line of code with a list of your own implementations.
                JList<String> list = new JList<>(str);
                scrollPane.setViewportView(list);

                JButton deleteButton = new JButton("Delete");
                deleteButton.setFont(new Font("微软雅黑",Font.BOLD,16));
                deleteButton.setPreferredSize(new Dimension(100,40));
                deleteButton.addActionListener((e)->{
                    // selectValue gets you to select the data you want to delete from the list.eg.aa
                    String selectValue = list.getSelectedValue();

                    //This line of code is only used to test whether to get data, no practical significance, can be deleted.
                    System.out.println(list.getSelectedValue());

                });

                removeDialog.add(scrollPane);
                removeDialog.add(deleteButton);

            });

            // Beautification mode panel
            JPanel modePanel = new JPanel();
            modePanel.setLayout( new FlowLayout(FlowLayout.LEADING,15,15));
            ArrayList<Component> components = new ArrayList<>();
            components.add(pacedLabel);
            components.add(pacedBox);
            components.add(sensedLabel);
            components.add(sensedBox);
            components.add(responseLabel);
            components.add(responseBox);
            components.add(modeButton);

            Border modeBorder = BorderFactory.createEtchedBorder();
            TitledBorder titled = BorderFactory.createTitledBorder(modeBorder, "Mode");
            addCompForTitledBorder(titled, components, TitledBorder.LEFT,
                    TitledBorder.DEFAULT_POSITION, frame,modePanel);
            modePanel.setBounds(20,480,980,120);

            //Beautification security panel
            JPanel batterySecurityPanel = new JPanel();
            batterySecurityPanel.setLayout(new FlowLayout(FlowLayout.LEADING,5,5));
            components.clear();
            components.add(batteryLabel);
            components.add(batteryText);
            components.add(totalMemoryLabel);
            components.add(totalMemoryText);
            components.add(confirmButton);
            components.add(securityLabel);
            components.add(addButton);
            components.add(removeButton);

            titled = BorderFactory.createTitledBorder(modeBorder, "Security");
            addCompForTitledBorder(titled, components, TitledBorder.LEFT,
                    TitledBorder.DEFAULT_POSITION, frame,batterySecurityPanel);
            batterySecurityPanel.setBounds(20,600,980,110);


        }

        // Add a simple border
        private void addCompForBorder(Border border, ArrayList<Component> components, Container container, JPanel panel)
        {
            for (int i= 0; i< components.size()  ;i++)
            {
                panel.add(components.get(i));
            }
            panel.setBorder(border);

            container.add(Box.createRigidArea(new Dimension(0, 10)));//设置间隔
            container.add(panel,null);
        }

        private void addCompForTitledBorder(TitledBorder border, ArrayList<Component> components,
                                            int justification, int position, Container container, JPanel panel) {
            border.setTitleJustification(justification);
            border.setTitlePosition(position);
            border.setTitleFont(new Font("微软雅黑",Font.BOLD,16));
            addCompForBorder(border, components, container,panel);
        }

    }



    }

