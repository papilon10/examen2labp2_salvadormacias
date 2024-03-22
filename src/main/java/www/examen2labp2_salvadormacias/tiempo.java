/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.examen2labp2_salvadormacias;

import javax.swing.JLabel;

/**
 *
 * @author Apple
 */
public class tiempo implements Runnable {

    private JLabel label;
    int segundos, minutos;
    private boolean flag = true;

    public tiempo(JLabel label) {
        this.label = label;
    }

    public boolean isFLag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        while (flag) {

            if (segundos < 60) {
                segundos++;
            } else if (segundos == 60) {
                segundos = 0;
                minutos++;
            }

            label.setText(minutos + ":" + segundos);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

        }

    }

}
