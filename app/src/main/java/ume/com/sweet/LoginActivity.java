package ume.com.sweet;

import android.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class LoginActivity extends BaseActivity{

    private EditText username;
    private EditText password;
    private OkHttpClient client = new OkHttpClient();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameS = username.getText().toString();
                String passwordS = password.getText().toString();
              /*  RequestBody requestBody = new FormBody.Builder()
                        .add("username", usernameS)
                        .add("password", passwordS)
                        .build();

                Request request = new Request.Builder()
                        .url("/login")
                        .post(requestBody)
                        .build();
                try {
                    Response response = client.newCall(request).execute();


                } catch (IOException e) {
                    e.printStackTrace();
                }*/
                MainActivity.antionStart(LoginActivity.this, usernameS, passwordS);
            }
        });

    }

}
