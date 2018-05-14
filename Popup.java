
import javax.swing.JOptionPane;

public class Popup {

   double score;

   public Popup(double score){
        this.score = score;
   }
    
   public double getScore(){
        return score;
   }
   public void setScore(double Score){
        this.score=score;
   }

   public void Alert(){
    JOptionPane.showMessageDialog(null, "Game Over Score is "+score+" ","Results", JOptionPane.INFORMATION_MESSAGE );
   }
}