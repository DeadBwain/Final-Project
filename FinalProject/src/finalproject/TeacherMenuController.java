/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 * FXML Controller class
 *
 * @author Admin
 */
public class TeacherMenuController implements Initializable {

    @FXML
    private VBox Teach_VBOX;
    @FXML
    private TextField tf_ID;
    @FXML
    private TextField tf_Name;
    @FXML
    private TextField tf_Age;
    @FXML
    private TextField tf_Gender;
    @FXML
    private TextField tf_Speciality;
    @FXML
    private TextField tf_Degree;
    @FXML
    private TextField tf_Dept_ID;
    @FXML
    private Button btn_Add;
    @FXML
    private Button btn_Load;
    @FXML
    private Button btn_Assign_Dept;
    @FXML
    private Button btn_Search;
    @FXML
    private Button btn_Assign_Dean;
    @FXML
    private TableView<Teacher> tbl_Teach;
    @FXML
    private TableColumn<?, ?> cln_ID;
    @FXML
    private TableColumn<?, ?> cln_Name;
    @FXML
    private TableColumn<?, ?> cln_Age;
    @FXML
    private TableColumn<?, ?> cln_Gender;
    @FXML
    private TableColumn<?, ?> cln_Speciality;
    @FXML
    private TableColumn<?, ?> cln_Degree;
    @FXML
    private TableColumn<?, ?> cln_Dept_ID;
    @FXML
    private Button btn_Back_To_Menu;
    
    public static ObservableList<Teacher> TeachL = FXCollections.observableArrayList();

    public void BufferedReaderFile(FileReader fileReader){
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(
            "C:\\Users\\Admin\\Documents\\GitHub\\Final-Project\\FinalProject\\Teacher.txt"));
        }catch(FileNotFoundException lostfile){
            System.out.println(lostfile.getMessage());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
        
    @FXML
     private void handleButtonAction(ActionEvent event) throws Exception{
        Stage stage= null;
        Parent root= null;
        if(event.getSource() == btn_Back_To_Menu){ 
            System.out.println("You are in Menu fxml");
            stage = (Stage) btn_Back_To_Menu.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        }
        if(event.getSource() == btn_Load){
            
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     public void initiliazeTeach(ObservableList<Teacher> arr){
         cln_ID.setCellFactory(new PropertyValueFactory<>("ID"));
         cln_Name.setCellFactory(new PropertyValueFactory<>("Name"));
         cln_Age.setCellFactory(new PropertyValueFactory<>("Age"));
         cln_Gender.setCellFactory(new PropertyValueFactory<>("Gender"));
         cln_Speciality.setCellFactory(new PropertyValueFactory<>("Speciality"));
         cln_Degree.setCellFactory(new PropertyValueFactory<>("Degree"));
         cln_Dept_ID.setCellFactory(new PropertyValueFactory<>("Dept ID"));
         tbl_Teach.setItems(arr);
     }
}