/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamrin3third;

public class Complex {

    private int a;
    private int i;
    private int a2;
    private int i2;

    public Complex() {
        a = 0;
        i = 0;
        a2 = 0;
        i2 = 0;
    }

    public Complex(int a, int i, int a2, int i2) {
        this.a = a;
        this.i = i;
        this.a2 = a2;
        this.i2 = i2;
    }

    public Complex(Complex b) {
        this.a = b.a;
        this.i = b.i;
        this.a2 = b.a2;
        this.i2 = b.i2;
    }

    public String toString() {
        return "first : " + a + " + " + i + "i,   " + "Second : " + a2 + " + " + i2 + "i";
    }

    public boolean equals(Complex b) {
        return (a == b.a && i == b.i && a2 == b.a2 && i2 == b.i2);
    }

    public String Total() {
        int c = a + a2;
        int d = i + i2;
        return "first + Second = " + c + " + " + d + "i";
    }

    public String Minus() {
        int c = a - a2;
        int d = i - i2;
        return "first + Second = " + c + " + " + "(" + d + "i)";
    }

    public String Multiplication() {
        int c = (a * a2) - (i * i2);
        int d = (a * i2) + (i * a2);
        return "first * Second = " + c + " + " + d + "i";
    }

    public String Division() {
        int c = (a * a2) + (i * i2);
        int d = (a * i2) + (i * a2);
        int Denomonator = (a2 * a2) + (i2 * i2);
        return "first + Second = " + c + " + " + d + "i" + " / " + Denomonator;
    }

    public String Mozdavaj() {
        int c = (a * a) + (i * i);
        int d = (a2 * a2) + (i2 * i2);
        return "{first :"+c+",   "+"Second : "+d+"}";
    }
    public String Reverse() {
        return "first : 1/" + a + " + 1/" + i + "i,   "+"Second : 1/"+a2+" + 1/"+i2+"i";
    }
    
}
