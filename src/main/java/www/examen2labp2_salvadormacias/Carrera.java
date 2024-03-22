/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.examen2labp2_salvadormacias;

import javax.swing.JProgressBar;

/**
 *
 * @author Apple
 */
public class Carrera implements Runnable {

    private JProgressBar bar;
    private carro x;
    private boolean flag = true;

    public Carrera(JProgressBar bar, carro x) {
        this.bar = bar;
        this.x = x;
    }

    public JProgressBar getJpb() {
        return bar;
    }

    public void setJpb(JProgressBar bar) {
        this.bar = bar;
    }

    public carro getX() {
        return x;
    }

    public void setC(carro x) {
        this.x = x;
    }

    public boolean isVive() {
        return flag;
    }

    public void setVive(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {

        while (flag) {

            if (bar.getValue() < bar.getMaximum()) {

                bar.setValue(bar.getValue() + x.getVelocidad());

            } else {

                flag = false;
            }
            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

            }

        }

    }
}
