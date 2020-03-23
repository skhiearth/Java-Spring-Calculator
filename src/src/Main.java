package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class Main extends JFrame {
    JLabel jl;
    JTextField tf;

    CalcMethods mt = new CalcMethods();

    int a;
    int b;
    int c;
    int d;
    int count=0;
    double A;
    double B;
    double C;
    double D;

    double result=0;
    boolean bl = false;
    boolean bl2 = false;

    LocalDateTime timePoint = LocalDateTime.now();

    Font font1 = new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 72);

    Main(){
        setResizable(false);
        setSize(366,680);
        setTitle("Simple Calculator - Java (Open Ended)");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        tf = new JTextField();
        tf.setHorizontalAlignment(JTextField.RIGHT);

        JButton Clear = new JButton("<html><h1 style: font=Verdana;>C");
        Clear.setBounds(0, 202, 90, 90);

        JButton PM = new JButton("<html><h1 style: font=Verdana;>+/-");
        PM.setBounds(90, 202, 90, 90);

        JButton percent = new JButton("<html><h1 style: font=Verdana;>%");
        percent.setBounds(180, 202, 90, 90);

        JButton divide = new JButton("<html><h1 style: font=Verdana;>/");
        divide.setBounds(270, 202, 90, 90);

        tf.setBounds(0, 0, 360, 203);

        JButton seven = new JButton("<html><h1 style: font=Verdana;>7");
        seven.setBounds(0, 292, 90, 90);

        JButton eight = new JButton("<html><h1 style: font=Verdana;>8");
        eight.setBounds(90, 292, 90, 90);

        JButton nine = new JButton("<html><h1 style: font=Verdana;>9");
        nine.setBounds(180, 292, 90, 90);

        JButton multiply = new JButton("<html><h1 style: font=Verdana;>x");
        multiply.setBounds(270, 292, 90, 90);

        JButton four = new JButton("<html><h1 style: font=Verdana;>4");
        four.setBounds(0, 382, 90, 90);

        JButton five = new JButton("<html><h1 style: font=Verdana;>5");
        five.setBounds(90, 382, 90, 90);

        JButton six = new JButton("<html><h1 style: font=Verdana;>6");
        six.setBounds(180, 382, 90, 90);

        JButton minus= new JButton("<html><h1 style: font=Verdana;>x");
        minus.setBounds(270, 382, 90, 90);

        JButton one = new JButton("<html><h1 style: font=Verdana;>1");
        one.setBounds(0, 472, 90, 90);

        JButton two = new JButton("<html><h1 style: font=Verdana;>2");
        two.setBounds(90, 472, 90, 90);

        JButton three = new JButton("<html><h1 style: font=Verdana;>3");
        three.setBounds(180, 472, 90, 90);

        JButton plus= new JButton("<html><h1 style: font=Verdana;>+");
        plus.setBounds(270, 472, 90, 90);

        JButton zero = new JButton("<html><h1 style: font=Verdana;>0");
        zero.setBounds(0, 562, 180, 90);

        JButton point = new JButton("<html><h1 style: font=Verdana;>.");
        point.setBounds(180, 562, 90, 90);

        JButton equal= new JButton("<html><h1 style: font=Verdana;>=");
        equal.setBounds(270, 562, 90, 90);

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+"1");
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+"2");

            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+"3");

            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+"4");

            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+"5");

            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+"6");

            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+"7");

            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+"8");

            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+"9");

            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+"0");

            }
        });

        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf.getText().length()<10)
                    tf.setText(tf.getText()+".");
                bl=true;
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bl=false){
                    a = Integer.parseInt(tf.getText());
                    tf.setText("");
                    c = '+';
                }
                else {
                    A = Double.parseDouble(tf.getText());
                    tf.setText("");
                    C = '+';
                }
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bl=false){
                    a = Integer.parseInt(tf.getText());
                    tf.setText("");
                    c = '-';
                }
                else {
                    A = Double.parseDouble(tf.getText());
                    tf.setText("");
                    C = '-';
                }
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bl=false){
                    a = Integer.parseInt(tf.getText());
                    tf.setText("");
                    c = '/';
                }
                else {
                    A = Double.parseDouble(tf.getText());
                    tf.setText("");
                    C = '/';
                }
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bl=false){
                    a = Integer.parseInt(tf.getText());
                    tf.setText("");
                    c = '*';
                }
                else {
                    A = Double.parseDouble(tf.getText());
                    tf.setText("");
                    C = '*';
                }
            }
        });

        PM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bl=false){
                    a = Integer.parseInt(tf.getText())*(-1);
                    tf.setText(a+"");
                    c = '*';
                } else {
                    A = Double.parseDouble(tf.getText())*(-1);
                    tf.setText(A+"");
                    C = '*';
                }
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(count==0){
                    if(bl=false){
                        b = Integer.parseInt(tf.getText());
                        d=b;
                        if(c=='+'){
                            result=mt.plus(a, b);
                            tf.setText((int)result+"");
                        } if(c=='-'){
                            result=mt.minus(a, b);
                            tf.setText((int)result+"");
                        } if(c=='/'){
                            result=mt.divide(a, b);
                            tf.setText((int)result+"");
                        } if(c=='*'){
                            result=mt.multiply(a, b);
                            tf.setText((int)result+"");
                        }
                    } else{
                        B = Double.parseDouble(tf.getText());
                        D=B;
                        if(C=='+'){
                            result=mt.plus(A, B);
                            tf.setText(result+"");
                        } if(C=='-'){
                            result=mt.minus(A, B);
                            tf.setText(result+"");
                        } if(C=='/'){
                            result=mt.divide(A, B);
                            tf.setText(result+"");
                        } if(C=='*'){
                            result=mt.multiply(A,B);
                            tf.setText(result+"");
                        } if(C=='%'){
                            result=mt.percent(A, B);
                            tf.setText(result+"");
                        }
                    }
                    bl2=true;
                }  else{
                    if(bl=false){
                        a=(int)result;
                        if(c=='+'){
                            result=mt.plus(a, d);
                            tf.setText((int)result+"");
                        } if(c=='-'){
                            result=mt.minus(a, d);
                            tf.setText((int)result+"");
                        } if(c=='/'){
                            result=mt.divide(a, d);
                            tf.setText((int)result+"");
                        } if(c=='*'){
                            result=mt.multiply(a, d);
                            tf.setText((int)result+"");
                        }
                    } else{
                        A=result;
                        if(C=='+'){
                            result=mt.plus(A, D);
                            tf.setText(result+"");
                        } if(C=='-'){
                            result=mt.minus(A, D);
                            tf.setText(result+"");
                        } if(C=='/'){
                            result=mt.divide(A, D);
                            tf.setText(result+"");
                        } if(C=='*'){
                            result=mt.multiply(A, D);
                            tf.setText(result+"");
                        }
                    }
                    bl2=true;
                }

                count++;
            }
        });

        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A = Double.parseDouble(tf.getText());
                tf.setText("");
                C = '%';
            }
        });

        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result=0;
                a=0;
                b=0;
                tf.setText("");
            }
        });

        tf.setFont(font1);
        tf.setForeground(new java.awt.Color(250,250,250));
        tf.setBackground(new java.awt.Color(32,32,32));
        Clear.setBackground(new java.awt.Color(201,202,206));
        PM.setBackground(new java.awt.Color(201,202,206));
        percent.setBackground(new java.awt.Color(201,202,206));
        divide.setBackground(new java.awt.Color(249,146,18));
        seven.setBackground(new java.awt.Color(214,215,219));
        eight.setBackground(new java.awt.Color(214,215,219));
        nine.setBackground(new java.awt.Color(214,215,219));
        multiply.setBackground(new java.awt.Color(249,146,18));
        four.setBackground(new java.awt.Color(214,215,219));
        five.setBackground(new java.awt.Color(214,215,219));
        six.setBackground(new java.awt.Color(214,215,219));
        minus.setBackground(new java.awt.Color(249,146,18));
        one.setBackground(new java.awt.Color(214,215,219));
        two.setBackground(new java.awt.Color(214,215,219));
        three.setBackground(new java.awt.Color(214,215,219));
        plus.setBackground(new java.awt.Color(249,146,18));
        zero.setBackground(new java.awt.Color(214,215,219));
        point.setBackground(new java.awt.Color(214,215,219));
        equal.setBackground(new java.awt.Color(249,146,18));

        add(tf);

        add(Clear);
        add(PM);
        add(percent);
        add(divide);

        add(seven);
        add(eight);
        add(nine);
        add(multiply);

        add(four);
        add(five);
        add(six);
        add(minus);

        add(one);
        add(two);
        add(three);
        add(plus);

        add(zero);
        add(point);
        add(equal);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}