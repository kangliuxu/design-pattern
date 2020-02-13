package abstractfactory.v3;

import abstractfactory.v2.*;

public class MysqlDBFactory implements DBFactory{
    @Override
    public SqlConnection createSqlConnection() {
        return new MysqlConnection();
    }

    @Override
    public SqlCommand createSqlCommand() {
        return new MysqlCommand();
    }
}
