package com.example.opengl_project2;

import androidx.appcompat.app.AppCompatActivity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private GLSurfaceView myGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myGLView = new GLSurfaceView(this);
        myGLView.setEGLContextClientVersion(3);
        myGLView.setRenderer((new MyGLRenderer()));
        setContentView(myGLView);

    }
}