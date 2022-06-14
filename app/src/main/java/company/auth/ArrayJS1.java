package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArrayJS1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise4);
        final TextView txtA = findViewById(R.id.txtA);
        final Button b_out_Ar = findViewById(R.id.b_out_Ar);
        final Button b_next_Ar = findViewById(R.id.b_next_Ar);
        txtA.setText("Существует два варианта синтаксиса для создания пустого массива:\n" +
                "\n" +
                "let arr = new Array();\n" +
                "\n" +
                "let arr = [];\n" +
                "Практически всегда используется второй вариант синтаксиса. В скобках мы можем указать начальные значения элементов:\n" +
                "let myPet = [\"cat \", \" dog \", \" mouse \"];\n" +
                "\n" +
                "Элементы массива имеют свой порядковый номер. Элементы массива нумеруются с нуля.\n" +
                "Чтобы получить нужный элемент, нам нужно его вызвать:\n" +
                "Let myPet = [“cat”, “dog”, “mouse”];\n" +
                "myPet[0]; //в консоли “cat” . Аналогично MyPet[1]; - “dog”\n" +
                "Можно заменить элемент массива, вызвав его по номеру и присвоив ему новое значение:\n" +
                "myPet[0] = “turtle”; // теперь массив такой [“turtle”, “dog”, “mouse”];\n" +
                "\n ");
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b_out_Ar:
                        Intent intent = new Intent(ArrayJS1.this, MainMenu.class);
                        startActivity(intent);
                        break;
                    case R.id.b_next_Ar:
                        Intent intent2 = new Intent(ArrayJS1.this, RunJscript.class);
                        intent2.putExtra("message", 3);
                        startActivity(intent2);
                        break;
                }
            }


        };
        b_out_Ar.setOnClickListener(onClickListener);
        b_next_Ar.setOnClickListener(onClickListener);
    }
}