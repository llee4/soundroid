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
