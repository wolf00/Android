package com.globant.client;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

public final class Constants {

    private Constants() {
    }

    /**    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

     public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

     public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 100; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    public static final HashMap<String, LatLng> PUNE_AREA_LANDMARKS = new HashMap<String, LatLng>();
    static {
        // Clarice Technologies
        PUNE_AREA_LANDMARKS.put("CLARICE", new LatLng(18.556691, 73.793268));

        // Wondercity Katraj
        PUNE_AREA_LANDMARKS.put("WONDERCITY", new LatLng(18.451234, 73.854965));

        //Home
        PUNE_AREA_LANDMARKS.put("HOME", new LatLng(18.460772, 73.853756));
    }
}
