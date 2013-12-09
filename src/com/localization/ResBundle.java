package com.localization;

import java.util.ListResourceBundle;

public class ResBundle extends ListResourceBundle {

	static final Object[][] contents = {
		{ "MovieName", "Avatar" },
		{ "GrossRevenue", (Long) 2782275172L }, // in US dollars
		{ "Year", (Integer)2009 }
	};
	@Override
	protected Object[][] getContents() {
		return ResBundle.contents;
	}

}
