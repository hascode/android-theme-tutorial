package com.hascode.android;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyItemActivity extends ListActivity {
	private static final String[] ITEMS = { "First item", "Second item",
			"Third item", "Fourth item", "Fifth item", "Sixth item" };

	/** Called when the activity is first created. */
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ListView listView = getListView();
		listView.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, ITEMS));
	}
}