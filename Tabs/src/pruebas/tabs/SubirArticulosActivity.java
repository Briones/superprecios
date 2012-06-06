package pruebas.tabs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SubirArticulosActivity extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	TextView textview = new TextView(this);
	textview.setText("Subiendo los articulos");
	setContentView(textview);
	}

}
