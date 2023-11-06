package SingletonPattern.Solution;

public class DBConnection {
    private static DBConnection conn;

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        if (conn == null) {
            synchronized (DBConnection.class) {
                if (conn == null) {
                    conn = new DBConnection();
                }
            }
        }
        return conn;
    }
}
