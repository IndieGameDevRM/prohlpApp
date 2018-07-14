package com.example.lenovo.prohlpapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class splashScreen  extends AppCompatActivity{
    ImageView imageView;
    private int SPLASH_SCREEN_TIMEOUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);
        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();
        findViewById(R.id.prohlp);
    }
    private class LogoLauncher extends Thread{
        //final User user = new User(splashScreen.this);

        public void run(){
            try{
                sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

                Intent intent=new Intent(splashScreen.this,MainActivity.class);
                startActivity(intent);
                splashScreen.this.finish();

        }
    }
}
