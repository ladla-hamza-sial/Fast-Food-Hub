package com.ladla.foodapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        
        List<FoodItem> foodList = new ArrayList<>();
        foodList.add(new FoodItem("Classic Burger", "$10", "Juicy beef patty with lettuce and tomato", R.drawable.burger));
        foodList.add(new FoodItem("Cheese Burger", "$12", "Classic burger topped with melted cheddar", R.drawable.burger));
        foodList.add(new FoodItem("Veggie Burger", "$9", "Healthy plant-based patty with fresh greens", R.drawable.burger));
        foodList.add(new FoodItem("Double Patty Burger", "$15", "Two beef patties for double the taste", R.drawable.burger));
        foodList.add(new FoodItem("Chicken Burger", "$11", "Crispy chicken breast with mayo", R.drawable.burger));
        foodList.add(new FoodItem("Spicy Zinger", "$13", "Hot and spicy fried chicken burger", R.drawable.burger));
        foodList.add(new FoodItem("Fish Burger", "$14", "Deep fried fish fillet with tartar sauce", R.drawable.burger));
        foodList.add(new FoodItem("Breakfast Burger", "$8", "Egg, bacon and cheese in a bun", R.drawable.burger));
        
        FoodAdapter adapter = new FoodAdapter(foodList);
        recyclerView.setAdapter(adapter);
    }
}
