package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     System.out.println("je me  conceter au serveur");
     Socket s= new Socket("localhost",1234);
     InputStream is=s.getInputStream();
     OutputStream os=s.getOutputStream();
     /*
      * Saisir un nombre par le client
      */
     Scanner scanner= new Scanner(System.in);
     System.out.println("donner un nombre");
     int nb=scanner.nextInt();
     System.out.println("j'envoie le nombre" +nb+" au server" );
     os.write(nb);
    
     System.out.println("j'attend la reponse" );

     int res=is.read();
     System.out.println(" la reponse est "+res );
     
	}

}
