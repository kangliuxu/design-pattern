package abstractfactory.v3;

import abstractfactory.v2.SqlCommand;
import abstractfactory.v2.SqlConnection;
import abstractfactory.v2.SqlConnectionFactory;

public interface DBFactory {

    SqlConnection  createSqlConnection();
    SqlCommand createSqlCommand();
}
