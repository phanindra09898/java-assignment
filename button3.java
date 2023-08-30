import java.awt.*;
import java.awt.event.*;

public class button3 extends Frame implements ActionListener 
{

    private Label nameLabel, ageLabel, dobLabel;
    private TextField nameTextField, ageTextField, dobTextField;
    private Button clearButton,submitButton;

    public button3() 
    {
        setTitle("Personal Information Form");
        setSize(300, 200);
        setLayout(null);
        setLocationRelativeTo(null);

        nameLabel = new Label("Name:");
        ageLabel = new Label("Age:");
        dobLabel = new Label("DOB (YYYY-MM-DD):");

        nameLabel.setBounds(50, 50, 70, 20);
        ageLabel.setBounds(50, 80, 70, 20);
        dobLabel.setBounds(50, 110, 120, 20);

        nameTextField = new TextField();
        ageTextField = new TextField();
        dobTextField = new TextField();

        nameTextField.setBounds(180, 50, 100, 20);
        ageTextField.setBounds(180, 80, 40, 20);
        dobTextField.setBounds(180, 110, 100, 20);

        submitButton = new Button("Submit");
        submitButton.setBounds(180, 150, 70, 30);
        clearButton = new Button("Clear");
        clearButton.setBounds(100, 150, 70, 30);

        add(nameLabel);
        add(ageLabel);
        add(dobLabel);
        add(nameTextField);
        add(ageTextField);
        add(dobTextField);
        add(submitButton);
        add(clearButton);

        submitButton.addActionListener(this);

        addWindowListener(new WindowAdapter() 
        {
            @Override
            public void windowClosing(WindowEvent e) 
            {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == submitButton) 
        {
            String name = nameTextField.getText();
            String age = ageTextField.getText();
            String dob = dobTextField.getText();

            String message = "Name: " + name + "\nAge: " + age + "\nDOB: " + dob;
        }
    }

    public static void main(String[] args)
    {
button3 frame = new button3();
        frame.setVisible(true);
    }
}
