package orca.MediaPlayer.Factory;

import orca.MediaPlayer.IMedia;
import orca.MediaPlayer.Video.RM;

public class RMMediaFactory implements IMeidaFoctory {
    @Override
    public IMedia CreateMedia() {
        return new RM();
    }
}
