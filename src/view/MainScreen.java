package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class MainScreen extends JFrame{
	public MainScreen() {
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Todo App");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel.setBounds(35, 35, 206, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Anote tudo, não esqueça nada");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(45, 71, 193, 25);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(panel_3_1, GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
					.addGap(10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
						.addComponent(panel_3_1, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
					.addGap(11))
		);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Tarefas");
		lblNewLabel_4.setBounds(10, 11, 50, 18);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(new Color(0, 128, 0));
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("+");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(412, 11, 20, 20);
		panel_2.add(lblNewLabel_3);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Projetos");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(new Color(0, 128, 0));
		lblNewLabel_2.setBounds(10, 12, 64, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("+");
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(98, 8, 20, 20);
		panel_1.add(lblNewLabel_3_1);
		getContentPane().setLayout(groupLayout);
	}
}
