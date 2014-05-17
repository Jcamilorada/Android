package com.example.listview;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ContactosFragment extends ListFragment {

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Contacto contacto = ContactosInformacion.getContactos().get(position);
		Toast toast = Toast.makeText(v.getContext(), contacto.getName(), Toast.LENGTH_LONG);
		toast.show();
	}

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
	
	

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Contacto contacto = ContactosInformacion.getContactos().get(position);
		Toast toast = Toast.makeText(v.getContext(), contacto.getName(),
				Toast.LENGTH_LONG);
		toast.show();
	}

}
