package com.codewithpavan.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;


public class MainActivity extends AppCompatActivity {
    private Button zero, one, two, three, four, five, six, seven, eight, nine, backspace, equals, plus, point, minus, multiply, divide, percent, clear, paren1, paren2;
    private TextView display;
    private TextView subDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.zero); one = findViewById(R.id.one); two = findViewById(R.id.two); three = findViewById(R.id.three); four = findViewById(R.id.four); five = findViewById(R.id.five); six = findViewById(R.id.six); seven = findViewById(R.id.seven); eight = findViewById(R.id.eight); nine = findViewById(R.id.nine); display = findViewById(R.id.display); backspace = findViewById(R.id.backspace); equals = findViewById(R.id.equals); plus = findViewById(R.id.plus); minus = findViewById(R.id.minus); multiply = findViewById(R.id.multiply); point = findViewById(R.id.point); percent = findViewById(R.id.percent); divide = findViewById(R.id.divide); clear = findViewById(R.id.clear); paren1 = findViewById(R.id.peranOne); paren2 = findViewById(R.id.peranTwo);

        display.setCursorVisible(false);

        subDisplay = findViewById(R.id.subResult);

        display.setShowSoftInputOnFocus(false);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText().toString() + "9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (display.getText().toString().charAt(display.length() - 1) != '+' && display.getText().toString().charAt(display.length() - 1) != '-' && display.getText().toString().charAt(display.length() - 1) != 'x' && display.getText().toString().charAt(display.length() - 1) != '/' && display.getText().toString().charAt(display.length() - 1) != '.' && display.getText().toString().charAt(display.length() - 1) != '%' && display.getText().toString().charAt(display.length() - 1) != '(') {
                        display.setText(display.getText().toString() + "+");
                    }
                }
                catch (Exception e) {

                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (display.getText().toString().charAt(display.length() - 1) != '+' && display.getText().toString().charAt(display.length() - 1) != '-' && display.getText().toString().charAt(display.length() - 1) != 'x' && display.getText().toString().charAt(display.length() - 1) != '/' && display.getText().toString().charAt(display.length() - 1) != '.' && display.getText().toString().charAt(display.length() - 1) != '%' && display.getText().toString().charAt(display.length() - 1) != '(') {
                        display.setText(display.getText().toString() + "-");
                    }
                }
                catch (Exception e) {

                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (display.getText().toString().charAt(display.length() - 1) != '+' && display.getText().toString().charAt(display.length() - 1) != '-' && display.getText().toString().charAt(display.length() - 1) != 'x' && display.getText().toString().charAt(display.length() - 1) != '/' && display.getText().toString().charAt(display.length() - 1) != '.' && display.getText().toString().charAt(display.length() - 1) != '%' && display.getText().toString().charAt(display.length() - 1) != '(') {
                        display.setText(display.getText().toString() + "/");
                    }
                }
                catch (Exception e) {

                }
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (display.getText().toString().charAt(display.length() - 1) != '+' && display.getText().toString().charAt(display.length() - 1) != '-' && display.getText().toString().charAt(display.length() - 1) != 'x' && display.getText().toString().charAt(display.length() - 1) != '/' && display.getText().toString().charAt(display.length() - 1) != '.' && display.getText().toString().charAt(display.length() - 1) != '%' && display.getText().toString().charAt(display.length() - 1) != '(') {
                        display.setText(display.getText().toString() + "%");
                    }
                }
                catch (Exception e) {

                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (display.getText().toString().charAt(display.length() - 1) != '+' && display.getText().toString().charAt(display.length() - 1) != '-' && display.getText().toString().charAt(display.length() - 1) != 'x' && display.getText().toString().charAt(display.length() - 1) != '/' && display.getText().toString().charAt(display.length() - 1) != '.' && display.getText().toString().charAt(display.length() - 1) != '%' && display.getText().toString().charAt(display.length() - 1) != '(') {
                        display.setText(display.getText().toString() + "x");
                    }
                }
                catch (Exception e) {

                }
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (display.getText().toString().charAt(display.length() - 1) != '+' && display.getText().toString().charAt(display.length() - 1) != '-' && display.getText().toString().charAt(display.length() - 1) != 'x' && display.getText().toString().charAt(display.length() - 1) != '/' && display.getText().toString().charAt(display.length() - 1) != '.' && display.getText().toString().charAt(display.length() - 1) != '%' && display.getText().toString().charAt(display.length() - 1) != '(') {
                        display.setText(display.getText().toString() + ".");
                    }
                }
                catch (Exception e){

                }
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().length() != 0) {
                    int length = display.getText().toString().length();
                    String subString = display.getText().toString().substring(0, length - 1);
                    display.setText(subString);
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (String.valueOf(display.getText().toString().charAt(display.getText().length() - 1)) == "") {

                    } else {
                        String data = display.getText().toString();

                        data = data.replaceAll("x", "*");
                        data = data.replaceAll("%", "/100");

                        Context rhino = Context.enter();
                        rhino.setOptimizationLevel(-1);

                        String final_result = "";

                        try {
                            Scriptable scriptable = rhino.initStandardObjects();
                            final_result = rhino.evaluateString(scriptable, data, "javascript", 1, null).toString();
                            subDisplay.setText(display.getText().toString() + "=");
                        } catch (Exception e) {

                        }

                        long final_result2 = (long) Long.parseLong(final_result);

                        final_result = String.valueOf(final_result2);


                        display.setText(final_result);
                    }
                }
                catch (Exception e) {

                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
                subDisplay.setText("");
            }
        });

        paren1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText().toString() + "(");
                }
                catch (Exception e){

                }
            }
        });

        paren2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    display.setText(display.getText().toString() + ")");
                }
                catch (Exception e){

                }
            }
        });
    }
}