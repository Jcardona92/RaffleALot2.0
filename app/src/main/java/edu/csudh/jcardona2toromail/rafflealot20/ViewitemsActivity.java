package edu.csudh.jcardona2toromail.rafflealot20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewitemsActivity extends AppCompatActivity {
    Button purchasebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewitems);

        purchasebutton = (Button) findViewById(R.id.View1_purchaseButton);
        PurchaseactionButton();

    }


    public void PurchaseactionButton(){
        purchasebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewitemsActivity.this,PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}
