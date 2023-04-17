//Prepare Statement
package conectivityedition2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConectivityEdition2 {

    static Connection connection;
    static String query;
    static PreparedStatement preparedStatement;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sec sec = new Sec();
        try {
            connection = sec.connect();
            
            ////////////////// create
            query="create table medicine (med_id int primary key , name varchar(30) , price float)";
            preparedStatement=connection.prepareStatement(query);
            preparedStatement.execute();

           /* /////////////////////// insert
            System.out.print("Enter id : ");
            int id = input.nextInt();
            System.out.print("Enter name : ");
            String name = input.next();
            System.out.print("Enter Password : ");
            String pass = input.next();
            query = "insert into employee values (?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, pass);
            preparedStatement.execute();
            System.out.println("Row inserted");*/
            
            
            
            /*////////////////////////////////update
            query="update employee set name=? where id=?";
            preparedStatement=connection.prepareStatement(query);
            System.out.print("Enter id : ");
            int id = input.nextInt();
            System.out.print("Enter name : ");
            String name = input.next();
            preparedStatement.setInt(2, id);
            preparedStatement.setString(1, name);
            preparedStatement.execute();
            System.out.println("update done");*/
            
            
            
            //////////////////////////////////// delete
            /*query="delete from employee where id=?";
            preparedStatement=connection.prepareStatement(query);
            System.out.print("Enter id : ");
            int id = input.nextInt();
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            System.out.println("Delete done");*/
            
            
            
            
            /*////////////////////Select
            ResultSet resultSet = null;
            query="select * from employee";
            preparedStatement=connection.prepareStatement(query);
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id")+"  "
                        +resultSet.getString("name")+"  "+resultSet.getString("password"));
            }*/
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

}
