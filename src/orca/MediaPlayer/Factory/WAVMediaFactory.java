package orca.MediaPlayer.Factory;

import orca.MediaPlayer.Audio.WAV;
import orca.MediaPlayer.IMedia;

public class WAVMediaFactory implements IMeidaFoctory {
    @Override
    public IMedia CreateMedia() {
        return new WAV();
    }
}
