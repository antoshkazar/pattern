import java.util.Objects

object Main {
    @JvmStatic
    fun main(args: Array<String>) {

        val notifications = SettingsManager.areNotificationsEnabled()

        if (!notifications) {
            SettingsManager.changeNotifications()
        }

        if (!SettingsManager.isDarkModeEnabled())
            SettingsManager.changeTheme()
    }
}