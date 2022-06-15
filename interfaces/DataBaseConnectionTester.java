package interfaces;

public class DataBaseConnectionTester  {
	public static void main(String[] args)
	
	{
	
		DatabaseConnector oDatabaseConnector;
		oDatabaseConnector = new OracleDataBase();
		oDatabaseConnector.connectToDatabase();
		oDatabaseConnector = new MongoDataBase();
		oDatabaseConnector.connectToDatabase();
		oDatabaseConnector = new SqlServerDatabase();
		oDatabaseConnector.connectToDatabase();
	}
	
}