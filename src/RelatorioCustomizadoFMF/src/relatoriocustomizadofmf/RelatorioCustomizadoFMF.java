
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatoriocustomizadofmf;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import MysqlCon.MysqlCon;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lucca
 */
public class RelatorioCustomizadoFMF extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        MysqlCon BD = new MysqlCon();
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Map<String, String> valores = new HashMap<String, String>(); 
               
                valores=Leitor.getAtributos("../data/teste.txt"); //valores agr é um mapa no qual todas as chaves são atributos
                                                                  //porem os valores são null
                
                          
                //String resultado = Leitor.getConsulta("../data/teste.txt", valores);
                //BD.query("SELECT Nome FROM Professor WHERE Disciplina='Matemática III';");
                //System.out.println(resultado);
            } 
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
