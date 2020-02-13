package abstractfactory.v2;

public class MysqlCommandFactory implements SqlCommandFactory{


    @Override
    public SqlCommand createSqlCommand() {
        return new MysqlCommand();
    }
}
