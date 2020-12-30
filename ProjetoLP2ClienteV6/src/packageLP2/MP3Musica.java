package packageLP2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MP3Musica extends Thread {
 
private File mp3;
private Player player;
private final int x = 0;
 
public void tocar(File mp3) {
        this.mp3 = mp3;
}
 
@Override
public void run() {
    try {
            
                     while(true){
                          FileInputStream fis = new FileInputStream(mp3);
                          BufferedInputStream bis = new BufferedInputStream(fis);   

                           this.player = new Player(bis);
                           System.out.println("Tocando Musica!");
 
                           this.player.play();
                           System.out.println("Terminado Musica!");
                      }
    } catch (FileNotFoundException | JavaLayerException e) {
              System.out.println("Problema ao tocar Musica" + mp3);
     }
  }
}
