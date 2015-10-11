package applicationchat.magadistudio.com.mychatapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.widget.ListView;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button loginButton;
    private Button createAccountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createAccountButton = (Button) findViewById(R.id.createButtonId);
        loginButton = (Button) findViewById(R.id.loginButton);

        createAccountButton.setOnClickListener(this);
        loginButton.setOnClickListener(this);



//        ParseUser user = new ParseUser();
//        user.setUsername("hellpall");
//        user.setPassword("hello");
//        user.setEmail("pal@me.com");
//
//        user.put("phone", "650-253-0000");
//        user.put("foood", "Pizza");
//
//        user.signUpInBackground(new SignUpCallback() {
//            @Override
//            public void done(ParseException e) {
//                if (e == null) {
//                    //we are good!
//                    Toast.makeText(getApplicationContext(), "Yeahh! All is good!", Toast.LENGTH_LONG).show();
//                }else {
//                    //something went wrong
//                }
//
//            }
//        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.loginButton:
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                //we do something
                break;
            case R.id.createButtonId:
                startActivity(new Intent(MainActivity.this, CreateAccount.class));
        }

    }
}
