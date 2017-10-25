

package designobserver.model;

import java.util.Observable;

/**
 * 
 *Observable class.
 *
 * This class, will notify all Observers and send a message.
 * 
 * @author @author Ping Tian-sen
 */

public class Herald extends Observable {

    private Message msg;
    
    /**
     *
     */
    public Herald(){
    
        this.msg=new Message("");
   
    }
    
    /**
     * 
     * @param m, message that will be send
     */
    public void sendMsg(String m){
    
        this.msg.setMessage(m);
        setChanged();
        notifyObservers(this.msg);
    
    } 
    
    /**
     *
     * @param n Observer Object
     */
    public void subscribe(Noble n){
        this.addObserver(n); 
    }
   
    /**
     *
     * @param n Observer Object
     */
    public void unsubscribe (Noble n){
        System.out.println("Unsubcribe");
        this.deleteObserver(n);
    }
  
    
}
