
package designobserver.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * Observer class
 *
 * This class, will receive any message from Herald class
 * @author @author Ping Tian-sen
 */
public class Noble extends NobleDisplay implements Observer {
   
    /**
     *
     */
    protected Herald herald_;
   
    /**
     *
     * @param h Observable Object
     */
    public Noble(Herald h){
        
        this.herald_=h;
        installEvents();
    
    }
  
      
     private void installEvents() {
    
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent we) {
            }
            @Override
            public void windowClosing(WindowEvent we) {
                quitter();
            }
            @Override
            public void windowClosed(WindowEvent we) {
            }
            @Override
            public void windowIconified(WindowEvent we) {
            }
            @Override
            public void windowDeiconified(WindowEvent we) {
            }
            @Override
            public void windowActivated(WindowEvent we) {
            }
            @Override
            public void windowDeactivated(WindowEvent we) {
            }
        });
        
        mSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tA.append("Susbcribe \n ");
                
                subscribe();
            
            }
            });
                  
    }

     
     private void quitter(){
     
         this.herald_.unsubscribe(this);
     
     }
     
     private void subscribe(){
         
         this.herald_.subscribe(this);
         mSub.setVisible(false);
                     
     }
    
    @Override
    public void update(Observable o, Object arg) {
        
        Message m = (Message) arg;
        this.tA.append("\n");
        this.tA.append(m.getMessage());
        
    }
    
    

    
}
