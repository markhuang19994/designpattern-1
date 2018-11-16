package orca.MediaPlayer.Factory;

import orca.MediaPlayer.Audio.MP3;
import orca.MediaPlayer.IMedia;

public class MP3MediaFactory implements IMeidaFoctory {
    @Override
    public IMedia CreateMedia() {
        return new MP3();
    }
}
