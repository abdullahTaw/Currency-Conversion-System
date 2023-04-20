/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;

/**
 *
 * @author SCc
 */
public class ViewManager {
    public static LoginPage logPage;
    public static SystemPage sysPage;
    
    
    public ViewManager(){   
    }
    
    public static void openLoginPage() throws IOException{
        if (logPage == null) {
            logPage = new LoginPage();
            logPage.show();
        } else {
            logPage.show();
        }
        
    }
    public static void closeLoginPage(){
        if(logPage != null)
            logPage.close();
    }
    
    public static void openSystemPage() throws IOException{
        if (sysPage == null) {
            sysPage = new SystemPage();
            sysPage.show();
        } else {
            sysPage.show();
        }
        
    }
    public static void closeAdminPage(){
        if(sysPage != null)
            sysPage.close();
    }

    public void showLogin() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
