package com.example.dynamicui;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.dynamicui.model.ContactosInformacion;

public class ContactosListaFragment extends ListFragment {
	IActulizacionContactoListener listener;

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
		super.onListItemClick(l, v, position, id);
		listener.onContactoSeleccionado(position);
	}

	public interface IActulizacionContactoListener {
		public void onContactoSeleccionado(int position);
	}
}