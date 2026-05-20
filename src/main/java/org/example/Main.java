package org.example;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Locale;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage){
        //Etiquetas
        Label numero = new Label("Número de teléfono: ");
        Label mostrarTexto = new Label(null);

        //Campos
        TextField numeroTel = new TextField();
        numeroTel.setPromptText("612345678");

        //Botones
        Button btnGuardar = new Button("Guardar");

        /**
         * Función de pulsar el botón, si algún campo está vacío muestra un mensaje en la misma ventana
         * Modificando una etiqueta vacía por defecto
         * Si está todo completo muestra el nombre y el correo modificando el contenido de 2 etiquetas vacías por defecto
         */
        btnGuardar.setOnAction(e -> {
            if (numeroTel.getText().matches("\\d{9}")){
                mostrarTexto.setText("Teléfono: " + numeroTel.getText());
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Numero incorrecto, ha de tener 9 dígitos");
                alert.showAndWait();
                mostrarTexto.setText(null);
            }
        });

        // if(dni.matches("\\d{8}[A-Z]")) expresión regular para dni
        //Tabla
        GridPane gridPane = new GridPane();
        gridPane.add(numero, 0, 0);
        gridPane.add(numeroTel, 1, 0);

        //Caja para colocar los label vacíos en vertical
        VBox izquierda = new VBox(10);
        izquierda.getChildren().addAll(gridPane,mostrarTexto);

        //Colocación en la ventana
        BorderPane root = new BorderPane();
        root.setBottom(btnGuardar); //El botón lo coloco abajo
        root.setLeft(izquierda); //La caja a la izquierda

        //El botón lo alineo a la derecha
        BorderPane.setAlignment(btnGuardar,Pos.BOTTOM_RIGHT);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Formulario, numero correcto, Ejercicio 14");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
