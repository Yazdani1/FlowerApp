package yazdaniscodelab.flowerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button rose;
    private Button marigold;
    private Button sunflower;
    private Button zinnia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Flower();
    }

    private void Flower(){

        rose=findViewById(R.id.rose);
        marigold=findViewById(R.id.marigold);
        sunflower=findViewById(R.id.sunflower);
        zinnia=findViewById(R.id.zinnia);

        //Rose..
        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),RoseActivity.class);
                startActivity(intent);

            }
        });
        //Marigold..
        marigold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),MarigoldActivity.class);
                startActivity(intent);

            }
        });

        //Sunflower

        sunflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),SunFlowerActivity.class);
                startActivity(intent);

            }
        });

        //zinnia.

        zinnia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),ZinniaActivity.class);
                startActivity(intent);

            }
        });



    }

}
