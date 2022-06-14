package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class JSBasics2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1a);
        JSBasics1 exe1 = new JSBasics1();
        final TextView txtE = findViewById(R.id.txtE);
        final Button b_out_JSB2 = findViewById(R.id.b_out_JSB2);
        final Button b_next_JSB2 = findViewById(R.id.b_next_JSB2);
        txtE.setText("Давайте попробуем с вами создать свой ящик и поместить туда свои данные\n" +
                "Для этого мы используем ключевое слово Let\n" +
                "\n" +
                "Let MyPet; //инструкция которая определяет переменную с именем «Mypet»\n" +
                "\n" +
                "Поместим в наш ящик «MyPet» нашего питомца, у меня это будет собака. " +
                "Используем для этого оператор присваивания =:\n" +
                "Let MyPet;\n" +
                "MyPet = ‘Dog’; //эта строка сохранена в области памяти, связанной с переменной.  \n  ");
        ImageView imageView = findViewById(R.id.imgRes);
        imageView.setImageResource(R.drawable.nextbox);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b_out_JSB2:
                        Intent intent = new Intent(JSBasics2.this, JSBasics1.class);
                        startActivity(intent);
                        break;
                    case R.id.b_next_JSB2:
                        Intent intent2 = new Intent(JSBasics2.this, JSBasics3.class);
                        startActivity(intent2);
                        break;

                }
            }


        };
        b_out_JSB2.setOnClickListener(onClickListener);
        b_next_JSB2.setOnClickListener(onClickListener);
    }
}
