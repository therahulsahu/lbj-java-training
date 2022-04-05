import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class TransactionExample {
	private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";
	
	private static final String SQL_UPDATE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";
	
	private static final String SQL_TABLE_CREATE = "CREATE TABLE EMPLOYEE" + "(ID serial,"
			+ " NAME varchar(100) NOT NULL," + " SALARY numeric(15, 2) NOT NULL,"
			+ " CREATED_DATE timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP," + " PRIMARY KEY (ID)" + ")";
	
	private static final String SQL_TABLE_DROP = "DROP TABLE EMPLOYEE";
	
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/db1", "postgres", "admin");
			System.out.println(connection);
			Statement statement = connection.createStatement();
			
			// statements which need some data
			PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
			PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
			
//			statement.execute(SQL_TABLE_DROP);
			statement.execute(SQL_TABLE_CREATE);     // exception if table is already created
			
			System.out.println("Table created!");

			// transaction block
			// by default its true
			connection.setAutoCommit(false);
			
			// first set the parameters
			psInsert.setString(1, "Rahul");
			psInsert.setBigDecimal(2, new BigDecimal(10000));
			psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
			
			// then execute the statement
			psInsert.execute();
			
			psInsert.setString(1, "Nitesh");
            psInsert.setBigDecimal(2, new BigDecimal(20000));
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();
            
            connection.commit();
            
            connection.setAutoCommit(true); // good practice to set it back to true
            
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
