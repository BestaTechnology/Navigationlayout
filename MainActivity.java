package voice_to_text.sandy148101.com.navigationlayout;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        navigationView =(NavigationView)findViewById(R.id.navigate);

        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                int id = menuItem.getItemId();
                if(id==R.id.bluetooth)
                {
                    Toast.makeText(getApplicationContext(),"Navigate to Bluetooth Successfully",Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

    }
        @Override

    public boolean onOptionsItemSelected (MenuItem item){

            if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
                return true;
            }
          return super.onOptionsItemSelected(item);


        }
    }

