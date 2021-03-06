package org.hvdw.jexiftoolgui.facades;

public interface IPreferencesFacade {
    enum PreferenceKey {
        USE_LAST_OPENED_FOLDER("uselastopenedfolder"),
        LAST_OPENED_FOLDER("lastopenedfolder"),
        DEFAULT_START_FOLDER("defaultstartfolder"),
        ARTIST("artist"),
        COPYRIGHTS("copyrights"),
        VERSION_CHECK("versioncheck"),
        LAST_APPLICATION_VERSION("applicationVersion"),
        EXIFTOOL_PATH("exiftool");

        public final String key;
        PreferenceKey(String key) {
            this.key = key;
        }
    }

    boolean keyIsSet(PreferenceKey key);

    String getByKey(PreferenceKey key);
    String getByKey(PreferenceKey key, String defaultValue);
    boolean getByKey(PreferenceKey key, boolean defaultValue);
    void storeByKey(PreferenceKey key, String value);
    void storeByKey(PreferenceKey key, boolean value);

    IPreferencesFacade defaultInstance = PreferencesFacade.thisFacade;
}
