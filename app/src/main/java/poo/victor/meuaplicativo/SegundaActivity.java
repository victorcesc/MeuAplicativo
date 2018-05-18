package poo.victor.meuaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String message = intent.getStringExtra("mensagem");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }

    public void olaNome(View view){

        Intent intent = new Intent(this,TerceiraActivity.class);
        EditText editText = (EditText) findViewById(R.id.editNomeSegunda);
        String message = editText.getText().toString();
        intent.putExtra("mensagem",message);
        startActivity(intent);
    }
}
