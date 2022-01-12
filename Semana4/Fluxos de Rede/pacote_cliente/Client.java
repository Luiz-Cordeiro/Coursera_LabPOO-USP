package pacote_cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws IOException{
		
		if(args.length != 2) {
			System.out.println("Insira a porta e o nome do host servidor");
			System.exit(1);
		}
		
		String hostName = args[0];
		int portNumber = Integer.parseInt(args[1]);
		
		try(
			Socket echoSocket = new Socket(hostName, portNumber); // Estabelece uma porta e nome de host do servidor
			PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true); // Configura a saída para o servidor
			BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream())); // Configura a entrada do cliente proveniente do servidor
			BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in)); // Configura a entrada padrão dos dados do cliente			
			)
		{
			String userInput;
			while((userInput = stdIn.readLine()) != null) {
				out.println(userInput);
				System.out.println("echo: " + in.readLine());
			}
		} catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                hostName);
            System.exit(1);
        } 
		

	}

}
