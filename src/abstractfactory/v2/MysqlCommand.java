package abstractfactory.v2;

public class MysqlCommand extends SqlCommand{
    @Override
    public DataReader read() {
        return new MysqlDataReader();
    }
}
