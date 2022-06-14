package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.util.stream.IntStream;

public class RunJscript extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_jscript);
        Bundle bundle = getIntent().getExtras();
        int message = bundle.getInt("message");
        final Button bMenu = findViewById(R.id.bMenu);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.bMenu:
                        Intent intent = new Intent(RunJscript.this, MainMenu.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        bMenu.setOnClickListener(onClickListener);

    }


    public void clickHandler(View view) {
        EditText input = findViewById(R.id.editTextInput);
        EditText output = findViewById(R.id.editTextOutput);
        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        try {
            webView.evaluateJavascript(input.getText().toString(), new ValueCallback<String>() {
                @Override
                public void onReceiveValue(String s) {

                    output.setText(s);
                }

            });
        } catch (Exception e) {
            output.setText("Error: " + e.toString());
            Log.e(getApplicationContext().getPackageName(), e.toString());
        }
    }


}