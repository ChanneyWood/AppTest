package com.example.a12579.apptest;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CacuActivty extends AppCompatActivity  {
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_0;
    Button button_jia;
    Button button_jian;
    Button button_cheng;
    Button button_chu;
    Button button_ac;
    Button button_mc;
    Button button_mr;
    Button button_mjia;
    Button button_mjian;
    Button button_deng;
    Button button_del;
    Button button_dian;
    TextView textview;
    private String text="";
    float mnum = 0;

    public void getData(){
        Context context = this;
        SharedPreferences sharedPreferences = context.getSharedPreferences("data",MODE_PRIVATE);
        text = sharedPreferences.getString("num","");
        textview.setText(text);
    }

    public void putData(){
        Context context = this;
        SharedPreferences sharedPreferences = context.getSharedPreferences("data",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String str = (String) textview.getText();
        editor.putString("num",str);
        editor.commit();
    }

    public static boolean isNumeric(String str){      //判断字符串是否为.0

        if (str.charAt(str.length()-1)=='0'&&str.charAt(str.length()-2)=='.')
            return true;
        else
            return false;
    }
    public static boolean isEndChar(String str){    //判断字符串是否以符号结尾
        if(str.endsWith("+")||str.endsWith("-")||str.endsWith("*")||str
        .endsWith("/"))
            return true;
        else
            return false;
    }
    public static boolean isStartChar(String str){    //判断字符串是否以+，*，/开头
        if(str.startsWith("+")||str.startsWith("*")||str.startsWith("/"))
            return true;
        else
            return false;
    }
    public static boolean isEnd0(String str){        //判断字符串是否结尾为符号+0
        if (str.endsWith("0")&&(str.charAt(str.length()-2)=='+'||str.charAt(str.length()-2)=='-'||str.charAt(str.length()-2)=='*'||str.charAt(str.length()-2)=='/')){
            return true;
        } else{
            return false;
        }
    }
    public static boolean canwritedian(String str) {     //判断字符串后面是否可以再加点
        if (str.startsWith("-")) {
            str = str.substring(1, str.length());
            return canwritedian(str);
        } else if (str.indexOf("+") == -1 && str.indexOf("-") == -1 && str.indexOf("*") == -1 && str.indexOf("/") == -1) {
            if (str.contains(".")) {
                return false;
            } else {
                return true;
            }
        } else if(str.contains(".")) {
            if (str.contains("+")&&str.lastIndexOf(".")>str.indexOf("+")||str.contains("-")&&str.lastIndexOf(".")>str.indexOf("-")||str.contains("*")&&str.lastIndexOf(".")>str.indexOf("*")||
                    str.contains("/")&&str.lastIndexOf(".")>str.indexOf("/")){
                return false;
            }else{
                return true;
            }
        } else {
            return true;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        button_mc = (Button) findViewById(R.id.button_mc);
        button_mjia = (Button)findViewById(R.id.button_mjia);
        button_mjian = (Button)findViewById(R.id.button_mjian);
        button_mr = (Button)findViewById(R.id.button_mr);
        button_9 = (Button)findViewById(R.id.button_9);
        button_8 =(Button) findViewById(R.id.button_8);
        button_7 = (Button)findViewById(R.id.button_7);
        button_6 = (Button)findViewById(R.id.button_6);
        button_5 = (Button)findViewById(R.id.button_5);
        button_4 = (Button)findViewById(R.id.button_4);
        button_3 = (Button)findViewById(R.id.button_3);
        button_2 =(Button)findViewById(R.id.button_2);
        button_1 =(Button) findViewById(R.id.button_1);
        button_0 = (Button)findViewById(R.id.button_0);
        button_ac = (Button)findViewById(R.id.button_ac);
        button_jia =(Button) findViewById(R.id.button_jia);
        button_jian =(Button)findViewById(R.id.button_jian);
        button_cheng = (Button)findViewById(R.id.button_cheng);
        button_chu = (Button)findViewById(R.id.button_chu);
        button_deng = (Button)findViewById(R.id.button_deng);
        button_del = (Button)findViewById(R.id.button_del);
        button_dian = (Button)findViewById(R.id.button_dian);
        textview = (TextView)findViewById(R.id.textview);

        getData();


        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0")){
                    text="1";
                    textview.setText(text);
                }else if(isEnd0(text)){
                    text = text.substring(0,text.length()-1);
                    text = text.concat("1");
                    textview.setText(text);
                } else{
                textview.setText(text.concat("1"));
                text =textview.getText().toString();
                }
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0")){
                    text="2";
                    textview.setText(text);
                }else if(isEnd0(text)){
                    text = text.substring(0,text.length()-1);
                    text = text.concat("2");
                    textview.setText(text);
                } else {
                    textview.setText(text.concat("2"));
                    text = textview.getText().toString();
                }
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0")){
                    text="3";
                    textview.setText(text);
                }else if(isEnd0(text)){
                    text = text.substring(0,text.length()-1);
                    text = text.concat("3");
                    textview.setText(text);
                } else {
                    textview.setText(text.concat("3"));
                    text = textview.getText().toString();
                }
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0")){
                    text="4";
                    textview.setText(text);
                }else if(isEnd0(text)){
                    text = text.substring(0,text.length()-1);
                    text = text.concat("4");
                    textview.setText(text);
                } else {
                    textview.setText(text.concat("4"));
                    text = textview.getText().toString();
                }
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0")){
                    text="5";
                    textview.setText(text);
                }else if(isEnd0(text)){
                    text = text.substring(0,text.length()-1);
                    text = text.concat("5");
                    textview.setText(text);
                } else {
                    textview.setText(text.concat("5"));
                    text = textview.getText().toString();
                }
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0")){
                    text="6";
                    textview.setText(text);
                }else if(isEnd0(text)){
                    text = text.substring(0,text.length()-1);
                    text = text.concat("6");
                    textview.setText(text);
                } else {
                    textview.setText(text.concat("6"));
                    text = textview.getText().toString();
                }
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0")){
                    text="7";
                    textview.setText(text);
                }else if(isEnd0(text)){
                    text = text.substring(0,text.length()-1);
                    text = text.concat("7");
                    textview.setText(text);
                } else {
                    textview.setText(text.concat("7"));
                    text = textview.getText().toString();
                }
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0")){
                    text="8";
                    textview.setText(text);
                }else if(isEnd0(text)){
                    text = text.substring(0,text.length()-1);
                    text = text.concat("8");
                    textview.setText(text);
                } else {
                    textview.setText(text.concat("8"));
                    text = textview.getText().toString();
                }
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0")){
                    text="9";
                    textview.setText(text);
                }else if(isEnd0(text)){
                    text = text.substring(0,text.length()-1);
                    text = text.concat("9");
                    textview.setText(text);
                } else {
                    textview.setText(text.concat("9"));
                    text = textview.getText().toString();
                }
            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.equals("0")){
                    text="0";
                    textview.setText(text);
                }else if(isEnd0(text)){
                    text = text.substring(0,text.length()-1);
                    text = text.concat("0");
                    textview.setText(text);
                } else {
                    textview.setText(text.concat("0"));
                    text = textview.getText().toString();
                }
            }
        });
        button_jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEndChar(text)){
                } else{
                    textview.setText(text.concat("+"));
                    text =textview.getText().toString();
                }
            }
        });
        button_jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEndChar(text)){
                } else{
                    textview.setText(text.concat("-"));
                    text =textview.getText().toString();
                }
            }
        });
        button_cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEndChar(text)){
                } else{
                    textview.setText(text.concat("*"));
                    text =textview.getText().toString();
                }
            }
        });
        button_chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEndChar(text)){
                } else{
                    textview.setText(text.concat("/"));
                    text =textview.getText().toString();
                }
            }
        });
        button_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText("");
                text="";
            }
        });
       button_deng.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String [] num = text.split("\\+|-|\\*|/");
            if (text==""||num.length==1||isStartChar(text)||isEndChar(text)){
                Toast.makeText(getApplication(),"错误",Toast.LENGTH_SHORT).show();
            } else if (text.contains("E")){
                Toast.makeText(getApplication(),"不能完成复杂运算",Toast.LENGTH_SHORT).show();
            } else if (num.length==3) {
                float num1;
                float num2;
                if (num[0].equals("")&&text.startsWith("-")) {
                    num1 = (-1) * Float.parseFloat(num[1]);
                    num2 = Float.parseFloat(num[2]);
                    float result = 0;
                    if (text.contains("+") && text.contains("-"))
                        result = num1 + num2;
                    else if (text.contains("*") && text.contains("-"))
                        result = num1 * num2;
                    else if (text.contains("/") && text.contains("-")) {
                        if (num2 == 0) {
                            Toast.makeText(getApplication(), "除数不能为0", Toast.LENGTH_SHORT).show();
                            result = 0;
                        } else {
                            result = num1 / num2;
                        }
                    } else {
                        result = num1 - num2;
                    }
                    if (isNumeric("" + result)) {
                        textview.setText("" + (int) (result));
                    }else{
                        textview.setText("" + result);
                    }
                }else{
                    Toast.makeText(getApplication(),"该计算器只能完成单次运算",Toast.LENGTH_SHORT).show();
                }
            } else if (num.length==2){
                if (num[0].equals("")){
                    Toast.makeText(CacuActivty.this, "错误", Toast.LENGTH_SHORT).show();
                } else{
                    float num1 ;
                    float num2 ;
                    num1 = Float.parseFloat(num[0]);
                    num2 = Float.parseFloat(num[1]);
                    float result = 0;
                    if(text.contains("+"))
                        result = num1 + num2;
                    else if (text.contains("-"))
                        result = num1 - num2;
                    else if (text.contains("*"))
                        result = num1 * num2;
                    else if (text.contains("/")) {
                        if(num2 == 0){
                            Toast.makeText(getApplication(),"除数不能为0",Toast.LENGTH_SHORT).show();
                            result = 0;
                        } else {
                            result = num1/num2;
                        }
                    }
                    if(isNumeric(""+result)){
                        textview.setText(""+(int)(result));
                    } else{
                        textview.setText(""+result);
                    }
                }
            } else{
                Toast.makeText(getApplication(), "该计算器只能完成单次运算", Toast.LENGTH_SHORT).show();
            }
            text = textview.getText().toString();
             }
    });
       button_mjia.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (text.equals("")||text.contains("+")||text.contains("-")||text.contains("*")||text.contains("/")){
                   Toast.makeText(CacuActivty.this, "错误", Toast.LENGTH_SHORT).show();
               } else{
                   mnum = mnum+Float.parseFloat(text);
                   text="";
               }
           }
       });
        button_mjian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text.equals("")||text.contains("+")||text.contains("-")||text.contains("*")||text.contains("/")){
                    Toast.makeText(CacuActivty.this, "错误", Toast.LENGTH_SHORT).show();
                } else{
                    mnum = mnum-Float.parseFloat(text);
                    text="";
                }
            }
        });
        button_mr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isNumeric(""+mnum)){
                    textview.setText(""+(int)(mnum));
                } else{
                    textview.setText(""+mnum);
                }
                text="";
            }
        });
        button_mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mnum=0;
                Toast.makeText(getApplication(),"成功清除记忆数据",Toast.LENGTH_SHORT).show();
            }
        });
        button_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.length()==0){
                }
                else {
                    text = text.substring(0, text.length() - 1);
                    textview.setText(text);
                }
            }
        });
        button_dian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!canwritedian(text)||isEndChar(text)||text.endsWith(".")||text.equals("")){
                }
                else{
                    textview.setText(text.concat("."));
                    text =textview.getText().toString();
                }
            }
        });
}

    @Override
    protected void onDestroy() {
        putData();
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        putData();
        super.onStop();
    }
}
