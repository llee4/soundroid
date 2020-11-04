package com.github.emmmoore.soundroid;

import com.github.emmmoore.soundroid.SoundroidTrack;
import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a list of tracks (such as a queue or a playlist) to be played.
 */
public class TrackList {
  /**
   * The tracks in the TrackList
   */
  ArrayList<SoundroidTrack> trackList;

  /**
   * Constructs an empty TrackList
   */
  public TrackList() {
    trackList = new ArrayList<SoundroidTrack>();
  }

  /**
   * Adds a track to the TrackList
   * @param st
   */
  public void add(SoundroidTrack st) {
    trackList.add(st);
  }

  /**
   * Removes the track at index i
   * @param i
   */
  public void remove(int i) {
    trackList.remove(i);
  }

  /**
   * Removes all instances of a track
   */
  public void remove(SoundroidTrack remSt) {
    for (int i = 0; i < trackList.size(); i++) {
      if (trackList.get(i).equals(remSt)) {
        trackList.remove(i);
        i--;
      }
    }
  }

  /**
   * Shuffles the TrackList
   * (Fisher-Yates Algorithm)
   */
  public void shuffle() {
    Random gen = new Random();

    for (int i = trackList.size() - 1; i > 0; i--) {
      int k = gen.nextInt(i);
      Soundroid temp = trackList.get(i);
      trackList.set(i, trackList.get(k));
      trackList.set(k, temp);
    }
  }

  /**
   * Overrides the toString method
   */
  @Override
  public String toString() {
    return trackList.toString();
  }
}
