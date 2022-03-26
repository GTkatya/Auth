package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class TaskActivity extends AppCompatActivity /*implements View.OnClickListener*/{

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
        exercise1 exercise1 = new exercise1();
        final Button ex1 = findViewById(R.id.ex1);
        final Button ex2 = findViewById(R.id.ex2);
        final Button ex3 = findViewById(R.id.ex3);
        final Button ex4 = findViewById(R.id.ex4);
        final Button ter = findViewById(R.id.teor);
        final Button FAQ = findViewById(R.id.FAQ);

      /*  out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TaskActivity.this, MainActivity.class);
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
                    Intent intent = new Intent(TaskActivity.this, MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.ex1:
                    Intent intent2 = new Intent(TaskActivity.this, exercise1.class);
                    startActivity(intent2);
                    break;
                case R.id.ex2:
                    Toast.makeText(getApplicationContext(),
                            "2!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ex3:
                    Toast.makeText(getApplicationContext(),
                            "3!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ex4:
                    Toast.makeText(getApplicationContext(),
                            "4!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.teor:
                    Toast.makeText(getApplicationContext(),
                            "666!", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.FAQ:
                    Toast.makeText(getApplicationContext(),
                            "777!", Toast.LENGTH_SHORT).show();
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
    }
}