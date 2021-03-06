package com.example.uee_recipe_management.application.temporary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uee_recipe_management.application.R;
import com.example.uee_recipe_management.application.bookmark.AddItem;
import com.example.uee_recipe_management.application.bookmark.Bookmark;
import com.example.uee_recipe_management.application.bookmark.ItemTesting;
import com.example.uee_recipe_management.application.category.CategorySearchLayout;
import com.example.uee_recipe_management.application.category.ResponsiveVerticalHorizontalLayout;
import com.example.uee_recipe_management.application.home.Home;
import com.example.uee_recipe_management.application.item.Item;
import com.example.uee_recipe_management.application.notification.NotificationLayout;
import com.example.uee_recipe_management.application.settings.SettingPage;
import com.example.uee_recipe_management.application.splash.OpeningSplashScreen;

public class TemporaryIndexPage extends AppCompatActivity {

    Button settingButton;
    Button addItem;
    Button homeButton;
    Button responsivePage;
    Button splashScreen;
    Button notificationPage;
    Button individualPage;
    Button bookmarkPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temporary_index_page);

        settingButton = findViewById(R.id.settings_button);
        addItem = findViewById(R.id.add_item);
        homeButton = findViewById(R.id.home_button);
        responsivePage = findViewById(R.id.responsive_button);
        splashScreen = findViewById(R.id.splash_screen);
        notificationPage = findViewById(R.id.notification_screen);
        individualPage = findViewById(R.id.individual_item);
        bookmarkPage = findViewById(R.id.bookmark_screen);
        settingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SettingPage.class);
                view.getContext().startActivity(intent);
            }
        });
        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AddItem.class);
                view.getContext().startActivity(intent);
            }
        });
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Home.class);
                view.getContext().startActivity(intent);
            }
        });
        responsivePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ResponsiveVerticalHorizontalLayout.class);
                view.getContext().startActivity(intent);
            }
        });
        splashScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), OpeningSplashScreen.class);
                view.getContext().startActivity(intent);
            }
        });
        notificationPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), NotificationLayout.class);
                view.getContext().startActivity(intent);
            }
        });
        individualPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Item.class);
                view.getContext().startActivity(intent);
            }
        });
        bookmarkPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ItemTesting.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}