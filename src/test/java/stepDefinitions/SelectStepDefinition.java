package stepDefinitions;

import io.cucumber.java.en.Given;
import manage.QueryManage;
import org.testng.Assert;
import utilities.JDBCReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class SelectStepDefinition {

    ResultSet resultSet;
    QueryManage queryManage=new QueryManage();

    @Given("Deposits tablosu için SQL SORGULARI HAZIRLANIR ve ÇALIŞTIRILIR")
    public void deposits_tablosu_için_sql_sorguları_hazırlanır_ve_çalıştırılır() {

    String QUERY=queryManage.getDepositeSelectQuery();
    resultSet=JDBCReusableMethods.executeQuery(QUERY);

    }
    @Given("Deposits tablosundan donen SONUÇLARI İŞLENİR")
    public void deposits_tablosundan_donen_sonuçları_işlenir() throws SQLException {

        List<Integer> expectedResultList=new ArrayList<>();
        expectedResultList.add(1);
        expectedResultList.add(9);
        expectedResultList.add(10);
        expectedResultList.add(12);

        List<Integer> actualResultList=new ArrayList<>();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
            actualResultList.add(resultSet.getInt(1));//1 yazılan yere user_id de yazılabilir...



        }

        assertEqualsNoOrder(actualResultList,expectedResultList);

    }






}