package principal;

import java.net.*;
import java.io.*;
import javax.swing.*;

public class Principal {

    public static void main(String args[]) {
        try {
            String ip = JOptionPane.showInputDialog("Digite o IP do server: ");
            int porta = Integer.parseInt(JOptionPane.showInputDialog("Digite a porta: "));
            Socket servidor = new Socket(ip, porta);//endereco e porta
            PrintWriter out = new PrintWriter(
                    servidor.getOutputStream(), true);
            String mensagem = "";
            while (!mensagem.equals("fim")) {
                mensagem = JOptionPane.
                        showInputDialog("Digite a Mensagem ou fim para sair");
                out.println(mensagem); //escreve a mensagem
            }
        } catch (IOException io) {
            System.err.println("Problemas de IO");
        }
    }
}
