package com.codepath.quangnguyen.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    EditText etEditItem;
    String originalText;
    int itemPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etEditItem = (EditText) findViewById(R.id.etEditItem);
        originalText = getIntent().getStringExtra("todo_item_string");
        etEditItem.setText(originalText);
        itemPosition = getIntent().getIntExtra("todo_item_position", 0);
    }

    public void onSubmit(View v) {
        Intent data = new Intent();
        data.putExtra("todo_item_string", etEditItem.getText().toString());
        data.putExtra("todo_item_position", itemPosition);
        setResult(RESULT_OK, data);
        this.finish();
    }
}
