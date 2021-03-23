package SingleTonPattern;

public class AppConfig {
    private AppConfig(){ // constructor.

    }

    private static AppConfig obj = new AppConfig(); // static object.

    public static AppConfig getInstance(){ // static function
       /* if (obj == null){      // if we initially don't want to create a object if its not required we can use this.
            obj = new AppConfig();
        }*/
        return obj;
    }
}
