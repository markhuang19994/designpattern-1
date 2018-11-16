package orca.MediaPlayer.Factory;

import orca.MediaPlayer.IMedia;
import orca.MediaPlayer.Video.MPEG;

public class MPEGMediaFactory implements IMeidaFoctory {
    @Override
    public IMedia CreateMedia() {
        return new MPEG();
    }
}
