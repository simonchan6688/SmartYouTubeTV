package com.liskovsoft.smartyoutubetv.common.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class SmartPreferences {
    private static final String VIDEO_FORMAT_NAME = "videoFormatName"; // e.g. '360p' or '720p'
    private static final String BOOTSTRAP_ACTIVITY_NAME = "bootstrapActivityName";
    private static final String BOOTSTRAP_CHECKBOX_CHECKED = "bootstrapCheckBoxChecked";
    private static final String BOOTSTRAP_AUTOFRAMERATE_CHECKED = "display_rate_switch";
    private static final String BOOTSTRAP_SELECTED_LANGUAGE = "bootstrapSelectedLanguage";
    private static final String BOOTSTRAP_UPDATE_CHECKED = "bootstrapUpdateChecked";
    private static final String BOOTSTRAP_UPDATE_BETA_CHECKED = "bootstrapUpdateBetaChecked";
    private static final String BOOTSTRAP_OLD_UI_CHECKED = "bootstrapOldUIChecked";
    private static final String COOKIE_MANAGER_COOKIE = "cookieManagerCookie";
    private static final String BOOTSTRAP_END_CARDS = "bootstrapEndCards";
    private static final String PREFERRED_CODEC = "preferredCodec";
    private static final String BOOTSTRAP_OK_PAUSE = "bootstrapOKPause";
    private static final String BOOTSTRAP_LOG_TO_FILE = "logToFile";
    private static final String UNPLAYABLE_VIDEO_FIX = "unplayableVideoFix";
    private static final String LOCK_LAST_LAUNCHER = "lockLastLauncher";
    private static final String OPEN_MUSIC = "openMusic";
    private static SmartPreferences sInstance;
    private Context mContext;
    private SharedPreferences mPrefs;

    public static SmartPreferences instance(Context ctx) {
        if (sInstance == null)
            sInstance = new SmartPreferences(ctx);
        return sInstance;
    }

    private SmartPreferences(Context context) {
        mContext = context.getApplicationContext();
        mPrefs = PreferenceManager.getDefaultSharedPreferences(mContext);
    }

    public void setSelectedFormat(String fmt) {
        mPrefs.edit()
                .putString(VIDEO_FORMAT_NAME, fmt)
                .apply();
    }

    public String getSelectedFormat() {
        String name = mPrefs.getString(VIDEO_FORMAT_NAME, "Auto");
        return name;
    }

    public void setBootstrapActivityName(String name) {
        mPrefs.edit()
                .putString(BOOTSTRAP_ACTIVITY_NAME, name)
                .apply();
    }

    public String getBootstrapActivityName() {
        String name = mPrefs.getString(BOOTSTRAP_ACTIVITY_NAME, null);
        return name;
    }

    public void resetBootstrapActivityName() {
        mPrefs.edit().remove(BOOTSTRAP_ACTIVITY_NAME).apply();
    }

    public boolean getBootstrapSaveSelection() {
        boolean isChecked = mPrefs.getBoolean(BOOTSTRAP_CHECKBOX_CHECKED, true);
        return isChecked;
    }

    public void setBootstrapSaveSelection(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(BOOTSTRAP_CHECKBOX_CHECKED, isChecked)
                .apply();
    }

    public boolean getBootstrapAutoframerate() {
        boolean isChecked = mPrefs.getBoolean(BOOTSTRAP_AUTOFRAMERATE_CHECKED, false);
        return isChecked;
    }

    public void setBootstrapAutoframerate(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(BOOTSTRAP_AUTOFRAMERATE_CHECKED, isChecked)
                .apply();
    }

    public void setPreferredLanguage(String name) {
        mPrefs.edit()
                .putString(BOOTSTRAP_SELECTED_LANGUAGE, name)
                .apply();
    }

    public String getPreferredLanguage() {
        String name = mPrefs.getString(BOOTSTRAP_SELECTED_LANGUAGE, "");
        return name;
    }

    public void setPreferredCodec(String name) {
        mPrefs.edit()
                .putString(PREFERRED_CODEC, name)
                .apply();
    }

    public String getPreferredCodec() {
        String name = mPrefs.getString(PREFERRED_CODEC, "");
        return name;
    }

    public boolean getBootstrapUpdateCheck() {
        boolean isChecked = mPrefs.getBoolean(BOOTSTRAP_UPDATE_CHECKED, true);
        return isChecked;
    }

    public void setBootstrapUpdateCheck(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(BOOTSTRAP_UPDATE_CHECKED, isChecked)
                .apply();
    }

    public boolean getBootstrapBetaUpdateCheck() {
        boolean isChecked = mPrefs.getBoolean(BOOTSTRAP_UPDATE_BETA_CHECKED, false);
        return isChecked;
    }

    public void setBootstrapBetaUpdateCheck(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(BOOTSTRAP_UPDATE_BETA_CHECKED, isChecked)
                .apply();
    }

    public boolean getBootstrapOldUI() {
        boolean isChecked = mPrefs.getBoolean(BOOTSTRAP_OLD_UI_CHECKED, false);
        return isChecked;
    }

    public void setBootstrapOldUI(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(BOOTSTRAP_OLD_UI_CHECKED, isChecked)
                .apply();
    }

    public void setCookie(String cookie) {
        mPrefs.edit()
                .putString(COOKIE_MANAGER_COOKIE, cookie)
                .apply();
    }

    public String getCookie() {
        String cookie = mPrefs.getString(COOKIE_MANAGER_COOKIE, "");
        return cookie;
    }

    public void setEnableEndCards(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(BOOTSTRAP_END_CARDS, isChecked)
                .apply();
    }

    public boolean getEnableEndCards() {
        return mPrefs.getBoolean(BOOTSTRAP_END_CARDS, true);
    }

    public void setEnableOKPause(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(BOOTSTRAP_OK_PAUSE, isChecked)
                .apply();
    }

    public boolean getEnableOKPause() {
        return mPrefs.getBoolean(BOOTSTRAP_OK_PAUSE, true);
    }

    public void setEnableLogToFile(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(BOOTSTRAP_LOG_TO_FILE, isChecked)
                .apply();
    }

    public boolean getEnableLogToFile() {
        return mPrefs.getBoolean(BOOTSTRAP_LOG_TO_FILE, false);
    }

    public void setUnplayableVideoFix(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(UNPLAYABLE_VIDEO_FIX, isChecked)
                .apply();
    }

    public boolean getUnplayableVideoFix() {
        return mPrefs.getBoolean(UNPLAYABLE_VIDEO_FIX, false);
    }

    public void setLockLastLauncher(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(LOCK_LAST_LAUNCHER, isChecked)
                .apply();
    }

    public boolean getLockLastLauncher() {
        return mPrefs.getBoolean(LOCK_LAST_LAUNCHER, false);
    }

    public void setOpenMusic(boolean isChecked) {
        mPrefs.edit()
                .putBoolean(OPEN_MUSIC, isChecked)
                .apply();
    }

    public boolean getOpenMusic() {
        return mPrefs.getBoolean(OPEN_MUSIC, false);
    }
}
