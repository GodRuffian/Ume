package ume.com.sweet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;
import android.widget.Toast;
//import android.app.ActionBar;

public class MainActivity extends BaseActivity {

    private DrawerLayout myDrawerLayout;

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
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Main");
//        toolbar.setSubtitle("首页");
        /*// 兼容
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbar.setElevation(10.f);
        }*/

        myDrawerLayout = (DrawerLayout) findViewById(R.id.main_drawer_layout);
        NavigationView navView = (NavigationView) findViewById(R.id.main_navigate_view);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.baseline_menu_black_24dp);
        }
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.food:
                        Toast.makeText(MainActivity.this, "click food", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.wardrobe:
                        Toast.makeText(MainActivity.this, "click wardrobe", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.note:
                        Toast.makeText(MainActivity.this, "click note", Toast.LENGTH_SHORT).show();
                        break;
                        default:
                            break;
                }
                return true;
            }
        });
//        toolbar.setLogo(R.drawable.side_bar); 基本不用
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_toolbar, menu);

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
            case android.R.id.home:
                myDrawerLayout.openDrawer(Gravity.START);
                default:
                    break;
        }

        return true;
    }


}
