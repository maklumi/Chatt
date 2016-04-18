package com.chatt.demo;

import android.app.Application;

import com.parse.Parse;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class ChattApp extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();

		//Parse.initialize(this, "pniaBsaE0W778vvjBkpNrM9Bxo699ZKtQ69uDLZp",
		//		"QblAfLTSFs3oDCzcpcwHo2ThrZoVIExDs0eE3iWr");
		Parse.initialize(new Parse.Configuration.Builder(this)
		.applicationId("pniaBsaE0W778vvjBkpNrM9Bxo699ZKtQ69uDLZp")
		.clientKey("QblAfLTSFs3oDCzcpcwHo2ThrZoVIExDs0eE3iWr")
		.server("https://parseapi.back4app.com/")
		.build());

	}
}
