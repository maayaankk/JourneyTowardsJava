package SingleTonPattern;

public class MainCLass {
    public static void main(String[] args) {

        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();
        AppConfig obj3 = AppConfig.getInstance();
        AppConfig obj4 = AppConfig.getInstance();

    }
}
