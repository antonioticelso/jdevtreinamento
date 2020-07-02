package thread;

import javax.swing.*;

public class ThreadLocal {

    public static void main(String[] args) throws InterruptedException {

//        Envio de email
        Thread threadEmail = new Thread(thread01);
        threadEmail.start();

//        Envio de nota fiscal
        Thread threadNotaFiscal = new Thread(thread02);
        threadNotaFiscal.start();

        System.out.println("Fim do processamento paralelo de teste!");
        JOptionPane.showMessageDialog(null, "Sistema continua em processamento!");
    }

    private static Runnable thread01 = new Runnable() {
        @Override
        public void run() {
            for (int pos = 0; pos < 10; pos ++) {
                System.out.println("Executando alguma rotina, por mineração de dados e envio de email.");
//        Tempo de compilação para resposta do código
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    private static Runnable thread02 = new Runnable() {
        @Override
        public void run() {
            for (int pos = 0; pos < 10; pos ++) {
                System.out.println("Executando alguma rotina, por envio de nota fiscal.");
//        Tempo de compilação para resposta do código
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

}


