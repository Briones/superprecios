package pruebas.tabs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ListaArticulosActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	TextView textview = new TextView(this);
	textview.setText("Listando los articulos");
	setContentView(textview);
	}
}
