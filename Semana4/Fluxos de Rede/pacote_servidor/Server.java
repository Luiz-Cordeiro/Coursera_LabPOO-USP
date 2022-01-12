package pacote_servidor;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) throws IOException {
		
		if(args.length != 1) {
			System.out.println("Insira a porta do servidor a ser usada");
			System.exit(1);
		}
		
		int portNumber = Integer.parseInt(args[0]);
		
		try (
			ServerSocket serverSocket = new ServerSocket(Integer.parseInt(args[0])); //Cria um socket do servidor
			Socket clientSocket = serverSocket.accept(); //Espera por uma conexão e retorna um socket diante de acesso
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // Devolve para as informações para o socket cliente
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // Recebe as informações do cliente			
		)
		{
			String inputLine;
			while((inputLine = in.readLine()) != null) {
				out.println(inputLine);
			}
		} catch (IOException e) {
			System.out.println("Exception caught when trying to listen on port " + portNumber + "or listening for a connection");
			System.out.println(e.getMessage());
		}
	}
}
