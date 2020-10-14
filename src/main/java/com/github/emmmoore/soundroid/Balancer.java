import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Balancer {
    private MediaPlayer mp;

    /**
     * Initializes a Balancer object based on a MediaPlayer object
     * @param mp
     */
    public Balancer(MediaPlayer mp) {
        this.mp = mp;
    }

    /**
     * Sets stereo balance between left and right speakers.
     * -1.0 corresponds to completely left and 1.0 to fully right audio.
     * @param balance
     */
    public void setBalance(double balance) {
        mp.setBalance(balance);
    }

    /**
     * Returns the stereo balance
     */
    public double getBalance() {
        return mp.getBalance();
    }

}