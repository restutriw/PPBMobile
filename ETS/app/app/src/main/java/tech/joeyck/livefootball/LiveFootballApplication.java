package tech.joeyck.livefootball;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

public class LiveFootballApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidThreeTen.init(this);
    }

}
