package abstractfactory.v2;


/**
 * 版本2 使用工厂方法模式创建对象，解决紧耦合问题(new )
 * 缺点：由于sql操作对象是一系列相关的，分开创建可能会引起不恰当的操作
 */
public class EmployeeDao {

    private SqlConnectionFactory sqlConnectionFactory;
    private SqlCommandFactory sqlCommandFactory;

    public EmployeeDao(SqlConnectionFactory sqlConnectionFactory, SqlCommandFactory sqlCommandFactory) {
        this.sqlConnectionFactory = sqlConnectionFactory;
        this.sqlCommandFactory = sqlCommandFactory;
    }

    public void getEmployee(){
        SqlConnection sqlConnection = sqlConnectionFactory.createSqlConnection();
        SqlCommand sqlCommand = sqlCommandFactory.createSqlCommand();
        sqlCommand.setSqlConnection(sqlConnection);
        DataReader dataReader = sqlCommand.read();
    }
}
