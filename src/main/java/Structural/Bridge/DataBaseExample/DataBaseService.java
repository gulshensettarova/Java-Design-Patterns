package Structural.Bridge.DataBaseExample;

public class DataBaseService {
    public static void main(String[] args) {
      ConnectionConfig oracle=new DataBase(new Oracle());
      oracle.connect();

      ConnectionConfig postgre=new DataBase(new PostgeSQL());
      postgre.connect();
    }
}
