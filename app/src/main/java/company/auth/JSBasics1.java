package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class JSBasics1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
        final TextView txtEx = findViewById(R.id.txtEx);
       /* MainMenu taskA = new MainMenu();*/
        exercise1a exercise1a= new exercise1a();
        task1 task1 = new task1();
        final Button out2 = findViewById(R.id.out2);
        final Button bNext = findViewById(R.id.bNext);
        txtEx.setText("Данные - это информация которая хранит в себе некоторые сведения и факты," +
                " которую мы можем хранить, передавать и обрабатывать.\nДанными могут являться цифры, " +
                "любой текст, даты и так далее\n" +
                "\n" +
                "И чтобы наша программа работала эти данные нужно где-то хранить. " +
                "Как раз таким хранилищем является переменная. Это хранилище памяти, к" +
                "оторое имеет название и  хранит в себе данные. \nДавайте представим нашу переменную как ящик," +
                " в который мы кладем данные. " +
                "Мы наклеем наклейку на этот ящик и теперь эта область памяти будет называться так, " +
                "как мы написали на наклейке. \n" +
                "\n" +
                "Если нам в программе нужны будут данные, которые хранятся в ящике, " +
                "то мы найдем этот ящик по названию и получим доступ к нашей информации.\n ");
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.box2);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.out2:
                        Intent intent = new Intent(JSBasics1.this, task1.class);
                        startActivity(intent);
                        break;
                    case R.id.bNext:
                        Intent intent2 = new Intent(JSBasics1.this, exercise1a.class);
                        startActivity(intent2);
                        break;

                }
            }


        };
        out2.setOnClickListener(onClickListener);
        bNext.setOnClickListener(onClickListener);
    }
}