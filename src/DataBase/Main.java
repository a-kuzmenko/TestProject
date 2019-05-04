package DataBase;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by UITS-Admin on 04.05.2019.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/mydb", "root", "");
        Statement statement = connection.createStatement();
        ArrayList<Employee> allEmployees = getAllEmployees(connection, statement);
        allEmployees.forEach(System.out::println);

        ArrayList<Clients> allClients = getAllClients(connection, statement);
        allClients.forEach(System.out::println);


    }

    public static ArrayList<Employee> getAllEmployees(Connection connection, Statement statement) throws SQLException {
        ArrayList<Employee> employees = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery("Select * from s");


        while(resultSet.next()){
            employees.add(new Employee(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4),
                    resultSet.getDouble(5))
            );

        }



        connection.close();
        return employees;
    }

    public static ArrayList<Clients> getAllClients(Connection connection, Statement statement) throws SQLException {
        ArrayList<Clients> clients = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery("Select * from c");
        while(resultSet.next()){
            clients.add(new Clients(resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getInt(4),
                    resultSet.getInt(5))
            );
            
        }

        connection.close();
        return clients;
    }
}
