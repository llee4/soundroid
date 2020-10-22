package com.github.emmmoore.soundroidplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 *  Represents a player for a list of tracks, including basic functionalities.
 */
public class SoundroidPlayer {
    /**
     * Handles the media to be played/paused etc.
     */
    MediaPlayer player;

    /**
     * Plays the media "bensound_evolution" with a MediaPlayer (either from the pausing point or
     * from the beginning), stopping the player at the song's completion.
     *
     * @param v
     */
    public void play(View v) {
        if (player == null)
            player = MediaPlayer.create(this, R.raw.bensound_evolution);
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                stopPlayer();
            }
        });
        player.start();
    }

    /**
     * Pauses the media.
     *
     * @param v
     */
    public void pause(View v) {
        if (player != null)
            player.pause();
    }

    /**
     * Stops playing the song (meaning playing would begin at the start of the song).
     *
     * @param v
     */
    public void stop(View v) {
        stopPlayer();
    }

    /**
     * Releases the MediaPlayer object.
     */
    public void stopPlayer() {
        if (player != null) {
            player.release();
            Toast.makeText(this, "player released", Toast.LENGTH_SHORT);
            player = null;
        }
    }
}