package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class MainMenu extends AppCompatActivity /*implements View.OnClickListener*/{

    private FirebaseAuth auth;
    private DatabaseReference myRef;
    private List<String> Tasks;
   /* ListView UsersTasks;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        final Button out = findViewById(R.id.out);
        MainActivity mainA = new MainActivity();
        task1 task1 = new task1();

        exercise2 exercise2 = new exercise2();
        exercise3 exercise3 = new exercise3();
        exercise4 exercise4 = new exercise4();
        PersonalArea PA = new PersonalArea();

        RunJscript runJscript = new RunJscript();
        final Button ex1 = findViewById(R.id.ex1);
        final Button ex2 = findViewById(R.id.ex2);
        final Button ex3 = findViewById(R.id.ex3);
        final Button ex4 = findViewById(R.id.ex4);
        final Button ter = findViewById(R.id.teor);
        final Button FAQ = findViewById(R.id.FAQ);
        final Button bPA = findViewById(R.id.bPA);

      /*  out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainMenu.this, MainActivity.class);
                startActivity(intent);

            }
        });*/

        View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
                public void onClick(View view)
        {
            switch (view.getId())
            {
                case R.id.out:
                    Intent intent = new Intent(MainMenu.this, MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.ex1:
                    Intent intent2 = new Intent(MainMenu.this, task1.class);
                    startActivity(intent2);
                    break;
                case R.id.ex2:
                    Intent intent3 = new Intent(MainMenu.this, exercise2.class);
                    startActivity(intent3);
                    break;
                case R.id.ex3:
                    Intent intent4 = new Intent(MainMenu.this, exercise3.class);
                    startActivity(intent4);
                    break;
                case R.id.ex4:
                    Intent intent5 = new Intent(MainMenu.this, exercise4.class);
                    startActivity(intent5);
                    break;
                case R.id.teor:
                    Intent intent6 = new Intent(MainMenu.this, RunJscript.class);
                    startActivity(intent6);
                    break;

                case R.id.FAQ:
                    Toast.makeText(getApplicationContext(),
                            "777!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.bPA:
                    Intent intentA = new Intent(MainMenu.this, PersonalArea.class);
                    startActivity(intentA);
                    break;
            }
        }

        };

        out.setOnClickListener(onClickListener);
        ex1.setOnClickListener(onClickListener);
        ex2.setOnClickListener(onClickListener);
        ex3.setOnClickListener(onClickListener);
        ex4.setOnClickListener(onClickListener);
        ter.setOnClickListener(onClickListener);
        FAQ.setOnClickListener(onClickListener);
        bPA.setOnClickListener(onClickListener);
    }
}