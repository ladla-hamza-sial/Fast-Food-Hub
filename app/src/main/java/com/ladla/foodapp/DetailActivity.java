package com.ladla.foodapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgDetail = findViewById(R.id.img_detail);
        TextView tvName = findViewById(R.id.tv_name_detail);
        TextView tvPrice = findViewById(R.id.tv_price_detail);
        TextView tvDesc = findViewById(R.id.tv_desc_detail);

        String name = getIntent().getStringExtra("name");
        String price = getIntent().getStringExtra("price");
        String desc = getIntent().getStringExtra("description");
        int image = getIntent().getIntExtra("image", R.drawable.burger);

        tvName.setText(name);
        tvPrice.setText(price);
        tvDesc.setText(desc);
        imgDetail.setImageResource(image);

        findViewById(R.id.btn_order).setOnClickListener(v -> 
            Toast.makeText(this, "Order placed for " + name, Toast.LENGTH_LONG).show()
        );
    }
}
