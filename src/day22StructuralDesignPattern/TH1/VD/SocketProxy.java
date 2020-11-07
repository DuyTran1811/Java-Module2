package day22StructuralDesignPattern.TH1.VD;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketProxy implements SoKetInterface {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter uot;

    public SocketProxy(String host, int port, boolean wait) {
       try {
           if (wait){
               ServerSocket server = new ServerSocket(port);
               socket = server.accept();
           }else {
               socket = new Socket(String.valueOf(host),port);
           }
           InputStream in1;
           in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           uot = new PrintWriter(socket.getOutputStream(),true);
       }catch (IOException e){
           e.printStackTrace();
       }
    }

    @Override
    public String readLine() {
        String str = null;
        try {
            str = in.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return str;
    }

    @Override
    public void writeLine(String str) {
        System.out.println(str);
    }

    @Override
    public void dispose() {
        try {
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
