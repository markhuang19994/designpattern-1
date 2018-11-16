package orca.ImageLoader;

public class ImageLoaderConfig {

    BitmapCache bitmapCache = new MemoryCache();
    DisplayConfig displayConfig = new DisplayConfig();
    LoadPolicy loadPolicy = new SerialPolicy();

    int threadCount = Runtime.getRuntime().availableProcessors() + 1 ;

    private ImageLoaderConfig(){

    }

    public static class Builder{

        BitmapCache bitmapCache = new MemoryCache();
        DisplayConfig displayConfig = new DisplayConfig();
        LoadPolicy loadPolicy = new SerialPolicy();

        int threadCount = Runtime.getRuntime().availableProcessors() + 1 ;

        public Builder setThreadCount(int count){
            this.threadCount = count;
            return this;
        }

        public Builder setCache(BitmapCache bitmapCache) {
            this.bitmapCache = bitmapCache;
            return this;
        }

        public Builder setDisplayConfig(DisplayConfig displayConfig) {
            this.displayConfig = displayConfig;
            return this;
        }

        public Builder setLoadPolicy(LoadPolicy loadPolicy) {
            this.loadPolicy = loadPolicy;
            return this;
        }
    }
}
