package sbms.bean;
  
import javax.faces.application.FacesMessage;  
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;  
  
@ManagedBean
public class MenuBean {  
      
    public void save() {  
        addMessage("Data saved");  
    }  
      
    public void update() {  
        addMessage("Data updated");  
    }  
      
    public void delete() {  
        addMessage("Data deleted");  
    }  
      
    public void addMessage(String summary) {  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);  
        FacesContext.getCurrentInstance().addMessage(null, message);  
    }  
}  