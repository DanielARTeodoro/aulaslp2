package frank.aula0609;
 //conecaug d hdstatus = STATUs CONECTADO COM SUCESSOo class dhhdsgcghksd;
 //sdhcbhbdgghdhbhsSE N�O THIS.STATUS = ""x;
 //sdygy ygb dhsgygc hddcgygdc;
 //Criar uma classe chamada conec�ao;
 //Eu n�o fa�o ideia de como fazer esta classe, na verdade eu n�o estou entendendo nada de java;
 //tentarei aprender algo para passar, eu sei que o professor vai me deixar de DP, mas presciso me virar;
 //gustavo, descomplica, qualqeur coisa que me ajude
 //Eu presciso ter for�a de vontade para compensar o qeu eu estou perdendo em 
 //java, html e SQL;
 
 public class Conexao{
	 
	 public String status = "n�o conectado!";
	 
	 public String user = "root";
	 public String pwd = "";
	 public String driverName = "com.mysql.jdbc.Driver";
	 public String server = "localhost";
	 
	 //metodo para devolver a conec��o
	
	 public Connection getConnection() {
		 try {
			 Class.forName(thi.driverName);
			 tris.conn = java.sql.DriverManager.getConnection(arg0)
		 }
	 }
	 
	 public String getStatus() {
		 return this.status;
	 }
	 
	 public Connection closeConnection() {
		 return false;
	 }
	 
	 public Connection resetConnection() {
		 this.close
	 }
	 
 }