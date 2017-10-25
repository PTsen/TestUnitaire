

package designobserver.model;

/**
 *
 * A message structure
 * 
 * @author Ping Tian-sen
 */
public class Message  {

    private String message;

    /**
     *
     * @param message
     */
    public Message( String message) {
        
        this.message = message;
    }

    /**
     *
     * @return 
     */
    public String getMessage() {
        return message;
    }
    
    /**
     *
     * @param m new message
     */
    public void setMessage(String m){
       this.message=m;
    }

    


}

