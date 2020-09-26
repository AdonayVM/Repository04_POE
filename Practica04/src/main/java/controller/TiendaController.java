package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.CategoriesRepository;
import model.Producto;
import model.ProductoRepository;

/**
 * FXML Controller class
 *
 * @author myslf
 */
public class TiendaController implements Initializable {

    @FXML
    private TextField tflID;
    @FXML
    private TextField tflNombre;
    @FXML
    private TextField tflDesc;
    @FXML
    private ComboBox<String> cbCat;
    @FXML
    private TextField tflPrecio;
    @FXML
    private Button btnAgregar;
    @FXML
    private TableColumn<Producto, Integer> colId;
    @FXML
    private TableColumn<Producto, String> colNombre;
    @FXML
    private TableColumn<Producto, String> colDesc;
    @FXML
    private TableColumn<Producto, String> colCat;
    @FXML
    private TableColumn<Producto, Float> colPrecio;
    @FXML
    private Button btnEliminar;

    private ObservableList<String> listaCategories = null;
    private ObservableList<Producto> listaProductos;
    @FXML
    private TableView<Producto> tblProductos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaCategories = FXCollections.observableArrayList(CategoriesRepository.getCategories());
        cbCat.setItems(listaCategories);
        listaProductos = FXCollections.observableArrayList(ProductoRepository.getProducto());
        this.colId.setCellValueFactory(new PropertyValueFactory("id"));
        this.colPrecio.setCellValueFactory(new PropertyValueFactory("precio"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colDesc.setCellValueFactory(new PropertyValueFactory("desc"));
        this.colCat.setCellValueFactory(new PropertyValueFactory("cat"));
        this.tblProductos.setItems(listaProductos);
    }

    @FXML
    private void handleAgregar(ActionEvent event) {
        Producto producto = new Producto(
                Integer.parseInt(tflID.getText()),
                Float.parseFloat(tflPrecio.getText()),
                tflNombre.getText(),
                cbCat.getValue(),
                tflDesc.getText()
        );
        if (!listaProductos.contains(producto)) {
            this.listaProductos.add(producto);
            this.tblProductos.setItems(listaProductos);
            tflID.clear();
            tflNombre.clear();
            tflDesc.clear();
            cbCat.getSelectionModel().clearSelection();
            tflPrecio.clear();
            tflID.requestFocus();
        }
    }

    @FXML
    private void handleEliminar(ActionEvent event) {
        Producto producto = tblProductos.getSelectionModel().getSelectedItem();
        if (producto != null) {
            listaProductos.remove(producto);
            tblProductos.getSelectionModel().select(null);
        }
    }

}
