package com.kerimsamimi.myboy;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    ImageView [] imageDizi;
    Handler handler;
    Runnable runnable;
    TextView textView;
    int a,score=0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    TextView textView3;

    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton8;
    ImageButton imageButton10;

    CountDownTimer countDownTimer;

    long s1=60000;

     View v;


    int flag=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        imageView1=(ImageView)findViewById(R.id.imageView);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView4=(ImageView)findViewById(R.id.imageView4);
        //imageView1.setVisibility(View.INVISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        textView=(TextView)findViewById(R.id.textView);

        imageButton5=(ImageButton)findViewById(R.id.playagain);
        imageButton5.setVisibility(View.INVISIBLE);
        imageButton10=(ImageButton)findViewById(R.id.imageButton10);
        imageButton10.setVisibility(View.INVISIBLE);

        imageDizi= new ImageView[]{imageView1,imageView2,imageView3,imageView4};

        imageSakla();
        timer();

    }

    public void imageSakla(){
        imageView1=(ImageView)findViewById(R.id.imageView);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView4=(ImageView)findViewById(R.id.imageView4);

        handler = new Handler();
        runnable= new Runnable() {
            @Override
            public void run() {
                for(ImageView image : imageDizi){
                    image.setVisibility(View.INVISIBLE);
                }
                Random r = new Random();
                a= r.nextInt(4-0);
                imageDizi[a].setVisibility(View.VISIBLE);
                handler.postDelayed(this,400);
            }
        };
        handler.post(runnable);
    }


    public void btn1(View v){

        imageView1=(ImageView)findViewById(R.id.imageView);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView4=(ImageView)findViewById(R.id.imageView4);

        imageButton1=(ImageButton)findViewById(R.id.button1);
        imageButton2=(ImageButton)findViewById(R.id.button2);
        imageButton3=(ImageButton)findViewById(R.id.button3);
        imageButton4=(ImageButton)findViewById(R.id.button4);


        if(imageView1.getVisibility()==View.VISIBLE) {
            textView = (TextView) findViewById(R.id.textView);
            score++;
            textView.setText("Score : " + score);
        }
        else{
            handler.removeCallbacks(runnable);
            textView.setText("Score : "+score);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);

            imageButton1.setVisibility(View.INVISIBLE);
            imageButton2.setVisibility(View.INVISIBLE);
            imageButton3.setVisibility(View.INVISIBLE);
            imageButton4.setVisibility(View.INVISIBLE);
            imageButton5.setVisibility(View.VISIBLE);
        }
    }

    public void btn2(View v){

        imageView1=(ImageView)findViewById(R.id.imageView);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView4=(ImageView)findViewById(R.id.imageView4);

        imageButton1=(ImageButton)findViewById(R.id.button1);
        imageButton2=(ImageButton)findViewById(R.id.button2);
        imageButton3=(ImageButton)findViewById(R.id.button3);
        imageButton4=(ImageButton)findViewById(R.id.button4);

        if(imageView2.getVisibility()==View.VISIBLE) {

            textView = (TextView) findViewById(R.id.textView);
            score++;
            textView.setText("Score : " + score);
        }
        else{
            handler.removeCallbacks(runnable);
            textView.setText("Score : "+score);
            imageView1.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);

            imageButton1.setVisibility(View.INVISIBLE);
            imageButton2.setVisibility(View.INVISIBLE);
            imageButton3.setVisibility(View.INVISIBLE);
            imageButton4.setVisibility(View.INVISIBLE);
            imageButton5.setVisibility(View.VISIBLE);
        }
    }
    public void btn3(View v){

        imageView1=(ImageView)findViewById(R.id.imageView);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView4=(ImageView)findViewById(R.id.imageView4);

        imageButton1=(ImageButton)findViewById(R.id.button1);
        imageButton2=(ImageButton)findViewById(R.id.button2);
        imageButton3=(ImageButton)findViewById(R.id.button3);
        imageButton4=(ImageButton)findViewById(R.id.button4);

        if(imageView3.getVisibility()==View.VISIBLE) {
            textView = (TextView) findViewById(R.id.textView);
            score++;
            textView.setText("Score : " + score);
        }
        else{
            handler.removeCallbacks(runnable);
            textView.setText("Score :"+score);
            imageView2.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);

            imageButton1.setVisibility(View.INVISIBLE);
            imageButton2.setVisibility(View.INVISIBLE);
            imageButton3.setVisibility(View.INVISIBLE);
            imageButton4.setVisibility(View.INVISIBLE);
            imageButton5.setVisibility(View.VISIBLE);
        }
    }
    public void btn4(View v){

        imageView1=(ImageView)findViewById(R.id.imageView);
        imageView2=(ImageView)findViewById(R.id.imageView2);
        imageView3=(ImageView)findViewById(R.id.imageView3);
        imageView4=(ImageView)findViewById(R.id.imageView4);

        imageButton1=(ImageButton)findViewById(R.id.button1);
        imageButton2=(ImageButton)findViewById(R.id.button2);
        imageButton3=(ImageButton)findViewById(R.id.button3);
        imageButton4=(ImageButton)findViewById(R.id.button4);

        if(imageView1.getVisibility()==View.VISIBLE) {
            textView = (TextView) findViewById(R.id.textView);
            score++;
            textView.setText("Score : " + score);
        }
        else{
            handler.removeCallbacks(runnable);
            textView.setText("Score : "+score);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView1.setVisibility(View.INVISIBLE);

            imageButton1.setVisibility(View.INVISIBLE);
            imageButton2.setVisibility(View.INVISIBLE);
            imageButton3.setVisibility(View.INVISIBLE);
            imageButton4.setVisibility(View.INVISIBLE);
            imageButton5.setVisibility(View.VISIBLE);
        }
    }

    public void playAgain(View view){
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);
    }

    public void pause(View view){
        imageButton8=(ImageButton)findViewById(R.id.imageButton8);
        imageButton1=(ImageButton)findViewById(R.id.button1);
        imageButton2=(ImageButton)findViewById(R.id.button2);
        imageButton3=(ImageButton)findViewById(R.id.button3);
        imageButton4=(ImageButton)findViewById(R.id.button4);
        handler.removeCallbacks(runnable);
        imageButton1.setEnabled(true);
        imageButton2.setEnabled(true);
        imageButton3.setEnabled(true);
        imageButton4.setEnabled(true);
        imageButton8.setVisibility(View.INVISIBLE);
        imageButton10.setVisibility(View.VISIBLE);

        countDownTimer.cancel();
    }
    public void resume(View view){
        imageButton8=(ImageButton)findViewById(R.id.imageButton8);
        imageButton1=(ImageButton)findViewById(R.id.button1);
        imageButton2=(ImageButton)findViewById(R.id.button2);
        imageButton3=(ImageButton)findViewById(R.id.button3);
        imageButton4=(ImageButton)findViewById(R.id.button4);
        handler.post(runnable);
        imageButton1.setEnabled(false);
        imageButton2.setEnabled(false);
        imageButton3.setEnabled(false);
        imageButton4.setEnabled(false);
        imageButton8.setVisibility(View.VISIBLE);
        imageButton10.setVisibility(View.INVISIBLE);

        timer();


    }

    public void timer(){
        imageButton1=(ImageButton)findViewById(R.id.button1);
        imageButton2=(ImageButton)findViewById(R.id.button2);
        imageButton3=(ImageButton)findViewById(R.id.button3);
        imageButton4=(ImageButton)findViewById(R.id.button4);

        countDownTimer=new CountDownTimer(s1,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView3=(TextView)findViewById(R.id.textView3);
                textView3.setText("Süre : "+ millisUntilFinished/1000);
                s1=millisUntilFinished;
            }
            @Override
            public void onFinish() {
                handler.removeCallbacks(runnable);
                imageButton1.setVisibility(View.INVISIBLE);
                imageButton2.setVisibility(View.INVISIBLE);
                imageButton3.setVisibility(View.INVISIBLE);
                imageButton4.setVisibility(View.INVISIBLE);

                imageView1.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
                imageView3.setVisibility(View.INVISIBLE);
                imageView4.setVisibility(View.INVISIBLE);

                imageButton5.setVisibility(View.VISIBLE);


            }
        }.start();
    }
}
