import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by gz on 2017/4/24.
 */

public class BaseApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        LitePalApplication.initialize(mContext);
    }

    public static Context getContext() {
        return mContext;
    }
}
