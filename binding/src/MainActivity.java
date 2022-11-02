package com.example.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.practiceandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fetchUserProfile();
    }

    private void fetchUserProfile(){

        UserProfile userProfile = new UserProfile();
        userProfile.name = "Jerry";
        userProfile.phone = "010-5555-5555";
        userProfile.address = "America";

        updateUI(userProfile);
    }

    private void updateUI(UserProfile userProfile){
        binding.name.setText(userProfile.name);
        binding.phone.setText(userProfile.phone);
        binding.address.setText(userProfile.address);
    }
}
