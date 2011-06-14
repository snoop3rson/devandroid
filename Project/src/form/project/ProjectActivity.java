package form.project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class ProjectActivity extends Activity {
    /** Called when the activity is first created. */
	Button login;
	EditText userName;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        login = (Button) findViewById(R.id.LoginButton);
        userName = (EditText) findViewById(R.id.userName);
        login.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str = userName.getText().toString();
				setContentView(R.layout.hello);
				TextView user = (TextView) findViewById(R.id.userName);
				user.setText(str);
			}
		});
    }
}