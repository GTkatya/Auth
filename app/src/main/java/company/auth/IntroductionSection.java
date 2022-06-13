package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        final Button b_next_Is = findViewById(R.id.b_naxt_Is);
    }
}