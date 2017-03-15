package com.example.kshitiz_united.brunelcopy;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText Email = (EditText) findViewById(R.id.editText);
        final EditText Pass = (EditText) findViewById(R.id.editText2);
        final Button Login = (Button) findViewById(R.id.button1);
        final RadioButton rb = (RadioButton) findViewById(R.id.radioButton);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = Email.getText().toString();
                String pass = Pass.getText().toString();

                String e1 = "1529522@my.brunel.ac.uk";
                String e2 = "cs15jmp@my.brunel.ac.uk";
                String e3 = "cs15llm@my.brunel.ac.uk";
                String e4 = "cs13jac@my.brunal.ac.uk";
                String e5 = "sarthakchutiya@land.com";
                String e6 = "cs15gsd@my.brunal.ac.uk";
                String e7 = "cs15kkk@my.brunal.ac.uk";


                    if(email.equals(e1)   && pass.equals("1234") )
                    {
                        Intent i = new Intent(MainActivity.this, Afterlogin.class);
                        MainActivity.this.startActivity(i);
                    }
                     else
                    {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                        builder.setMessage("Login Failed")
                                .setNegativeButton("Retry", null)
                                .create()
                                .show();
                    }




            }
        });


    }



}
