package com.example.listview;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;

public class ContactosFragment extends ListFragment {

	public ContactosFragment() {
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		ContactosArrayAdapter adapter = new ContactosArrayAdapter(
				getActivity(), R.layout.list_view,
				ContactosInformacion.getContactos());
		setListAdapter(adapter);
	}

}
