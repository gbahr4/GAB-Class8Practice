
package Class8PracticeController;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Purpose: Chord Chart Managed Bean
 * Author: Greg Bahr
 * Revision: 1.0
 */
@ManagedBean
@SessionScoped
public class ChordBean {

    private String value;
    private String chordImage;
    
    public ChordBean() {
    }

    public void setChordImage(String chordImage) {
        this.chordImage = chordImage;
    }

    

    public String getValue() {
        return value;
    }

    public ChordBean(String value, String chordImage) {
        this.value = value;
        this.chordImage = chordImage;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
    
    public String showChord() {
        
        if (value.equals("C")) {
            chordImage = "Resources/images/CMajor.gif";
        } else if (value.equals("A")) {
            chordImage = "Resources/images/AMajor.gif";
        } else if (value.equals("G")) {
            chordImage = "Resources/images/GMajor.gif";
        } else if (value.equals("E")) {
            chordImage = "Resources/images/EMajor.gif";
        } else if (value.equals("D")) {
            chordImage = "Resources/images/DMajor.gif";
            
        }
        
        return chordImage;
        
        
    }
    
    
    
}
