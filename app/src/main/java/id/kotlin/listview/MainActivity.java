package id.kotlin.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] namamakanan = new String[]{
            "Bakso", "Burger", "Bubur", "Cendol",
            "Ketupat", "Lontong Sayur", "Pizza"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Daftar Makanan!");

        lvItem = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namamakanan);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Ayo makan "+namamakanan[position]+"!", Toast.LENGTH_LONG).show();

            }
        });
    }
}