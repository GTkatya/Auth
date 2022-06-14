package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PersonalArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_area);
        final Button bHome = findViewById(R.id.bHome);
        ImageView imageView = findViewById(R.id.imgIc);
        imageView.setImageResource(R.drawable.ic);

        ImageView imageView1 = findViewById(R.id.imgR);
        imageView1.setImageResource(R.drawable.gr);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bHome:
                        Intent intent = new Intent(PersonalArea.this, MainMenu.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        bHome.setOnClickListener(onClickListener);
    }
}