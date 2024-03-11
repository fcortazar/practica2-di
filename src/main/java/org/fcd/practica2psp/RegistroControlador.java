package org.fcd.practica2psp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegistroControlador {

    @FXML
    private TextField nombreTextField;
    @FXML
    private DatePicker fechaNacimientoDatePicker;
    @FXML
    private TextField dniTextField;
    @FXML
    private RadioButton hombreRadioButton;
    @FXML
    private RadioButton mujerRadioButton;
    @FXML
    private TextField correoElectronicoTextField;
    @FXML
    private ComboBox<String> profesionComboBox;
    @FXML
    private CheckBox permitirComunicacionesCheckBox;
    @FXML
    private Button guardarButton;
    @FXML
    private Button guardarButton2;
    @FXML
    private Button cancelarButton;

    public void onGuardar(ActionEvent event) {
        String nombre = nombreTextField.getText();
        String fechaNacimiento = fechaNacimientoDatePicker.getValue().toString();
        String dni = dniTextField.getText();
        String sexo = hombreRadioButton.isSelected() ? "Hombre" : "Mujer";
        String correoElectronico = correoElectronicoTextField.getText();
        String profesion = profesionComboBox.getValue();
        boolean permitirComunicaciones = permitirComunicacionesCheckBox.isSelected();

        String mensaje = "**Datos del formulario:**\n\n"
                + "Nombre: " + nombre + "\n"
                + "Fecha de nacimiento: " + fechaNacimiento + "\n"
                + "DNI: " + dni + "\n"
                + "Sexo: " + sexo + "\n"
                + "Correo electrónico: " + correoElectronico + "\n"
                + "Profesión: " + profesion + "\n"
                + "Permitir comunicaciones comerciales: " + permitirComunicaciones;

        // Mostrar la cadena de texto
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información del formulario");
        alert.setHeaderText("Datos introducidos");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    public void onGuardar2(ActionEvent event) {
        // Implementar la lógica para el nuevo botón "Guardar copia"
    }

    public void onCancelar(ActionEvent event) {
        // Implementar la lógica para el botón "Cancelar"
    }

    public void initialize() {
        // Inicializar el combo box de profesiones
        profesionComboBox.getItems().addAll("Estudiante", "Ingeniero", "Médico");
    }
}
