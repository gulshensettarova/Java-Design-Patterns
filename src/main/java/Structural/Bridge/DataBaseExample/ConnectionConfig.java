package Structural.Bridge.DataBaseExample;

public abstract class ConnectionConfig {
    protected DBConnection connection;
    public ConnectionConfig(DBConnection connection){
        this.connection=connection;
    }
    //Interface ve abstract class arasindaki elaqe bu metod vasitesile yaradilir
     abstract void connect();

}
