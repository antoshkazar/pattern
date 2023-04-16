object SettingsManager {

    private var areNotificationsEnabled: Boolean = false
    private var currentTheme = Themes.LIGHT

    fun areNotificationsEnabled(): Boolean {
        return areNotificationsEnabled
    }

    fun changeTheme() {
        currentTheme = when(currentTheme){
            Themes.DARK -> Themes.LIGHT
            Themes.LIGHT -> Themes.DARK
        }
    }

    fun isDarkModeEnabled() : Boolean {
        return currentTheme == Themes.DARK
    }

    fun changeNotifications() {
        areNotificationsEnabled = !areNotificationsEnabled
    }
}

enum class Themes {
    DARK, LIGHT
}
