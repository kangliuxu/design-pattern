package abstractfactory.v3;

import abstractfactory.v2.*;

public class OracleDBFactory implements DBFactory{
    @Override
    public SqlConnection createSqlConnection() {
        return new OracleConnection();
    }

    @Override
    public SqlCommand createSqlCommand() {
        return new OracleCommand();
    }
}
