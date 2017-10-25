

package designobserver.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;
import static javax.swing.text.DefaultCaret.ALWAYS_UPDATE;

/**
 * Frame for Noble class
 * @author @author Ping Tian-sen
 */

public class NobleDisplay extends JFrame{
    
    private JScrollPane jSP;

    /**
     *
     */
    protected JTextArea tA;
    private JMenuBar mb;

    /**
     *
     */
    protected JMenu mOp;  

    /**
     *
     */
    protected JMenuItem mSub;
    
    /**
     *
     */
    public NobleDisplay(){
        super("Noble");
        
        initDisplay();
        this.setMinimumSize(new Dimension(350, 300));
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    
    }

    private void initDisplay() {
        
        mb = new JMenuBar();
        mOp = new JMenu("Option");
        mSub = new JMenuItem("Subscribe");
        mb.add(mOp);
        mOp.add(mSub);
        this.add(mb);
        
        
        this.tA = new JTextArea(15,30);
        DefaultCaret caret = (DefaultCaret) tA.getCaret();
        caret.setUpdatePolicy(ALWAYS_UPDATE);
        this.tA.setEditable(false);
        this.tA.setBackground(Color.white);
        this.jSP = new JScrollPane(this.tA);
        this.add(this.jSP,BorderLayout.SOUTH);
        
        
        
        pack();
        
    }
    
    
 
    
}
