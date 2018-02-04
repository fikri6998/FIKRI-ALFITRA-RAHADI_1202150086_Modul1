package fikri6998.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String menu =
                intent.getStringExtra("menu");
        String porsi =
                intent.getStringExtra("porsi");
        String harga =
                intent.getStringExtra("harga");


        TextView menu1 = (TextView) findViewById(R.id.textViewmenu_reply);
        menu1.setText(menu.toString());

        TextView porsi1 = (TextView) findViewById(R.id.textViewporsi_reply);
        porsi1.setText(porsi.toString());

        TextView harga1 = (TextView) findViewById(R.id.textViewharga_reply);
        harga1.setText(harga.toString());


    }
}
