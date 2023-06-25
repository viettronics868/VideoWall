

package com.khoanam.youtubevideowall;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import android.os.Bundle;

/**
 * A simple YouTube Android API demo application which shows how to create a simple application that
 * displays a YouTube Video in a {@link YouTubePlayerView}.
 * <p>
 * Note, to use a {@link YouTubePlayerView}, your activity must extend {@link YouTubeBaseActivity}.
 */
public class PlayerViewDemoActivity extends YouTubeFailureRecoveryActivity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.playerview_demo);

    YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
    youTubeView.initialize(DeveloperKey.DEVELOPER_KEY, this);
  }

  @Override
  public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
      boolean wasRestored) {
    if (!wasRestored) {
      player.cuePlaylist("PLdqmy90rx_N2W5hEByBXqA70mBKAXPdHn");
    }
  }

  @Override
  protected YouTubePlayer.Provider getYouTubePlayerProvider() {
    return (YouTubePlayerView) findViewById(R.id.youtube_view);
  }

}
