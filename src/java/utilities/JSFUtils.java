/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author ZORE
 */
public final class JSFUtils {
    public static String ddd;
    
    public void sendInfoMessage(String message){
        //public static final String GGG;
        FacesMessage facesMessage=createMessage(FacesMessage.SEVERITY_INFO,message);
        addMessageToJsfContext(facesMessage);
    
    }
    public void sendErrorMessage(String message){
        FacesMessage facesMessage=createMessage(FacesMessage.SEVERITY_ERROR,message);
        addMessageToJsfContext(facesMessage);
    
    }

    private FacesMessage createMessage(FacesMessage.Severity severity, String message) {
       return new FacesMessage(severity,message,message);
    }

    private void addMessageToJsfContext(FacesMessage facesMessage) {
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }
}
