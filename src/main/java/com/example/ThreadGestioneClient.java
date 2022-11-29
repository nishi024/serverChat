package com.example;

import java.net.ServerSocket;

public class ThreadGestioneClient implements Runnable 
{
    private int numeroMaxConnessioni;
    private App List; //Lista
    private Thread[] listConnection; //thread della chat connessioni 
    Thread me;
    private ServerSocket serverChat;

    public ThreadGestioneClient(int numeroMaxConnessioni, App List) 
    {
        this.numeroMaxConnessioni = numeroMaxConnessioni;
        this.List = List;
        this.listConnection = new Thread [this.numeroMaxConnessioni];
        me = new Thread(this);
        me.start();
    }

    public void run()
    {
         boolean continue= true; //instanzia la connessione per la chat 

        try{
            serverChat = new ServerSocket(6789); 
}catch(Exception e){
    
}
    }
}