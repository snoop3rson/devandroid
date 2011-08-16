package mosquito.killer;

import mosquito.killer.R;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MosquitoKillerActivity extends Activity {

MediaPlayer  mp;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
            
    Button start = (Button)findViewById(R.id.start);
    Button pause = (Button)findViewById(R.id.pause);
    start.setOnClickListener(new OnClickListener(){
        

        private Context context;

        @Override
        public void onClick(View view)
        {
            try{
                playAudio(this, R.raw.music);
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

        private void playAudio(OnClickListener onClickListener, int music) {
            // TODO Auto-generated method stub
            context = getApplicationContext();
            mp = MediaPlayer.create(context, R.raw.music);
            mp.start();

        }});
    pause.setOnClickListener(new OnClickListener(){

        @Override
        public void onClick(View v) {

            mp.pause();

        }});
    
     final Button about1 = (Button) findViewById(R.id.about);
     about1.setOnClickListener(new View.OnClickListener() {
         
         public void onClick(View v) {
             // TODO Auto-generated method stub
                setContentView(R.layout.about);

           }});
    }}
