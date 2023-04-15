//Import Libraries
import java.awt.*;
import javax.swing.*;

/*
 * Name: Kuldeep Mohanta
 * Date: April 15th, 2023
 * App Name: TipCalculator.java
 * Description: This application is designed to showcase the basic fundamentals of using labels, textfields, drop down combo boxes, as well as buttons. It also
 * implements actions on the buttons that process user input (and validate the data) to perform calculations and print them back to the user within visible text fields.
 * 
 */

public class TipCalculator 
{

    //Constants
    static final String [] TIP_OPTIONS = {"0%", "5%", "10%", "15%", "20%"};
    
    //Components (aka widgets)
    static JFrame window;
    static JPanel panel;
    static JLabel billLabel;
    static JTextField billTextField;
    static GridBagConstraints gridbag;
    static JLabel tipLabel;
    static JComboBox<String> tipComboBox;
    static JLabel totalLabel;
    static JTextField totalTextField;
    static JButton clearButton;
    static JButton calculateButton;

    //Execute when clear button is pressed
    static void clearClick()
    {
        billTextField.setText("$0.00");
        tipComboBox.setSelectedItem("20%");
        totalTextField.setText("$0.00");

    }

    //Calculate the bill when button is pressed
    static void calculateClick()
    {
        //Variables
        double bill = 0;
        double tip = 0;
        double total;
        double tipPercentage;
        boolean numeric;

        //Getting values from bill and tip
        String billText = billTextField.getText();
        String tipText = tipComboBox.getSelectedItem().toString();
        
        // Getting rid of the special chars
        billText = billText.replace("$", "");
        tipText = tipText.replace("%", "");

        //Validate the input
        try
        {
            bill = Double.parseDouble(billText);
            tip = Double.parseDouble(tipText);
            numeric = true;
        } catch (Exception e) 
            {
                //not able to convert
                numeric = false; 
            }
        
        if(!numeric)
        {
            totalTextField.setText("Error - Invalid input!");
        }

        if(bill <= 0)
        {
            totalTextField.setText("Error - Bill amount has to be a minimum amount of greater than 0!"); 
        }
        //Valid input
        else
        {
            tipPercentage = 1 + tip/100;
            total = bill * tipPercentage;

            //Displaying result
            //Use format to round to 2 decimal places and use f for float
            totalTextField.setText(String.format("$%.2f",total));
            billTextField.setText(String.format("$%.2f",bill));
        }

    }


    public static void main(String[] args) 
        {
            
            try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception e) {}
            
            //Setup the window

            //Creating the window
            window = new JFrame("Tip Calculator - Kuldeep Mohanta");
            
            //Changes the Icon
            window.setIconImage(new ImageIcon("tip.png").getImage());

            //Close button will close the window
            window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            //Cannot resize the window
            window.setResizable(false);

            // Panel - container for the components
            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            panel.setLayout(new GridBagLayout());
            gridbag = new GridBagConstraints();

            // Bill Label 
            billLabel = new JLabel("Bill Amount (Without Service): ");

            //Total Text Field
            billTextField = new JTextField("$0.00");
            billTextField.setColumns(40);


            //Tip Label
            tipLabel = new JLabel("Choose a tip percentage: ");

            //Tip ComboBox
            //Utilizses the enum string to create a list of options
            tipComboBox = new JComboBox<String>(TIP_OPTIONS);
            //Creates a default value for the percentage
            tipComboBox.setSelectedItem("20%");
                
            //Total Label
            totalLabel = new JLabel("Total Amount + service: ");
        
            //Total Text Field
            totalTextField = new JTextField("$0.00");
            totalTextField.setColumns(30);
            //Read only
            totalTextField.setEditable(false);

            // Buttons
            clearButton = new JButton("Clear");
            clearButton.addActionListener(event -> clearClick());
            calculateButton = new JButton("Calculate");
            calculateButton.addActionListener(event -> calculateClick());

            //Placing components

            //Adding panel to the window
            window.add(panel);
            
            // Place the bill label
            // Use 2 H-cells
            gridbag.gridwidth = 2;
            gridbag.gridy = 0; // 1st row
            gridbag.anchor = GridBagConstraints.WEST;
            panel.add(billLabel, gridbag); 
            
            //Place the bill text field
            gridbag.gridy = 1; //2nd row
            panel.add(billTextField, gridbag); 

            //Place the tip label
            gridbag.gridy = 2; //3rd Row
            panel.add(tipLabel, gridbag);

            //Place the tip Combobox
            gridbag.gridy = 3; //4th Row
            gridbag.fill = GridBagConstraints.HORIZONTAL;
            panel.add(tipComboBox, gridbag);

            // Place the Total label
            gridbag.gridy = 4; // 5st row
            gridbag.anchor = GridBagConstraints.WEST;
            panel.add(totalLabel, gridbag); 
            
            //Place the total text field
            gridbag.gridy = 5; // 6th row
            panel.add(totalTextField, gridbag); 

            //Place the buttons
            //use 1 h cell
            gridbag.gridwidth = 1;
            //Resets the fill
            gridbag.fill = GridBagConstraints.NONE;
            gridbag.gridy = 6; // 7th row
            panel.add(clearButton, gridbag);
            //Right side
            gridbag.anchor = GridBagConstraints.EAST;
            panel.add(calculateButton, gridbag);



            //Make the window 
            window.setVisible(true);
            window.pack(); //Resize window to fit all components

        }
}
