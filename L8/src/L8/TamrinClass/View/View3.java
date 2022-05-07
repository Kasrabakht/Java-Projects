package L8.TamrinClass.View;

import L8.TamrinClass.Controller.Controller3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View3 {
    Controller3 controller3=new Controller3();
    private JFrame frame;
    private JTextField txt_Username;
    private JPasswordField txt_Password;
    private JTextField txt_Name;
    private JTextField txt_Email;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                   View3 window = new View3();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public View3() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setBounds(100, 100, 1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        txt_Username = new JTextField();
        txt_Username.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txt_Username.setBounds(834, 278, 523, 55);
        frame.getContentPane().add(txt_Username);
        txt_Username.setColumns(10);

        JLabel lblNewLabel = new JLabel("Username");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(687, 284, 115, 34);
        frame.getContentPane().add(lblNewLabel);

        txt_Password = new JPasswordField();
        txt_Password.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txt_Password.setBounds(834, 380, 523, 55);
        frame.getContentPane().add(txt_Password);

        JLabel lblNewLabel_1 = new JLabel("Password");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(687, 386, 101, 34);
        frame.getContentPane().add(lblNewLabel_1);

        JButton btn_Login = new JButton("Login");
        btn_Login.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btn_Login.setBounds(1236, 547, 121, 55);
        frame.getContentPane().add(btn_Login);
        btn_Login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller3.setModelUsername(txt_Username.getText());
                controller3.setModelPassword(String.valueOf(txt_Password.getPassword()));
                controller3.check();

                if (controller3.getModelSwtch() == true)
                {

                    JFrame frame1 = new JFrame();
                    frame1.getContentPane().setBackground(Color.LIGHT_GRAY);
                    frame1.setBounds(100, 100, 1920,1080);
                    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame1.getContentPane().setLayout(null);

                    JLabel lblNewLabel = new JLabel("WELCOME!");
                    lblNewLabel.setForeground(Color.WHITE);
                    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 66));
                    lblNewLabel.setBounds(807, 319, 453, 265);
                    frame1.getContentPane().add(lblNewLabel);
                    frame1.setVisible(true);
                }
                }

        });
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnCancel.setBounds(687, 547, 121, 55);
        frame.getContentPane().add(btnCancel);

        JButton btnCreate = new JButton("Create");
        btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnCreate.setBounds(983, 678, 121, 55);
        frame.getContentPane().add(btnCreate);
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               JFrame frame3 = new JFrame();
                frame3.getContentPane().setBackground(new Color(51, 0, 51));
                frame3.setBounds(100, 100, 1920,1080);
                frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame3.getContentPane().setLayout(null);

                txt_Username = new JTextField();
                txt_Username.setFont(new Font("Tahoma", Font.PLAIN, 20));
                txt_Username.setBounds(440, 123, 403, 48);
                frame3.getContentPane().add(txt_Username);
                txt_Username.setColumns(10);

               JTextField txt_Password1 = new JTextField();
                txt_Password1.setFont(new Font("Tahoma", Font.PLAIN, 20));
                txt_Password1.setColumns(10);
                txt_Password1.setBounds(440, 240, 403, 48);
                frame3.getContentPane().add(txt_Password1);

                JLabel lblNewLabel = new JLabel("Username");
                lblNewLabel.setForeground(Color.WHITE);
                lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblNewLabel.setBounds(265, 128, 114, 31);
                frame3.getContentPane().add(lblNewLabel);

                JLabel lblPassword = new JLabel("Password");
                lblPassword.setForeground(Color.WHITE);
                lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblPassword.setBounds(265, 257, 114, 31);
                frame3.getContentPane().add(lblPassword);

                JLabel lblName = new JLabel("Name");
                lblName.setForeground(Color.WHITE);
                lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblName.setBounds(1039, 128, 114, 31);
                frame3.getContentPane().add(lblName);

                txt_Name = new JTextField();
                txt_Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
                txt_Name.setColumns(10);
                txt_Name.setBounds(1170, 123, 403, 48);
                frame3.getContentPane().add(txt_Name);

                txt_Email = new JTextField();
                txt_Email.setFont(new Font("Tahoma", Font.PLAIN, 20));
                txt_Email.setColumns(10);
                txt_Email.setBounds(1170, 240, 403, 48);
                frame3.getContentPane().add(txt_Email);

                JLabel lblEmail = new JLabel("Email");
                lblEmail.setForeground(Color.WHITE);
                lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
                lblEmail.setBounds(1039, 245, 114, 31);
                frame3.getContentPane().add(lblEmail);

                JButton btnNewCreate = new JButton("Create");
                btnNewCreate.setFont(new Font("Tahoma", Font.PLAIN, 18));
                btnNewCreate.setBounds(1425, 461, 148, 48);
                frame3.getContentPane().add(btnNewCreate);

                JButton btnCancel = new JButton("Cancel");
                btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
                btnCancel.setBounds(265, 461, 148, 48);
                frame3.getContentPane().add(btnCancel);
                frame3.setVisible(true);
                btnNewCreate.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        controller3.setModelUsername(txt_Username.getText());
                        controller3.setModelPassword(txt_Password1.getText());
                        controller3.setModelEmail(txt_Email.getText());
                        controller3.setModelName(txt_Name.getText());
                        controller3.Create();
                    }
                });
            }

        });
    }

}
