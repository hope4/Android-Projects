package com.example.naveen.block02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listViewanimals = (ListView) findViewById(R.id.listView);
        final ArrayAdapter<CharSequence> adapterAnimals = ArrayAdapter.createFromResource(this,R.array.animalArray,
                android.R.layout.simple_list_item_1);
        listViewanimals.setAdapter(adapterAnimals);

        listViewanimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String message = getString(R.string.Toastmessage)+" "+adapterAnimals.getItem(i);
                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();

            }
        });

    }
}
