package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class JSBasics3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsbasics3);
        JSBasics2 JSBasics2 = new JSBasics2();
        final TextView txtJSB3 = findViewById(R.id.txtJSB3);
        final Button b_out_JSB3 = findViewById(R.id.b_out_JSB3);
        final Button b_next_JSB3 = findViewById(R.id.b_next_JSB3);
        txtJSB3.setText("Попробуйте объявить свою переменную и вывести ее на экран\n" +
                "\n" +
                "Пример объявления числовой переменной:\n" +
                "Let a = 8; //здесь мы объявляем переменную\n" +
                "a;  //здесь мы вызываем переменную\n" +
                "\n" +
                "консоль должна вывести значение переменной, т.е число 8 в данном примере.\n" +
                "\n" +
                "Пример объявления переменной, хранящей строку:\n" +
                "Let b = “string”; // в переменную помещаем строку «string»\n" +
                "b; \n" +
                "\n" +
                "консоль выведет строку “string”\n" +
                "\n" +
                "Обязательно в строковой переменной нужны кавычки, так как без них попросту не будет объявлена переменная)\n");
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b_out_JSB3:
                        Intent intent = new Intent(JSBasics3.this, JSBasics2.class);
                        startActivity(intent);
                        break;
                    case R.id.b_next_JSB3:
                        Intent intent2 = new Intent(JSBasics3.this, RunJscript.class);
                        intent2.putExtra("message", 1);
                        startActivity(intent2);
                        break;

                }
            }


        };
        b_out_JSB3.setOnClickListener(onClickListener);
        b_next_JSB3.setOnClickListener(onClickListener);
    }
}