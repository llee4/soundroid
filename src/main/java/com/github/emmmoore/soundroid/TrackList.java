package com.github.emmmoore.soundroid;

import java.util.ArrayList;

import com.github.emmmoore.soundroid.SoundroidTrack;

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

}
