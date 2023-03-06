import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class HiloCancion extends Thread {
    public void run(){

        System.out.println("Ejecutando cancion...");
        File songFile= new File("./Cancion/feid.wav");
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(songFile));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.close();
        } catch (LineUnavailableException | IOException | UnsupportedAudioFileException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
