package abstractfactory.v2;

public class OracleCommandFactory implements SqlCommandFactory{


    @Override
    public SqlCommand createSqlCommand() {
        return new OracleCommand();
    }
}
