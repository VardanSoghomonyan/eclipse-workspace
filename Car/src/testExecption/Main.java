package testExecption;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

    public static void main(String[] args){

        try{
            doSomething1();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    private static void doSomething1() {

        doSomething2(6);
    }

    private static void doSomething2(int i) {

        if (i>5){
            throw new MissingParameterException("Parameter surname missing");
        }
    }

}
