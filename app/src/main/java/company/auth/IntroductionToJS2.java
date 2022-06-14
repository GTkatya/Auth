package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroductionToJS2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inproduction_to_js2);
        final TextView txtStory = findViewById(R.id.txtStory);
        IntroductionToJS1 IntroductionToJS1 = new IntroductionToJS1();
        final Button b_out_ITJS2 = findViewById(R.id.b_out_ITJS2);
        final Button b_next_ITJS2 = findViewById(R.id.b_next_ITJS2);
        txtStory.setText("История развития языка JavaScript:\n");
        ImageView imageView = findViewById(R.id.imgStory);
        imageView.setImageResource(R.drawable.history);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.b_out_ITJS2:
                        Intent intent = new Intent(IntroductionToJS2.this, IntroductionToJS1.class);
                        startActivity(intent);
                        break;
                    case R.id.b_next_ITJS2:
                        Intent intent2 = new Intent(IntroductionToJS2.this, IntroductionToJS3.class);
                        startActivity(intent2);
                        break;

                }
            }
        };
        b_out_ITJS2.setOnClickListener(onClickListener);
        b_next_ITJS2.setOnClickListener(onClickListener);
    }
}
