package abstractfactory.v3;


import abstractfactory.v2.*;

/**
 * 版本3 使用抽象工厂方法创建一系列相关对象,可以保证创建的是一系列的对象。
 * 可以说工厂方法是抽象工厂的一个特例，只有一个产品的创建
 *
 */
public class EmployeeDao {

    private DBFactory dbFactory;

    public EmployeeDao(DBFactory dbFactory) {
        this.dbFactory = dbFactory;
    }

    public void getEmployee(){
        SqlConnection sqlConnection = dbFactory.createSqlConnection();
        SqlCommand sqlCommand = dbFactory.createSqlCommand();
        sqlCommand.setSqlConnection(sqlConnection);
        DataReader dataReader = sqlCommand.read();
    }
}
