package day22StructuralDesignPattern.TH1.VD;

import java.util.Scanner;

public class ProxyDemo {
    public static void main(String[] args) {
        SoKetInterface soKet = new SocketProxy("127.0.0.1",8080, args[0].equals("first"));
        String str;
        boolean skip = true;
        while (true){
            if (args[0].equals("second")&& skip){
                skip = false;
            }else {
                str = soKet.readLine();
                System.out.println("Receive - "+str);
                if (str.equals(null)){
                    break;
                }
            }
            System.out.println("Send---");
            str = new Scanner(System.in).nextLine();
            soKet.writeLine(str);
            if (str.equals("quit")){
                break;
            }
        }
        soKet.dispose();
    }
}
