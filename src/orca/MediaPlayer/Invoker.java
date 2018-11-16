package orca.MediaPlayer;

import orca.MediaPlayer.Factory.IMeidaFoctory;
import orca.MediaPlayer.Factory.MP3MediaFactory;
import orca.MediaPlayer.Factory.WAVMediaFactory;

public class Invoker {
    public void BtnPlay_Click(Object sender,String s)
    {
        IMeidaFoctory foctory = null;
        switch (s){
            case "mp3":
                foctory = new MP3MediaFactory();
                break;
            case  "wav":
                foctory = new WAVMediaFactory();
//            其他類型略過
        }

        IMedia media = foctory.CreateMedia();
        media.Play();

    }
}
