package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroductionToJS3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_to_js3);
        final TextView txtOp = findViewById(R.id.txtOp);
        IntroductionToJS2 IntroductionToJS2 = new IntroductionToJS2();
        MainMenu mainMenu = new MainMenu();
        final Button b_out_ITJS3 = findViewById(R.id.b_out_ITJS3);
        final Button b_next_ITJS3 = findViewById(R.id.b_next_ITJS3);
        txtOp.setText("Операторы:\n" +
                "\n" +
                "Присваивание: =\n" +
                "\n" +
                "Математические: *, /, +, -, %, **, ++, --\n" +
                "\n" +
                "Сравнения: >, <, >=, <=, ==, !=, ===, !==\n" +
                "\n" +
                "Логические: !, ||, &&\n" +
                "\n" +
                "Тернарный: ?\n" +
                "\n" +
                "Побитовые: |, &, ~, ^, <<, >>, >>>\n" +
                "Неявное приведение типа\n" +
                "\n" +
                "Операторы неявно приводят переменные к тому типу, с которым работают.\n" +
                "Математические операторы приводят к типу number, кроме оператора +.\n" +
                "Логические операторы и операторы сравнения приводят к типу boolean.\n" +
                "\"6\" / \"2\" // 3\n" +
                "3 + \"2\" // 5\n" +
                "Особенности оператора +\n" +
                "\n" +
                "Оператор \"+\" работает ещё и со строками, поэтому если первый операнд строка, то второй будет преобразован в строку:\n" +
                "'2' + 1\n" +
                "// '21'\n" +
                "\n" +
                "'2' - 1\n" +
                "// 1\n");
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b_out_ITJS3:
                        Intent intent = new Intent(IntroductionToJS3.this, IntroductionToJS2.class);
                        startActivity(intent);
                        break;
                    case R.id.b_next_ITJS3:
                        Intent intent2 = new Intent(IntroductionToJS3.this, MainMenu.class);
                        startActivity(intent2);
                        break;

                }
            }


        };
        b_out_ITJS3.setOnClickListener(onClickListener);
        b_next_ITJS3.setOnClickListener(onClickListener);
    }
}