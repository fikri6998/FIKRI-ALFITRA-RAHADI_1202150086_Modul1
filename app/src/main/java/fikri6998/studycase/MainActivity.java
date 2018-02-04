package fikri6998.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "fikri6998.studycase.extra.MESSAGE";

    private EditText mMenu;
    private EditText mPorsi;
    private int money = 65500;
    private int hargaMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenu=(EditText) findViewById(R.id.editTextmenu);
        mPorsi=(EditText) findViewById(R.id.editTextporsi);

    }


    public void launchEatbusActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String menu = mMenu.getText().toString();
        String porsi = mPorsi.getText().toString();
        int harga = Integer.parseInt(porsi.trim());

        hargaMenu = harga * 50000;

        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", String.valueOf(hargaMenu));

        startActivity(intent);

        if (hargaMenu > money){
            Toast.makeText(this,"Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_LONG).show();
        }
    }

    public void launchAbnormalActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String menu = mMenu.getText().toString();
        String porsi = mPorsi.getText().toString();
        int harga = Integer.parseInt(porsi.trim());

        hargaMenu = harga * 30000;

        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", String.valueOf(hargaMenu));


        startActivity(intent);

        if (hargaMenu < money){
            Toast.makeText(this,"Disini aja Makan Malamnya",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        if (mMenu.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text", mMenu.getText().toString());
        }
    }

   }
