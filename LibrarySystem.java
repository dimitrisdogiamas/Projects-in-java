import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class LibrarySystem {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField searchField;
    private JTextArea booksArea;

    private Connection connection;
    private String currentUser;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                LibrarySystem window = new LibrarySystem();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public LibrarySystem() {
        initialize();
        connectToDatabase();
    }

    private void connectToDatabase() {
		// TODO Auto-generated method stub
		
	}

	private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new CardLayout(0, 0));

        JPanel loginPanel = new JPanel();
        frame.getContentPane().add(loginPanel, "loginPanel");
        loginPanel.setLayout(new GridLayout(3, 2, 0, 0));

        JLabel lblUsername = new JLabel("Username:");
        loginPanel.add(lblUsername);

        usernameField = new JTextField();
        loginPanel.add(usernameField);
        usernameField.setColumns(10);

        JLabel lblPassword = new JLabel("Password:");
        loginPanel.add(lblPassword);

        passwordField = new JPasswordField();
        loginPanel.add(passwordField);
        passwordField.setColumns(10);

        JButton btnLogin = new JButton("Είσοδος");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (checkCredentials(username, password)) {
                    setCurrentUser(username);
                    showSearchScreen();
                } else {
                    JOptionPane.showMessageDialog(frame, "Λανθασμένα στοιχεία χρήστη.", "Σφάλμα", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        loginPanel.add(btnLogin);

        JPanel mainPanel = new JPanel();
        frame.getContentPane().add(mainPanel, "mainPanel");
        mainPanel.setLayout(new GridLayout(0, 1, 0, 0));

        JButton btnSearchBooks = new JButton("Αναζήτηση βιβλίων");
        btnSearchBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showSearchScreen();
            }
        });
        mainPanel.add(btnSearchBooks);

        JButton btnMyBooks = new JButton("Τα βιβλία μου");
	}

	protected boolean checkCredentials(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	protected void showSearchScreen() {
		// TODO Auto-generated method stub
		
	}

	public JTextField getSearchField() {
		return searchField;
	}

	public void setSearchField(JTextField searchField) {
		this.searchField = searchField;
	}

	public JTextArea getBooksArea() {
		return booksArea;
	}

	public void setBooksArea(JTextArea booksArea) {
		this.booksArea = booksArea;
	}

	public String getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}

