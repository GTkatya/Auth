package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class StringJS1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);
        final TextView txtS = findViewById(R.id.txtS);
        final Button b_out_SJS1 = findViewById(R.id.b_out_SJS1);
        final Button b_next_SJS1 = findViewById(R.id.b_next_SJS1);
        txtS.setText("В JavaScript не существует отдельного типа «символ», который есть в ряде других языков.\n" +
                "\n" +
                "В JavaScript любые текстовые данные являются строками. \n" +
                "\n" +
                "Кавычки в JavaScript:\n" +
                "\n" +
                "Одинарные,  двойные и обратные кавычки – с помощью них, можно создать строку. \n" +
                "\n" +
                "Например: \n" +
                "let single = 'string';\n" +
                "let double = \"string\";\n" +
                "let backticks = `string`;\n" +
                "\n" +
                "одинарные и двойные кавычки, практически не имеют различий.\n" +
                "\n" +
                "Обратные кавычки могут принимать более одной строки:\n" +
                "\n" +
                "let MyPet = `Dog:\n" +
                " * cat\n" +
                " * mouse\n" +
                " * turtle\n" +
                "`;\n" +
                "MyPet; // список домашних животных\n ");
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b_out_SJS1:
                        Intent intent = new Intent(StringJS1.this, MainMenu.class);
                        startActivity(intent);
                        break;
                    case R.id.b_next_SJS1:
                        Intent intent2 = new Intent(StringJS1.this, RunJscript.class);
                        intent2.putExtra("message", 2);
                        startActivity(intent2);
                        break;

                }
            }


        };
        b_out_SJS1.setOnClickListener(onClickListener);
        b_next_SJS1.setOnClickListener(onClickListener);
    }
}