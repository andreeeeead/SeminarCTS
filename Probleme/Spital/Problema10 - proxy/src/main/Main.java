package main;

import models.OperatorInternare;
import models.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        OperatorInternare operatorInternare = new OperatorInternare();
        operatorInternare.realizareInternare("Gigel", false);

        ProxyInternare proxyInternare = new ProxyInternare(operatorInternare);
        proxyInternare.realizareInternare("Gigica", true);
        proxyInternare.realizareInternare("Ion", false);
    }
}
