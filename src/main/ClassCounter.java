package main;

public class ClassCounter {

    private static int methodCntr =0;

    private static int instantiationCntr = 0;

    private int iD;

    public ClassCounter() {
        ClassCounter.instantiationCntr++;
    }


    public static int getInstantiationCount() {
        return (ClassCounter.instantiationCntr);
    }

    public static int callMethodCount(){

        return methodCntr++;
    }
/*
    Nem működik static metódussal 2. feladat

    private static int idRefresh(){

        return iD++;
    }

 */
}
