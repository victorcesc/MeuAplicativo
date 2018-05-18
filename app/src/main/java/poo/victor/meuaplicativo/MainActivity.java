package poo.victor.meuaplicativo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void olaNome(View view){
        EditText caixa = (EditText) findViewById(R.id.editNome);
        String mensagem = caixa.getText().toString();

        TextView ola = (TextView) findViewById(R.id.textViewOla);
        ola.setText(mensagem);

        //clica no botao e ele vai p/ outra activity usando intent

        Intent intent = new Intent(this,SegundaActivity.class);
        EditText editText = (EditText) findViewById(R.id.editNome);
        String message = editText.getText().toString();
        intent.putExtra("mensagem",message);
        startActivity(intent);

    }
}
