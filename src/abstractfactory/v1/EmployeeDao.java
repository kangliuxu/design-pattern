package abstractfactory.v1;

/**
 * 模拟一个数据库读取数据的过程
 */
public class EmployeeDao {
    public void getEmployee(){
        SqlConnection sqlConnection = new SqlConnection();
        SqlCommand sqlCommand = new SqlCommand();
        sqlCommand.setSqlConnection(sqlConnection);
        DataReader dataReader = sqlCommand.read();
    }
}

class SqlConnection{

}

class SqlCommand{
    private SqlConnection sqlConnection;


    public SqlConnection getSqlConnection() {
        return sqlConnection;
    }

    public void setSqlConnection(SqlConnection sqlConnection) {
        this.sqlConnection = sqlConnection;
    }

    public DataReader read(){
        return new DataReader();
    }
}

class DataReader{

}