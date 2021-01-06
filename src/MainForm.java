import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class MainForm {
    private JPanel mainPanel;
    private JTextField secondName;
    private JTextField name;
    private JTextField middleName;
    private JButton collapseButton;
    private JLabel secondNameLabel;
    private JLabel nameLabel;
    private JLabel middleNameLabel;
    private JTextField collapseText;
    private JLabel text;

    public MainForm(){
        collapseButton.addActionListener(new Action() {
            @Override
            public Object getValue(String s) {
                return null;
            }

            @Override
            public void putValue(String s, Object o) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {

            }

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String secondNameText = secondName.getText();
                String nameText = name.getText();
                String middleNameText = middleName.getText();
                //проверка введенных значений
                //если хотя бы одно поле незаполнено выводим сообщение об ошибке
                if(secondNameText.equals("") || nameText.equals("") || middleNameText.equals("")){
                    JOptionPane.showMessageDialog(
                            mainPanel,
                            "Имеются незаполненные поля",
                            "Error",
                            JOptionPane.PLAIN_MESSAGE
                    );
                }
                else {
                    //определение функционала кнопки
                    if (collapseButton.getText().equals("Collapse")) {
                        collapseText.setVisible(true);
                        collapseText.setText(secondName.getText() + " " + name.getText() + " " + middleNameText);
                        secondName.setVisible(false);
                        secondNameLabel.setVisible(false);
                        name.setVisible(false);
                        nameLabel.setVisible(false);
                        middleName.setVisible(false);
                        middleNameLabel.setVisible(false);
                        collapseButton.setText("Expand");
                    }
                    else {
                        String[] fiostr = collapseText.getText().split("\\s+");
                        if  (fiostr.length == 3){
                            collapseText.setVisible(false);
                            secondName.setVisible(true);
                            secondNameLabel.setVisible(true);
                            name.setVisible(true);
                            nameLabel.setVisible(true);
                            middleName.setVisible(true);
                            middleNameLabel.setVisible(true);
                            collapseButton.setText("Collapse");

                            secondName.setText(fiostr[0]);
                            name.setText(fiostr[1]);
                            middleName.setText(fiostr[2]);
                        }
                        else {
                            JOptionPane.showMessageDialog(
                                    mainPanel,
                                    "Введите фамилию, имя и отчество",
                                    "Error",
                                    JOptionPane.PLAIN_MESSAGE
                            );
                        }
                    }
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}
