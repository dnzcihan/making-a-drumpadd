package com.example.denizcihantiryaki.drumpad;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool sp;//android medyayı kullanabilmek için soundPool api kullandım
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        sound1 = sp.load(getApplicationContext(), R.raw.sound1, 1);
        sound2 = sp.load(getApplicationContext(), R.raw.sound2, 1);
        sound3 = sp.load(getApplicationContext(), R.raw.sound3, 1);
        sound4 = sp.load(getApplicationContext(), R.raw.sound4, 1);
        sound5 = sp.load(getApplicationContext(), R.raw.sound5, 1);
        sound6 = sp.load(getApplicationContext(), R.raw.sound6, 1);
        sound7 = sp.load(getApplicationContext(), R.raw.sound7, 1);
        sound8 = sp.load(getApplicationContext(), R.raw.sound8, 1);
        sound9 = sp.load(getApplicationContext(), R.raw.sound9, 1);
    }

    public void playsound1(View v) {
        sp.play(sound1,1,1,0,0,10f);

    }

    public void playsound2(View v) {
        sp.play(sound2,1,1,0,0,10f);
    }

    public void playsound3(View view) {
        sp.play(sound3,1,1,0,0,10f);
    }

    public void playsound4(View view) {
        sp.play(sound4,1,1,0,0,10f);
    }

    public void playsound5(View view) {
        sp.play(sound5,1,1,0,0,10f);
    }

    public void playsound6(View v) {
        sp.play(sound6,1,1,0,0,10f);
    }

    public void playsound7(View v) {
        sp.play(sound7,1,1,0,0,10f);
    }

    public void playsound8(View v) {
        sp.play(sound8,1,1,0,0,10f);
    }

    public void playsound9(View v) {
        sp.play(sound9,1,1,0,0,10f);
    }

/* Kullanıcı uygulamanın icinde butonlara bastığında uygulama hata vermemesi ve uygulamadan atmaması icin
     sp.playler hangi butona basarsa o butondaki ses dosyasına erişmesi için kullanılır
    emulator de seslerin tamamını doğru çalıştırmıyor, telefonda dene!!*/

}
