package company.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import android.util.Log;
import android.widget.EditText;

public class RunJscript extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_jscript);
    }

}