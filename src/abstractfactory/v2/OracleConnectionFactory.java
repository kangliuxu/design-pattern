package abstractfactory.v2;

public class OracleConnectionFactory implements SqlConnectionFactory{
    @Override
    public SqlConnection createSqlConnection() {
        return new OracleConnection();
    }
}
