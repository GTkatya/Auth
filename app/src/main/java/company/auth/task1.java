package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class task1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        final TextView txtT = findViewById(R.id.txtT);
        JSBasics1 JSBasics1 = new JSBasics1();
        final Button bout3 = findViewById(R.id.bout3);
        final Button bNext2 = findViewById(R.id.bNext2);
        txtT.setText("Основы JavaScript\n" +
                "1.\tПеременная\n" +
                "a)\tАналогия из жизни и объявление переменной\n" +
                "b)\tПравила объявления переменных\n" +
                "c)\tСовременный синтаксис.  let, const и var. Их использование, различия и область видимости.\n" +
                "2.\tВывод сообщений с помощью console.log\n" +
                "3.\t....\n" +
                "a)\t......\n" +
                "b)\t\n" +
                "c)\t....\n" +
                "d)\t\n");

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bout3:
                        Intent intent = new Intent(task1.this, MainMenu.class);
                        startActivity(intent);
                        break;
                    case R.id.bNext2:
                        Intent intent2 = new Intent(task1.this, JSBasics1.class);
                        startActivity(intent2);
                        break;

                }
            }


        };
        bout3.setOnClickListener(onClickListener);
        bNext2.setOnClickListener(onClickListener);
    }
}