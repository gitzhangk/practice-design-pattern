package main.test.designpattern.adapterpattern;

import main.java.designpattern.adapterpattern.service.Computer;
import main.java.designpattern.adapterpattern.service.SDCard;
import main.java.designpattern.adapterpattern.service.TFCard;
import main.java.designpattern.adapterpattern.service.impl.SDAdapterTF;
import main.java.designpattern.adapterpattern.service.impl.SDCardImpl;
import main.java.designpattern.adapterpattern.service.impl.TFCardImpl;
import main.java.designpattern.adapterpattern.service.impl.ThinkpadComputer;

public class ComputerReadDemo {
    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));
        System.out.println("====================================");
        TFCard tfCard = new TFCardImpl();
        SDCard tfCardAdapterSD = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(tfCardAdapterSD));
    }
}