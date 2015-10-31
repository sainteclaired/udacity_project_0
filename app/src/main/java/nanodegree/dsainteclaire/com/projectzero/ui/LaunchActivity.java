package nanodegree.dsainteclaire.com.projectzero.ui;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import nanodegree.dsainteclaire.com.projectzero.R;

public class LaunchActivity extends AppCompatActivity {
    private Button mSpotifyButton;
    private Button mScoresButton;
    private Button mLibraryButton;
    private Button mBuildItButton;
    private Button mXyzButton;
    private Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        Resources resources = getResources();

        mSpotifyButton = (Button)findViewById(R.id.spotify_button);
        mSpotifyButton.setOnClickListener(new DisplayToastClickListener(this, resources.getString(R.string.toast_text_spotify)));
        mScoresButton = (Button)findViewById(R.id.scores_button);
        mScoresButton.setOnClickListener(new DisplayToastClickListener(this, resources.getString(R.string.toast_text_football_scores)));
        mLibraryButton = (Button)findViewById(R.id.library_button);
        mLibraryButton.setOnClickListener(new DisplayToastClickListener(this, resources.getString(R.string.toast_text_library)));
        mBuildItButton = (Button)findViewById(R.id.bigger_button);
        mBuildItButton.setOnClickListener(new DisplayToastClickListener(this, resources.getString(R.string.toast_text_build_it)));
        mXyzButton = (Button)findViewById(R.id.reader_button);
        mXyzButton.setOnClickListener(new DisplayToastClickListener(this, resources.getString(R.string.toast_text_reader)));
        mCapstoneButton = (Button)findViewById(R.id.capstone_button);
        mCapstoneButton.setOnClickListener(new DisplayToastClickListener(this, resources.getString(R.string.toast_text_capstone)));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launch, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private static class DisplayToastClickListener implements View.OnClickListener {
        private final Context mContext;
        private final String mDisplayText;

        public DisplayToastClickListener(Context context, String displayText) {
            mContext = context;
            mDisplayText = displayText;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(mContext, mDisplayText, Toast.LENGTH_SHORT).show();
        }
    }
}
