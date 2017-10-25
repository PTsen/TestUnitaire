

package designobserver.model;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * A frame that will allow to add an Observer
 * 
 * @author @author Ping Tian-sen
 */

public class MainDisplay extends JFrame {
    
    /**
     *
     */
    public JButton btAdd_;
     private Herald herald__;
     
    /**
     *
     * @param h, Observable Object
     */
    public MainDisplay (Herald h){
    
        super("Add Observer");
               
        this.herald__=h;
        initDisplay();
        initEvent();
        this.setMinimumSize(new Dimension(150, 50));
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    
    
    }
    
     private void initDisplay() {
                    
        this.btAdd_=new JButton("Add Observer");
        this.add(this.btAdd_);
        
        pack();
        
    }
     
     private void initEvent(){
     
         btAdd_.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                addObs();
            }
        });
            
     }
     
     private void addObs(){
     
     Noble n = new Noble (this.herald__);
     
     }
         
    
}
