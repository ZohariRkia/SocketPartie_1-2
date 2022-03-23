package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ServerSocket ss= new ServerSocket(1234);
      System.out.println("j'attend la connexion");
      Socket s=ss.accept();
      System.out.println("Connexion d'un client "+s.getRemoteSocketAddress());

      InputStream is= s.getInputStream();
      OutputStream os=s.getOutputStream();
      System.out.println("j'attend que le client envoi un octet");
   

      int nb=is.read();
      System.out.println("j'ai récus un nombre"+nb);
      int res=nb*5;
      System.out.println("j'envoi le réponse "+res);
      os.write(res);
    	  s.close();
	}

}
