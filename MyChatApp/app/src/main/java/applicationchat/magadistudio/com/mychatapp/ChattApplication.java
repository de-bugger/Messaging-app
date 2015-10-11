package applicationchat.magadistudio.com.mychatapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import model.Message;

/**
 * Created by paulodichone on 4/10/15.
 */
public class ChattApplication extends Application {

    public static final String APP_KEY_ID = "mzF0sWtqPp1OIols6xUiR8EzJey2qiBSvdzBlp83";
    public static final String APP_CLIENT_ID = "bvdN9onwQig6HF8fD7XvPvENefUpWplFxhe9Qt0k";

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        ParseObject.registerSubclass(Message.class);

        Parse.initialize(this, APP_KEY_ID, APP_CLIENT_ID);

    }
}
