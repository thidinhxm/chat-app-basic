package hcmus.thidinh.chatapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hcmus.thidinh.chatapp.R;
import hcmus.thidinh.chatapp.databinding.ActivityChatBinding;
import hcmus.thidinh.chatapp.models.User;
import hcmus.thidinh.chatapp.utilities.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetails();
    }

    private void loadReceiverDetails() {
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListeners() {
        binding.imageBack.setOnClickListener(view -> onBackPressed());
    }
}