package abstractfactory.v2;



public class SqlCommand {
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
