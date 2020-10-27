import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.lang.model.util.ElementScanner14;

/**
 * This class can set and get the tonal balancer of a media player
 */

public class Balancer {
  /**
   * Stores a reference to the MediaPlayer being balanced
   */
  MediaPlayer player;
  /**
   * Stores the left and right balance (not necessarily that of the left and right speaker)
   */
  double xBalance;
  /**
   * Stores the angle between the balance's right and the right speaker
   */
  double theta;

  /**
   * Creates a Balancer object for a SoundroidTrack, and initializes the current balance
   * @param st
   */
  public Balancer(SoundroidTrack st) {
    player = st.getMediaPlayer();
    balanceX = player.getBalance();
  }

  /**
   * Sets a standard stereo balance, where 0 
   * @param xBal
   */
  public void setXBalance(double xBal) {
    if (xBal > 1) {
      xBalance = 1;
    } else if (xBal < -1) {
      xBalance = -1;
    } else {
      xBalance = xBal;
    }

    player.setBalance(xBalance);
  }

}