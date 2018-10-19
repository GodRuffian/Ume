package ume.com.sweet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends BaseActivity {

    public static void antionStart(Context context, String username, String password) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("username", username);
        intent.putExtra("password", password);
        Log.d("用户名：", username);
        Log.d("密码", password);
        context.startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                Intent intent = new Intent(MainActivity.this, AddFriends.class);
                startActivity(intent);
//                Toast.makeText(this, "Add your friends", Toast.LENGTH_SHORT).show();
                break;
            case R.id.export:
                Toast.makeText(this, "预留", Toast.LENGTH_SHORT).show();
                break;
                default:
                    break;
        }

        return true;
    }
}
