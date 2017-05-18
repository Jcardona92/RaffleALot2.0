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

public class UserAreaActivity extends AppCompatActivity {

    private Button B_myaccount,B_mylisting,B_myticket,B_messages,B_explore,B_listing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        B_myaccount = (Button) findViewById(R.id.B_usmyaccount);
        B_mylisting = (Button) findViewById(R.id.B_usmylisting);
        B_myticket = (Button) findViewById(R.id.B_usmytickets);
        B_messages = (Button) findViewById(R.id.B_usmymessages);
        B_explore = (Button) findViewById(R.id.B_usexplore);
        B_listing = (Button) findViewById(R.id.B_UAlisting);

        UAActionMyacc();
        UAExplore();
        UAListing();
        UAMessages();
        UAMyTickets();
        UAMyListing();

    }

    @Override
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
                Intent intent = new Intent(UserAreaActivity.this,MainActivity.class);
                startActivity(intent);

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public  void UAActionMyacc(){
        B_myaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this,MyAccountActivity.class);
                startActivity(intent);
            }
        });
    }

    public  void UAMyListing(){
        B_mylisting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this,MyListingActivity.class);
                startActivity(intent);
            }
        });
    }

    public  void UAMyTickets(){
        B_myticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this,MyTicketsActivity.class);
                startActivity(intent);
            }
        });
    }

    public  void UAMessages(){
        B_messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this,MyMessagesActivity.class);
                startActivity(intent);
            }
        });
    }

    public  void UAExplore(){
        B_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this,ExploreActivity.class);
                startActivity(intent);
            }
        });
    }

    public  void UAListing(){
        B_listing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this,ListingActivity.class);
                startActivity(intent);
            }
        });
    }



}
