package examen2_gabrielvasquez;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class Hilo_Video extends Thread {

    private JProgressBar bar;
    private JTextArea AREA;
    private Video video;
    private boolean avanzar;

    public Hilo_Video(JProgressBar bar, JTextArea AREA, Video video) {
        this.bar = bar;
        this.AREA = AREA;
        this.video = video;
        avanzar = true;
    }

    public JProgressBar getBar() {
        return bar;
    }

    public void setBar(JProgressBar bar) {
        this.bar = bar;
    }

    public JTextArea getAREA() {
        return AREA;
    }

    public void setAREA(JTextArea AREA) {
        this.AREA = AREA;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    @Override
    public void run() {
        while (avanzar) {
            bar.setMaximum(video.getRept());
            if (bar.getValue() < bar.getMaximum()) {
                if (bar.getValue() % 10 == 0 && bar.getValue() / 10 < video.getSubtitulos().size()) {
                    int sub = bar.getValue() / 10;
                    AREA.setText(video.getSubtitulos().get(sub));
                    System.out.println(video.getSubtitulos().get(sub));
                }
                bar.setValue(bar.getValue() + 1);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            } else {
                avanzar = false;
                bar.setValue(0);
                AREA.setText("");
            }
        }
    }

}
