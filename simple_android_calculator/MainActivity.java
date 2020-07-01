package com.mate.uisample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;
    int operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operation = 0;

        textView = (TextView)findViewById(R.id.textview1);
        textView.setText("Write 1 for Addition \nWrite 2 for Subtraction \nWrite 3 for Multiplication \nWrite 4 for Division");

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation = Integer.parseInt(editText.getText().toString());

                if(operation == 1){
                    textView.setText("Addition");
                    editValue();
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                          final int  firstNum = Integer.parseInt(editText.getText().toString());
                            textView.setText("" + firstNum + "+");
                            editValue2();
                          button.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View v) {
                                  int secondNum = Integer.parseInt(editText.getText().toString());
                                  int result = firstNum + secondNum;
                                  textView.setText("" + result);
                                  button.setText("Done");
                                  button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View v) {
                                          refreshActivity();
                                      }
                                  });
                              }
                          });

                        }
                    });
                } else if (operation == 2){
                    textView.setText("Subtraction");
                    editValue();
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            final int  firstNum = Integer.parseInt(editText.getText().toString());
                            textView.setText("" + firstNum + "-");
                            editValue2();
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    int secondNum = Integer.parseInt(editText.getText().toString());
                                    int result = firstNum - secondNum;
                                    textView.setText("" + result);
                                    button.setText("Done");
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            refreshActivity();
                                        }
                                    });
                                }
                            });

                        }
                    });
                } else if (operation == 3){
                    textView.setText("Multiplication");
                    editValue();
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            final int  firstNum = Integer.parseInt(editText.getText().toString());
                            textView.setText("" + firstNum + "x");
                            editValue2();
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    int secondNum = Integer.parseInt(editText.getText().toString());
                                    int result = firstNum * secondNum;
                                    textView.setText("" + result);
                                    button.setText("Done");
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            refreshActivity();
                                        }
                                    });
                                }
                            });

                        }
                    });
                } else if (operation == 4){
                    textView.setText("Division");
                    editValue();
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            final double  firstNum = Integer.parseInt(editText.getText().toString());
                            textView.setText("" + firstNum + "/");
                            editValue2();
                            button.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    double secondNum = Integer.parseInt(editText.getText().toString());
                                    double result = firstNum / secondNum;
                                    textView.setText("" + result);
                                    button.setText("Done");
                                    button.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            refreshActivity();
                                        }
                                    });
                                }
                            });

                        }
                    });
                } else {
                    textView.setText("Invalid input");
                    button.setText("Try again");
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            refreshActivity();
                        }
                    });
                }
            }
        });

    }

    public void refreshActivity(){
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        finish();;
        overridePendingTransition(0,0);
        startActivity(intent);
        overridePendingTransition(0,0);

    }

    public void editValue(){
        editText.setText("");
        editText.setHint("Enter first number");
    }

    public void editValue2(){
        editText.setText("");
        editText.setHint("Enter Second number");
    }
}
