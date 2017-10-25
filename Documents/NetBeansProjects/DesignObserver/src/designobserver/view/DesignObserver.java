package designobserver.view;

import designobserver.model.Herald;
import designobserver.model.MainDisplay;
import designobserver.model.Noble;
import java.util.Scanner;

/**
 * Main class. 
 *
 * The Herald class, will be able to send message to the Noble class with
 * the terminal.
 * @author @author Ping Tian-sen
 */
public class DesignObserver extends MainDisplay {

    /**
     *
     * @param h Observable object
     */
    public DesignObserver(Herald h) {
        super(h);
    }
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Herald herald_ = new Herald();       
        Noble noble_ = new Noble (herald_);
        DesignObserver obs = new DesignObserver (herald_);
        
        Scanner sc = new Scanner (System.in);
        
        while (sc.hasNextLine() ){
            herald_.sendMsg(sc.nextLine());       
        }  

    }

  
}
