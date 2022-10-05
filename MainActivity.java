package com.example.android.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

/**

 This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder (View view) {

       display(quantity);
       displayMessage("Thank You!");

    }
    int quantity=0;
    // This function is used to increase quantity
    public  void increment(View view){
        quantity++;
        display(quantity);
        displayPrice(quantity*5);



    }
    // This function is used to decrease quantity
    public  void decrement(View view){

        displayPrice(quantity*5-5);
        quantity--;
        display(quantity);

        if(quantity<=0){
            return;

        }

    }
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.note);
        priceTextView.setText(message);
    }


        private void display(int number) {
            TextView quantityTextView = findViewById(R.id.size_text_view);
            quantityTextView.setText(""+number);
        }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.value_text_view);
        priceTextView.setText("Total:" +NumberFormat.getCurrencyInstance().format(number));
    }

    }