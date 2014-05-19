package com.example.dynamicui;

import com.example.dynamicui.model.Contacto;
import com.example.dynamicui.model.ContactosInformacion;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetallesContactoFragment extends Fragment {
	final static String ARG_POSITION = "position";
	int position = -1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		if (savedInstanceState != null) {
			position = savedInstanceState.getInt(ARG_POSITION);
		}

		View rootView = inflater.inflate(R.layout.fragment_details, container,
				false);
		return rootView;
	}

	@Override
	public void onStart() {
		super.onStart();
		Bundle args = getArguments();
		if (args != null) {
			ActulizarDetalles(args.getInt(ARG_POSITION));
		} else if (position != -1) {
			ActulizarDetalles(position);
		}
	}

	public void ActulizarDetalles(int position) {
		Contacto contacto = ContactosInformacion.getContactos().get(position);
		
		TextView nombreTestView = (TextView) getActivity().findViewById(R.id.nombreContacto);
		TextView telefonoTestView = (TextView) getActivity().findViewById(R.id.telefonoContacto);
		TextView direccionTestView = (TextView) getActivity().findViewById(R.id.direccionContacto);
		TextView edadTestView = (TextView) getActivity().findViewById(R.id.edadContacto);
		
		
		nombreTestView.setText("Nombre: " + contacto.getNombre());
		telefonoTestView.setText("Telefono: " + contacto.getTelefono());
		direccionTestView.setText("Direccion: " + contacto.getDirreccion());
		edadTestView.setText("Edad: " + contacto.getEdad());
	}

}
