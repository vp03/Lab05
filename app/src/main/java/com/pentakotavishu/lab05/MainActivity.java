package com.pentakotavishu.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText responseText11;
    EditText responseText12;
    EditText responseText13;
    EditText responseText14;
    EditText responseText15;
    EditText responseText16;
    EditText responseText17;
    EditText responseText21;
    EditText responseText22;
    EditText responseText23;
    EditText responseText24;
    EditText responseText25;
    EditText responseText26;
    EditText responseText27;


    Counter counter = new Counter(0, 0, 0, 0, 0, 0, 0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int help = counter.getCreate() + 1;
        counter.setCreate(help);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int value = sharedPreferences.getInt("onCreate", 0);
        int finished = value + 1;
        editor.putInt("onCreate", finished);
        editor.apply();

        responseText11=findViewById(R.id.responseEditText11);
        responseText21=findViewById(R.id.responseEditText21);

        responseText11.setText("" + help);
        responseText21.setText("" + finished);

    }


    protected void onStart(){
        super.onStart();
        int help = counter.getStart() + 1;
        counter.setStart(help);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int value = sharedPreferences.getInt("onStart", 0);
        int finished = value + 1;
        editor.putInt("onStart", finished);
        editor.apply();

        responseText12=findViewById(R.id.responseEditText12);
        responseText22=findViewById(R.id.responseEditText22);

        responseText12.setText("" + help);
        responseText22.setText("" + finished);

    }

    protected void onResume(){
        super.onResume();
        int help = counter.getResume() + 1;
        counter.setResume(help);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int value = sharedPreferences.getInt("onResume", 0);
        int finished = value + 1;
        editor.putInt("onResume", finished);
        editor.apply();

        responseText13=findViewById(R.id.responseEditText13);
        responseText23=findViewById(R.id.responseEditText23);

        responseText13.setText("" + help);
        responseText23.setText("" + finished);
    }

    protected void onPause(){
        super.onPause();
        int help = counter.getPause() + 1;
        counter.setPause(help);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int value = sharedPreferences.getInt("onPause", 0);
        int finished = value + 1;
        editor.putInt("onPause", finished);
        editor.apply();

        responseText14=findViewById(R.id.responseEditText14);
        responseText24=findViewById(R.id.responseEditText24);

        responseText14.setText("" + help);
        responseText24.setText("" + finished);
    }

    protected void onStop(){
        super.onStop();
        int help = counter.getStop() + 1;
        counter.setStop(help);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int value = sharedPreferences.getInt("onStop", 0);
        int finished = value + 1;
        editor.putInt("onStop", finished);
        editor.apply();

        responseText15=findViewById(R.id.responseEditText15);
        responseText25=findViewById(R.id.responseEditText25);

        responseText15.setText("" + help);
        responseText25.setText("" + finished);
    }

    protected void onRestart(){
        super.onRestart();
        int help = counter.getRestart() + 1;
        counter.setRestart(help);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int value = sharedPreferences.getInt("onRestart", 0);
        int finished = value + 1;
        editor.putInt("onRestart", finished);
        editor.apply();

        responseText16=findViewById(R.id.responseEditText16);
        responseText26=findViewById(R.id.responseEditText26);

        responseText16.setText("" + help);
        responseText26.setText("" + finished);
    }

    protected void onDestroy(){
        super.onDestroy();
        int help = counter.getDestroy() + 1;
        counter.setDestroy(help);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = sharedPreferences.edit();
        int value = sharedPreferences.getInt("onDestroy", 0);
        int finished = value + 1;
        editor.putInt("onDestroy", finished);
        editor.apply();

        responseText17=findViewById(R.id.responseEditText17);
        responseText27=findViewById(R.id.responseEditText27);

        responseText17.setText("" + help);
        responseText27.setText("" + finished);
    }

    public class Counter{
        int create = 0;
        int start = 0;
        int resume = 0;
        int pause = 0;
        int stop = 0;
        int restart = 0;
        int destroy = 0;

        public Counter(int create, int start, int resume, int pause, int stop, int restart, int destroy) {
            this.create = create;
            this.start = start;
            this.resume = resume;
            this.pause = pause;
            this.stop = stop;
            this.restart = restart;
            this.destroy = destroy;
        }

        public void setCreate(int create) {
            this.create = create;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public void setResume(int resume) {
            this.resume = resume;
        }

        public void setPause(int pause) {
            this.pause = pause;
        }

        public void setStop(int stop) {
            this.stop = stop;
        }

        public void setRestart(int restart) {
            this.restart = restart;
        }

        public void setDestroy(int destroy) {
            this.destroy = destroy;
        }

        public int getCreate() {
            return create;
        }

        public int getStart() {
            return start;
        }

        public int getResume() {
            return resume;
        }

        public int getPause() {
            return pause;
        }

        public int getStop() {
            return stop;
        }

        public int getRestart() {
            return restart;
        }

        public int getDestroy() {
            return destroy;
        }


    }



}
