package com.example.dynamicui;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.dynamicui.ContactosListaFragment.IActulizacionContactoListener;

public class MainActivity extends Activity implements
		IActulizacionContactoListener {

	private static final String CONTACTOS_DETALLES_TAG = "ContactoDetalesTAG";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {

			FragmentManager manager = getFragmentManager();
			FragmentTransaction transaction = manager.beginTransaction();

			ContactosListaFragment cFragment = new ContactosListaFragment();
			cFragment.listener = this;

			if (findViewById(R.id.fragment2Container) != null) {
				transaction.add(R.id.fragment1Container, cFragment);
				transaction.add(R.id.fragment2Container,
						new DetallesContactoFragment(), CONTACTOS_DETALLES_TAG);
			}

			else {
				transaction.add(R.id.fragment1Container, cFragment);
			}

			transaction.commit();
		}
	}

	@Override
	public void onContactoSeleccionado(int position) {
		DetallesContactoFragment dFragment = (DetallesContactoFragment) getFragmentManager()
				.findFragmentByTag(CONTACTOS_DETALLES_TAG);

		// Estamos en una pantalla con multples vistas
		if (dFragment != null) {
			dFragment.ActulizarDetalles(position);
		}

		else {
			FragmentManager manager = getFragmentManager();
			FragmentTransaction transaction = manager.beginTransaction();

			Bundle args = new Bundle();
			args.putInt(DetallesContactoFragment.ARG_POSITION, position);

			DetallesContactoFragment fragment = new DetallesContactoFragment();
			fragment.setArguments(args);

			transaction.replace(R.id.fragment1Container, fragment);
			transaction.addToBackStack(null);
			transaction.commit();
		}

	}
}
