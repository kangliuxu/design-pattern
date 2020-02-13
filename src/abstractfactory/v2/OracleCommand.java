package abstractfactory.v2;

public class OracleCommand extends SqlCommand{
    @Override
    public DataReader read() {
        return new OracleDataReader();
    }
}
