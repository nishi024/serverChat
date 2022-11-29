package com.example;
import java.net.*;
import java.io.*;
public class Thread implements Runnable
{
private Thread gestoreChat;
private Socket client = null;
private BufferedReader input = null;
private PrintWriter output = null;
Thread thread;
Thread me;
public Thread(ThreadGestioneClient ThreadGestioneClient,Socket client)
{
    this.gestoreChat = thread;
    this.client=client;
    try
    {
        this.input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        this.output = new PrintWriter(this.client.getOutputStream());    
    }catch(Exception e){
        output.println("Errore lettura");
    }
    me = new Thread(this, client);
    me.start();
}
public void run()
 {
    while(true){
        try
        {
            String mex = null; //attesa dei messaggi mandati dal client 
            while((mex = input.readLine())==null)
            {}

            
            gestoreChat.spedisciMessaggio(mex);
        }catch(Exception e)
        {
            output.println("Errore spedizione messaggio");
        }
    }
}
private void spedisciMessaggio(String Messaggio) {
}

}
 

