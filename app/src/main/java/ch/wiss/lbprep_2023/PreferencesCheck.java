/*
Diese Datei soll nicht bearbeitet werden.
Damit können Sie in der Aufgabe 4 kontrollieren, ob Ihr Programm richtig funktioniert.
*/


package ch.wiss.lbprep_2023;

import android.content.Context;
import android.util.Log;
import java.util.Map;
import java.util.Set;

public class PreferencesCheck {

    @SuppressWarnings("unchecked")
    public static void loadPreferences(Context context) {
        Map<String, ?> prefs = context.getSharedPreferences("jobprofil",0).getAll();
        String printVal="";
        for (String key : prefs.keySet()) {
            Object pref = prefs.get(key);

            if (pref instanceof Boolean) {
                printVal =  key + " : " + (Boolean) pref;
            }
            if (pref instanceof Float) {
                printVal =  key + " : " + (Float) pref;
            }
            if (pref instanceof Integer) {
                printVal =  key + " : " + (Integer) pref;
            }
            if (pref instanceof Long) {
                printVal =  key + " : " + (Long) pref;
            }
            if (pref instanceof String) {
                printVal =  key + " : " + (String) pref;
            }
            if (pref instanceof Set<?>) {
                printVal =  key + " : " + (Set<String>) pref;
            }
            Log.d("PREFERENCES", printVal);
        }
    }
}
