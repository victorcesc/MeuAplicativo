package poo.victor.meuaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TerceiraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        Intent intent = getIntent();
        String message = intent.getStringExtra("mensagem");

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(message);
    }
}
