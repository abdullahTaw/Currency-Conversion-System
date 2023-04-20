/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author SCc
 */
public class LoginPage extends Stage {

  
    private Scene loginScene;
    private Scene systemScene;
   

    public LoginPage() throws IOException {
        
        //load UserManagment FXML File in UsersManagment Scene
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminFXML/Login.fxml"));
        Parent root = loader.load();     
        loginScene = new Scene(root);
        
        
        //load CreateUser FXML File in CreateUser Scene
        FXMLLoader loaderCreate = new FXMLLoader(getClass().getResource("AdminFXML/System.fxml"));
        Parent rootCreate = loaderCreate.load();     
        systemScene = new Scene(rootCreate);
        
        // Set Main Scene in Admin Dasboard ( UsersManagment Scene )
        this.setScene(systemScene);
        this.setTitle("System Page");
        
        
    }
    public void changeSceneToLoginScene(){
        this.setScene(loginScene);
    }
    public void changeSceneToSystemScene(){
        this.setScene(systemScene);
    }

   
    
}
