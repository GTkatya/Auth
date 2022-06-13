package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IntroductionSection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_section);
        final TextView txt_Is = findViewById(R.id.txt_Is);
        IntroductionToJS1 IntroductionToJS1 = new IntroductionToJS1();
        final Button b_out_Is = findViewById(R.id.b_out_Is);
        final Button b_naxt_Is = findViewById(R.id.b_naxt_Is);
        txt_Is.setText("Введение в JavaScript\n" +
                "1.\tКраткие сведения\n" +
                "2.\tОператоры и конструкция языка\n"+
                "3.\tТипы данных\n"+
                "4.\tСреды выполнения\n");
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.b_out_Is:
                Intent intent = new Intent(IntroductionSection.this, MainMenu.class);
                startActivity(intent);
                break;
            case R.id.b_naxt_Is:
                Intent intent2 = new Intent(IntroductionSection.this, IntroductionToJS1.class);
                startActivity(intent2);
                break;

            }
        }
    };
    b_out_Is.setOnClickListener(onClickListener);
    b_naxt_Is.setOnClickListener(onClickListener);
 }
}