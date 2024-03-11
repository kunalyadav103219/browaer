package fulguris

import android.content.Context
import android.content.SharedPreferences

class ConfigManager(context: Context) {
    private val PREFS_NAME = "MyPrefs"
    private val PREF_AD_VERSION = "ad_version"
    private val PREF_FIRST_TIME = "first_time"

    private val sharedPreferences: SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    var adVersion: String?
        get() = sharedPreferences.getString(PREF_AD_VERSION, null)
        set(value) {
            sharedPreferences.edit().putString(PREF_AD_VERSION, value).apply()
        }

    var isFirstTime: Boolean
        get() = sharedPreferences.getBoolean(PREF_FIRST_TIME, true)
        set(value) {
            sharedPreferences.edit().putBoolean(PREF_FIRST_TIME, value).apply()
        }

}
