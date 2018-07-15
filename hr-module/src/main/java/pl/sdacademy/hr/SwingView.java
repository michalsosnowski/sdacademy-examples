package pl.sdacademy.hr;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SwingView {
	private static final HrManagerSwingAdapter adapter = new HrManagerSwingAdapter(new HrMenager());
	private static DefaultTableModel tableModel = new DefaultTableModel();

	public static void main(String[] args) {
		tableModel.addColumn("First Name");
		tableModel.addColumn("Last Name");
		tableModel.addColumn("Date of Birth");


		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// prepare the jframe
				final JFrame jFrame = new JFrame();
				LayoutManager layout = new GridLayout(3, 1);
				jFrame.setLayout(layout);
				jFrame.setTitle("HR Manager");
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				// content
				addFirstRow(jFrame);
				addSecondRow(jFrame);
				addThirdRow(jFrame);

				// pack and show
				jFrame.setPreferredSize(new Dimension(640, 480));
				jFrame.pack();
				jFrame.setVisible(true);
			}

			private void addThirdRow(JFrame jFrame) {
				JPanel row = new JPanel();
				LayoutManager layout = new GridLayout(3, 1);
				row.setLayout(layout);
				JButton button = new JButton("Filtr");

				JPanel filtrByPhrase = new JPanel();
				filtrByPhrase.add(new JLabel("Filter:"));
				JTextField phrase = new JTextField("phrase");
				filtrByPhrase.add(phrase);
				filtrByPhrase.add(button);
				row.add(filtrByPhrase);

				button.addActionListener(e -> {
					adapter.searchByPhrase(tableModel, phrase.getText());
				});


				JPanel searchNameFilter = new JPanel();
				searchNameFilter.add(new JLabel("Search by Last Name"));
				JTextField lastNameTextField = new JTextField("first name");
				searchNameFilter.add(lastNameTextField);
				JButton buttonSearchByFirstName = new JButton("Ok");
				searchNameFilter.add(buttonSearchByFirstName);
				row.add(searchNameFilter);
				jFrame.add(row);
				buttonSearchByFirstName.addActionListener(e -> {
					adapter.searchByLastName(tableModel, lastNameTextField.getText());
				});
			}

			private void addSecondRow(JFrame jFrame) {

				JTable table = new JTable(tableModel);
				JScrollPane scrollPane = new JScrollPane(table);
				jFrame.add(scrollPane);
			}

			private void addFirstRow(JFrame jFrame) {
				JPanel row = new JPanel();

				JButton addButton = new JButton("Add");
				JTextField firstNameTextField = new JTextField("firstName");
				JTextField lastNameTextField = new JTextField("lastName");
				JTextField dateOfBirthTextField = new JTextField("dateOfBirth");
				addButton.addActionListener(e -> {
					adapter.addNewEmployee(tableModel, firstNameTextField.getText(),
						lastNameTextField.getText(), dateOfBirthTextField.getText());
				});
				row.add(addButton);
				row.add(new JLabel("First name"));
				row.add(firstNameTextField);
				row.add(new JLabel("Last name"));
				row.add(lastNameTextField);
				row.add(new JLabel("Date of birth"));
				row.add(dateOfBirthTextField);

				jFrame.add(row);
			}


		});
	}
}
