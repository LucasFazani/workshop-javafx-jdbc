package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;

public class DepartmentListController implements Initializable{
	
	@FXML
	private TableView<Department> tableviewDepartamento;
	
	@FXML
	private TableColumn<Department, Integer> tableCollumnID;
	
	@FXML
	private TableColumn<Department, String> tableCollumnNome;
	
	@FXML
	private Button btNovo;
	
	@FXML
	public void onBtNovoAction() {
		System.out.println("clicou");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
		
	}

	private void initializeNodes() {
		tableCollumnID.setCellValueFactory(new PropertyValueFactory<>("id"));
	    tableCollumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		
	    
	    Stage stage = (Stage) Main.getMainScene().getWindow();
	    tableviewDepartamento.prefHeightProperty().bind(stage.heightProperty());
	}

}
