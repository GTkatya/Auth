package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroductionToJS1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);
        final TextView txtFact = findViewById(R.id.txtFact);
        IntroductionSection IntroductionSection = new IntroductionSection();
        final Button b_out_ITJS = findViewById(R.id.b_out_ITJS);
        final Button b_next_ITJS = findViewById(R.id.b_next_ITJS);
        txtFact.setText("Краткие сведения о JavaScript:\n" +
                "Создатель JavaScript(JS) -  Брендан Айк (Brendan Eich).\n" +
                "Год создания 1995\n"+
                "Текущая версия: 12th Edition – ECMAScript 2021.\n");
        ImageView imageView = findViewById(R.id.imgEich);
        imageView.setImageResource(R.drawable.brendan_eich);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b_out_ITJS:
                        Intent intent = new Intent(IntroductionToJS1.this, IntroductionSection.class);
                        startActivity(intent);
                        break;
                    case R.id.b_next_ITJS:
                        Intent intent2 = new Intent(IntroductionToJS1.this, IntroductionToJS2.class);
                        startActivity(intent2);
                        break;

                }
            }
        };
        b_out_ITJS.setOnClickListener(onClickListener);
        b_next_ITJS.setOnClickListener(onClickListener);
    }
}