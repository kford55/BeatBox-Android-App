package kennethford.beatbox;

public class Sound {

    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound (String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public void setAssetPath(String mAssetPath) {
        this.mAssetPath = mAssetPath;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        this.mSoundId = soundId;
    }
}
