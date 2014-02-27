package hallo;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Intentions {

    public static final double DOUBLE = 1.3d;
    private String myString = "";

    private Vector names = new Vector();

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println(arg);
        }
    }

    public void doSomething(Collection strings) {
        for (Iterator iterator = strings.iterator(); iterator.hasNext(); ) {
            String next = (String) iterator.next();
            System.out.println("next = " + next);
        }

        final Enumeration elements = names.elements();
        while (elements.hasMoreElements()) {
            String name = (String) elements.nextElement();
            System.out.println("name = " + name);
        }

    }

    public String printName(String firstName, String lastName) {
        // format or messageformat
        return "FirstName: " + firstName + "lastName" + lastName;

    }

    public double requestCurrentRate(String fromCurrency, String toCurrency) {
        double answer = 1d;
        if (fromCurrency.equals("USD") && toCurrency.equals("CDN")) {
            answer = DOUBLE;
        }
        if (toCurrency.equals("CDN") && fromCurrency.equals("USD")) {
            answer = 1 / DOUBLE;
        }
        return answer;
    }

    private void doSomething(String attribute) {
        if (attribute == null) {
            return;
        }
        doSomethingInternal(attribute);
    }

    private void doSomethingInternal(String attribute) {
        if (attribute != null) {
            System.out.println("attribute = " + attribute);
        }
    }

    boolean expandBoolean(boolean a) {
        return a;
    }

    void deMorganAndSplit(boolean a1, boolean a2) {
        if (!a1 || !a2) return;
    }


    int toConditionalOperator(boolean a) {
        if (a) {
            return 3;
        }
        return 4;
    }

    void simplify(int i) {
        if (this == null || true || i == 0) return;
    }

    //TODO
    // migrate type refactoring?
}
