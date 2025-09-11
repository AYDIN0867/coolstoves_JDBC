package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.JDBCReusableMethods;

public class Hooks {

    @Before("@DB")
    public void connectToDatabase() throws Exception{
        System.out.println("Veritabanına bağlanıyor...");
        JDBCReusableMethods.createConnection();
    }

    @After("@DB")
    public void disconnectFromDatabase() throws Exception{
        System.out.println("Veritabanı bağlantısı kesiliyor");
        JDBCReusableMethods.closeConnection();
    }




}