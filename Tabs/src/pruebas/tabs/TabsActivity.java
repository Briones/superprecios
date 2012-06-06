package pruebas.tabs;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class TabsActivity extends TabActivity  {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab
        Resources res = getResources(); // Resource object to get Drawables
        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, BuscarTiendasCercanasActivity.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("BuscarTiendasCercanasActivity").setIndicator("BuscarTiendasCercanasActivity", res.getDrawable(R.drawable.ic_tab_principal)).setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, ListaArticulosActivity.class);
        spec = tabHost.newTabSpec("ListaArticulosActivity").setIndicator("hola",
                          res.getDrawable(R.drawable.ic_tab_mantenimiento))
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, SubirArticulosActivity.class);
        spec = tabHost.newTabSpec("SubirArticulosActivity").setIndicator("SubirArticulosActivity",
                          res.getDrawable(R.drawable.ic_tab_kilometraje))
                      .setContent(intent);
        tabHost.addTab(spec);        
    }
}