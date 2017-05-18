package edu.csudh.jcardona2toromail.rafflealot20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ExploreActivity extends AppCompatActivity {

    Button item1, item2,item3,item4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        item1 = (Button) findViewById(R.id.explore_item1Button);
        item2 = (Button) findViewById(R.id.button2);
        item3 = (Button) findViewById(R.id.button3);
        item4 = (Button) findViewById(R.id.explore_item4Button);
        ViewButtonactionButton();

    }

    public void ViewButtonactionButton(){
        item1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExploreActivity.this,ViewitemsActivity.class);
                startActivity(intent);
            }
        });
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option1_home:
                Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.option2_Signout:
                Toast.makeText(getApplicationContext(),item.toString(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ExploreActivity.this,MainActivity.class);
                startActivity(intent);

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
