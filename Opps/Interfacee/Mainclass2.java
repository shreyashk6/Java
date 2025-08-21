package Opps.Interfaces;

interface Delta {
    void play();
    void disp();
}

class Example implements Delta { // FIX: Changed 'delta' to 'Delta'
    @Override
    public void play() {
        System.out.println("Executing play()...");
    }

    @Override
    public void disp() {
        System.out.println("Executing disp()...");
    }
}

public class Mainclass2 {
    public static void main(String[] args) {
        // FIX: Use the correct interface name 'Delta'
        Delta ref = new Example(); 
        ref.play();
        ref.disp();
    }
}