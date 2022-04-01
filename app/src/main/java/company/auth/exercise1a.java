package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class exercise1a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1a);
        exercise1 exe1 = new exercise1();
        final TextView txtE = findViewById(R.id.txtE);

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

    }
}