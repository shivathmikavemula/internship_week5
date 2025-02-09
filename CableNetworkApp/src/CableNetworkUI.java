package src;

import javax.swing.*;
import java.awt.*;

public class CableNetworkUI extends JFrame {
    public CableNetworkUI() {
        setTitle("Mani Cable Network");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Header Panel (Black)
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.BLACK);
        headerPanel.setLayout(new BorderLayout());
        JLabel titleLabel = new JLabel("Mani Cable Network", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JButton activateButton = new JButton("Request for Activate");
        headerPanel.add(titleLabel, BorderLayout.CENTER);
        headerPanel.add(activateButton, BorderLayout.SOUTH);

        // Main Content Panel (Blue)
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(new Color(50, 100, 255)); // Blue background
        contentPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;

        // Labels and Fields
        String[][] details = {
            {"Box ID", "2145766627"},
            {"Name", "Mani"},
            {"Area", "Kendriya"},
            {"Phone", "8575748758"},
            {"Package", "All Telugu"},
            {"Month", "December"},
            {"Date", "2023-12-04"},
            {"Amount", "₹330"},
            {"Due", "0"}
        };

        for (String[] detail : details) {
            JLabel label = new JLabel(detail[0] + ":");
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            contentPanel.add(label, gbc);

            gbc.gridx = 1;
            JTextField textField = new JTextField(detail[1], 15);
            textField.setEditable(false);
            textField.setHorizontalAlignment(JTextField.CENTER);
            contentPanel.add(textField, gbc);

            gbc.gridx = 0;
            gbc.gridy++;
        }

        // Done Button
        JButton doneButton = new JButton("Done");
        gbc.gridwidth = 2;
        gbc.gridx = 0;
        contentPanel.add(doneButton, gbc);

        // Add panels to Frame
        add(headerPanel, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CableNetworkUI::new);
    }
}
