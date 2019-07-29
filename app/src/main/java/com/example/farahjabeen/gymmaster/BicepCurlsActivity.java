package com.example.farahjabeen.gymmaster;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;
import android.support.v7.widget.Toolbar;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class BicepCurlsActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {


    public static final String API_KEY = "AIzaSyDnM32PTFmNpUMe1Izj81ITA6hjsZ2CZ14 \t";
    public static final String VIDEO_ID = "3OZ2MT_5r3Q";
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicep_curls);

        mToolbar = (Toolbar) findViewById(R.id.atoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Biceps Curls");


        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube);
        youTubePlayerView.initialize(API_KEY , this);

    }

    private Toolbar getSupportActionBar() {
        return mToolbar;
    }

    private void setSupportActionBar(Toolbar mToolbar) {
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean wasRestored) {
        youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);
        youTubePlayer.setPlaybackEventListener(playbackEventListener);

        if(!wasRestored)
        {
            youTubePlayer.cueVideo(VIDEO_ID);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this,"Failured to Initial state" ,Toast.LENGTH_LONG).show();

    }


    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onPlaying() {


        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean arg0) {

        }

        @Override
        public void onSeekTo(int arg0) {

        }
    };

    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String arg0) {

        }

        @Override
        public void onAdStarted() {

        }

        @Override
        public void onVideoStarted() {

        }

        @Override
        public void onVideoEnded() {

        }

        @Override
        public void onError(YouTubePlayer.ErrorReason arg0) {

        }
    };



}
