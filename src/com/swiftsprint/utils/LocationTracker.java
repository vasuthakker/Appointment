package com.swiftsprint.utils;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/**
 * Class for location related operations
 * 
 * @author Administrator
 * 
 */
public final class LocationTracker {

	private static final String TAG = "LocationTracker";

	public static String getCurentCity(Context context) throws IOException {
		String city = null;
		LocationManager manager = (LocationManager) context
				.getSystemService(Context.LOCATION_SERVICE);

		List<String> locationsProvider = manager.getAllProviders();
		

		for (String provider : locationsProvider) {
			Log.i(TAG, "privoders" + provider);
			Location location =manager.getLastKnownLocation(provider);
			if(location!=null)
			{
				Geocoder gcd = new Geocoder(context, Locale.getDefault());
				List<Address> addresses = gcd.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
				if (addresses.size() > 0) 
				{
				    Log.i(TAG,"city -->"+addresses.get(0).getLocality());
				}
			}
		}
		return city;
	}
}
