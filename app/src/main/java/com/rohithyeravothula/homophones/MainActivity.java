package com.rohithyeravothula.homophones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import datamuse.ResponseWord;
import datamuse.Words;

public class MainActivity extends AppCompatActivity {

    private static Words wordsApi = new Words();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onSearchButtonClick(View view) throws IOException {
        TextView textview = (TextView) findViewById(R.id.editText);
        List<ResponseWord> resp_words = wordsApi.getHomophones(textview.getText().toString());
        List<String> words = new ArrayList<>();
        for(ResponseWord rw: resp_words){
            words.add(rw.word);
        }

    }
}
