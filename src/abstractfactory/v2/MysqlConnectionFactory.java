package abstractfactory.v2;

public class MysqlConnectionFactory implements SqlConnectionFactory{
    @Override
    public SqlConnection createSqlConnection() {
        return new MysqlConnection();
    }
}
