import java.sql.*;

public class JDBC_First_Class {

    //1-!!!!!!!!!!!!!!!!database in erişim bilgilerini iste

 /*
     type jdbc:mysql
     host/ip 195.35.59.18
     port 3306
     database_name u201212290_galoantec
     username u201212290_galoanuser
     password HPo?+7r$
     Database Administratordan alinan ham veriler dogru formatta URL'e donusturuldu...

 URL=type://host/ip/database_name
 USERNAME=u201212290_galoanuser
 PASSWORD=HPo?+7r$

//ERİŞİM BİLGİLERİNDEN url İ HAZIRLA

URL=jdbc:mysql://195.35.59.18/u201212290_galoantec
USERNAME=u201212290_galoanuser
PASSWORD=HPo?+7r$
  */

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

  //ilk ADIM JDBC urucusunu yükleme

  Class.forName("com.mysql.cj.jdbc.Driver"); //Exception fırlattık...

//bunu yazmasak da pom xml e dependency olarak eklediğimiz için  çalışırdır...


  //2. ADIM       VERİTABANI BAĞLANTISI KURARIZ....

        String URL="jdbc:mysql://195.35.59.18/u201212290_qaloantec";
        String USERNAME="u201212290_qaloanuser";
        String PASSWORD="HPo?+7r$";

      Connection connection= DriverManager.getConnection(URL,USERNAME,PASSWORD); //çalıştırılan yapının çoğunlugu java.sql olacak

//3. ADIM SQL Sorguları olusturma


String QUERY="SELECT*FROM users";

//4.ADIM SQL SORGULARINI ÇALIŞTIRMA

Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY) ; //1004 -1007

       ResultSet resultSet= statement.executeQuery(QUERY);







    }




}
