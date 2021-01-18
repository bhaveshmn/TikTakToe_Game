package com.example.tiktaktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    private Button playagain;
    int container =0;
    int []box= new int[9];
   // int [][] winPositions= {{0,1,2},{3,4,5},{6,7,8},
                   //  {0,3,6},{1,4,7},{2,5,8},
                  //   {0,4,8},{2,4,6}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
        img7=findViewById(R.id.img7);
        img8=findViewById(R.id.img8);
        img9=findViewById(R.id.img9);

        playagain=findViewById(R.id.play_again);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(box[0]==1)
                {
                    Toast.makeText(getApplicationContext(),"Heyy!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(container==0)
                    {
                        img1.setImageResource(R.drawable.ic_circle);
                        container =1;
                    }
                    else
                    {
                        img1.setImageResource(R.drawable.ic_close);
                        container =0;
                    }
                }

                box[0]=1;

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(box[1]==2)
                {
                    Toast.makeText(getApplicationContext(),"Heyy!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(container==0)
                    {
                        img2.setImageResource(R.drawable.ic_circle);
                        container =1;
                    }
                    else
                    {
                        img2.setImageResource(R.drawable.ic_close);
                        container =0;
                    }
                }

                box[1]=2;



            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(box[2]==3)
                {
                    Toast.makeText(getApplicationContext(),"Heyy!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(container==0)
                    {
                        img3.setImageResource(R.drawable.ic_circle);
                        container =1;
                    }
                    else
                    {
                        img3.setImageResource(R.drawable.ic_close);
                        container =0;
                    }
                }

                box[2]=3;



            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(box[3]==4)
                {
                    Toast.makeText(getApplicationContext(),"Heyy!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(container==0)
                    {
                        img4.setImageResource(R.drawable.ic_circle);
                        container =1;
                    }
                    else
                    {
                        img4.setImageResource(R.drawable.ic_close);
                        container =0;
                    }
                }

                box[3]=4;



            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(box[4]==5)
                {
                    Toast.makeText(getApplicationContext(),"Heyy!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(container==0)
                    {
                        img5.setImageResource(R.drawable.ic_circle);
                        container =1;
                    }
                    else
                    {
                        img5.setImageResource(R.drawable.ic_close);
                        container =0;
                    }
                }

                box[4]=5;


            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(box[5]==6)
                {
                    Toast.makeText(getApplicationContext(),"Heyy!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(container==0)
                    {
                        img6.setImageResource(R.drawable.ic_circle);
                        container =1;
                    }
                    else
                    {
                        img6.setImageResource(R.drawable.ic_close);
                        container =0;
                    }
                }

                box[5]=6;



            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(box[6]==7)
                {
                    Toast.makeText(getApplicationContext(),"Heyy!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(container==0)
                    {
                        img7.setImageResource(R.drawable.ic_circle);
                        container =1;
                    }
                    else
                    {
                        img7.setImageResource(R.drawable.ic_close);
                        container =0;
                    }
                }

                box[6]=7;


            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(box[7]==8)
                {
                    Toast.makeText(getApplicationContext(),"Heyy!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(container==0)
                    {
                        img8.setImageResource(R.drawable.ic_circle);
                        container =1;
                    }
                    else
                    {
                        img8.setImageResource(R.drawable.ic_close);
                        container =0;
                    }
                }

                box[7]=8;


            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(box[8]==9)
                {
                    Toast.makeText(getApplicationContext(),"Heyy!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(container==0)
                    {
                        img9.setImageResource(R.drawable.ic_circle);
                        container =1;
                    }
                    else
                    {
                        img9.setImageResource(R.drawable.ic_close);
                        container =0;
                    }
                }

                box[8]=9;


            }
        });

        playagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });






        }

    }
