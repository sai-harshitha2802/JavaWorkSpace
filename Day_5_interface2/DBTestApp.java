public class DBTestApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseConnection db = new MySql();
		// DatabaseConnection db =new Oracle();
		db.Connect();
	}


}
