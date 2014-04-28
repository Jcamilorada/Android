package com.example.listview;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ContactosArrayAdapter extends ArrayAdapter<Contacto> {
	private final List<Contacto> contactos;
	private final Context context;

	public ContactosArrayAdapter(Context context, int resource,
			List<Contacto> objects) {
		super(context, resource, objects);
		this.contactos = objects;
		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Contacto contacto = contactos.get(position);
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.list_view, parent, false);
		TextView nombreTextView = (TextView) rowView.findViewById(R.id.nombre_contacto);
		TextView telefonoTextView = (TextView) rowView.findViewById(R.id.telefono_contacto);
		nombreTextView.setText(contacto.getName());
		telefonoTextView.setText(contacto.getTelefono());
		return rowView;
	}
}
