import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("unchecked")
public class MyUtils {
    private Connection connection;
    private Statement statement;
    private String schemaName;

    public Connection createConnection() throws SQLException {
        DriverManager.registerDriver(new org.h2.Driver());
        connection = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");
        return connection;
    }
    public void closeConnection() throws SQLException {
        // code
        connection.close();
    }
    public Statement createStatement() throws SQLException {
        // code
        statement = connection.createStatement();
        return statement;
    }
    public void closeStatement() throws SQLException {
        // code
        statement.close();
    }
    public void createSchema(String schemaName) throws SQLException {
        // code
        statement.execute("CREATE SCHEMA" +schemaName+" AUTHORIZATION SA");
    }
    public void dropSchema() throws SQLException {
        // code
        statement.execute("DROP SCHEMA"+ schemaName );
    }
    public void useSchema() throws SQLException {
        // code
        statement.execute("SET SCHEMA " + schemaName);
    }
    public void createTableRoles() throws SQLException {
        // code
        statement.executeUpdate("CREATE TABLE Roles ("
                +" id INT NOT NULL AUTO_INCREMENT,"
                + " roleName VARCHAR(20) NOT NULL,"
                + " PRIMARY KEY (`id`),"
                + " UNIQUE INDEX id_ROLES (`id` ASC));");
    }
    public void createTableDirections() throws SQLException {
        // code
        statement.executeUpdate("CREATE TABLE Directions ("
                +" id INT NOT NULL AUTO_INCREMENT,"
                + " directionName VARCHAR(20) NOT NULL,"
                + " PRIMARY KEY (`id`),"
                + " UNIQUE INDEX id_Directions (`id` ASC));");

    }
    public void createTableProjects() throws SQLException {
        // code
        statement.executeUpdate("CREATE TABLE Projects ("
                +" id INT NOT NULL AUTO_INCREMENT,"
                + "  projectName VARCHAR(20) NOT NULL,"
                +"directionId INT NOT NULL"
                +"FOREIGN KEY(directionId)"
                + " PRIMARY KEY (`id`),"
                + " UNIQUE INDEX id_Projects (`id` ASC));");

    }
    public void createTableEmployee() throws SQLException {
        // code
        statement.executeUpdate("CREATE TABLE Employee ("
                +" id INT NOT NULL AUTO_INCREMENT,"
                + " firstName VARCHAR(20) NOT NULL,"
                +"roleId INT NOT NULL"
                +"projectId INT NOT NULL"
                +"FOREIGN KEY(roleId),FOREIGN KEY(projectId)"
                + " PRIMARY KEY (`id`),"
                + " UNIQUE INDEX id_Employee (`id` ASC));");

    }
    public void dropTable(String tableName) throws SQLException {
        // code
        statement.executeUpdate("DROP TABLE IF EXISTS"+tableName+" ;");
    }
    public void insertTableRoles(String roleName) throws SQLException {
        // code
        statement.executeUpdate("insert into Roles (roleName) values(" + roleName+");");

    }
    public void insertTableDirections(String directionName) throws SQLException {
        // code
        statement.executeUpdate("insert into Directions (directionName) values(" + directionName+");");
    }
    public void insertTableProjects(String projectName, String directionName) throws SQLException {
        // code
        statement.executeUpdate("insert into Projects (projectName) values(" + projectName+"),(directionName) values("+ directionName +");");
    }
    public void insertTableEmployee(String firstName, String roleName, String projectName) throws SQLException {
        // code
        statement.executeUpdate("insert into Employee (firstName) values(" + firstName+"), (roleName) values("+roleName+"),(projectName) values("+projectName+");");
    }
    public int getRoleId(String roleName) throws SQLException {
        // code
        ResultSet resultSet = statement
                .executeQuery("SELECT id FROM Roles WHERE roleName='" + roleName + "';");
        int result =-1;
        if (resultSet.next()) {
            result = resultSet.getInt(1);
        }
        resultSet.close();
        return result;
    }
    public int getDirectionId(String directionName) throws SQLException {
        // code
        ResultSet resultSet = statement
                .executeQuery("SELECT id FROM Direction WHERE roleName='" + directionName + "';");
        int result =-1;
        if (resultSet.next()) {
            result = resultSet.getInt(1);
        }
        resultSet.close();
        return result;
    }
    public int getProjectId(String projectName) throws SQLException {
        // code
        ResultSet resultSet = statement
                .executeQuery("SELECT id FROM Project WHERE roleName='" + projectName + "';");
        int result =-1;
        if (resultSet.next()) {
            result = resultSet.getInt(1);
        }
        resultSet.close();
        return result;
    }
    public int getEmployeeId(String firstName) throws SQLException {
        // code
        ResultSet resultSet = statement
                .executeQuery("SELECT id FROM Employee WHERE roleName='" + firstName + "';");
        int result =-1;
        if (resultSet.next()) {
            result = resultSet.getInt(1);
        }
        resultSet.close();
        return result;
    }
    public List<String> getAllRoles() throws SQLException {
        // code
        ResultSet allOfRoles = statement.executeQuery("select * from Roles");
        return (List<String>) allOfRoles;
    }
    public List<String> getAllDirections() throws SQLException {
        // code
        ResultSet allOfDirections = statement.executeQuery("select * from Directions");
        return (List<String>) allOfDirections;
    }
    public List<String> getAllProjects() throws SQLException {
        // code
        ResultSet allOfProjects = statement.executeQuery("select * from Projects");
        return (List<String>) allOfProjects;
    }
    public List<String> getAllEmployee() throws SQLException {
        // code
        ResultSet allOfEmployee = statement.executeQuery("select * from Employee");
        return (List<String>) allOfEmployee;
    }
    public List<String> getAllDevelopers() throws SQLException {
        // code
        ResultSet allDevelopers = statement.executeQuery("Select * from Employee WHERE roleId = '1'");
        return (List<String>) allDevelopers;
    }
    public List<String> getAllJavaProjects() throws SQLException {
        // code
        ResultSet allProjects = statement.executeQuery("Select * from Projects WHERE directionId = '1'");
        return (List<String>) allProjects;
    }
    public List<String> getAllJavaDevelopers() throws SQLException {
        // code
        ResultSet allAllJavaDevelopers = statement.executeQuery("Select * from Projects WHERE directionId = '1' AND roleId = '1'");
        return (List<String>) allAllJavaDevelopers;
    }

}