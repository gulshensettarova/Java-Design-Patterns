package Structural.Bridge.DataBaseExample;

public class DataBase extends ConnectionConfig{
    public DataBase(DBConnection connection) {
        super(connection);
    }

    @Override
    void connect() {
      connection.connect();
    }
}
