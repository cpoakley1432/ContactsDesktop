package sample;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    ObservableList<Contact> contacts = FXCollections.observableArrayList();
    @FXML
    ListView listView;
    @FXML
    TextField nameF;
    @FXML
    TextField phoneF;
    @FXML
    TextField emailF;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(contacts);

    }

    public void removeContact(){
        Contact contact = (Contact) listView.getSelectionModel().getSelectedItem();
        contacts.remove(contact);

    }

    public void addContact(){
        if (!nameF.getText().equals("") && !phoneF.getText().equals("") && !emailF.getText().equals("")){
            Contact contact = new Contact(nameF.getText(), phoneF.getText(), emailF.getText());
            contacts.add(contact);
        }
    }
}
