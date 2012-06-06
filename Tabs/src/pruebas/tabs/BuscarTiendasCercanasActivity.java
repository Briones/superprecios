package pruebas.tabs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BuscarTiendasCercanasActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	TextView textview = new TextView(this);
	textview.setText("Buscando tiendas cercanas");
	setContentView(textview);
	}

}
