package hallo;

import org.intellij.lang.annotations.Language;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.net.URL;
import java.util.Random;
import java.util.logging.Logger;

public class RandomInteger {

    public static void main(String[] args) {
        Random randomGenerator = new // press Ctrl-Space or Ctrl-Shift-Space
        ;
        RandomInteger randomInteger =

    }

    public static void instantAutoCompletionTest() throws XPathExpressionException {
        // X x=X."Ctrl-Shift-Space""Ctrl-Shift Space"
        XPath xPath = XPathFactory.newInstance().newXPath();
        Random random = new Random();
        Logger logger = Logger.getLogger("test");

        // Chain completion
        // XPE x="Ctrl-Shift-Space""Ctrl-Shift Space"
        XPathExpression xPathExpression = xPath.compile("//mapId[@target='...' or contains(@target,concat(';','...'))]/@url");

        String lastname = "Mustermann";
        String firstname = "Max";
        String street = "Eine Strasse";

        // Smart tab completion is name sensitive
        new Person(firstname, lastname, street);
        // alt-enter on new for variable creation


        // Static fields and methods
        //Border b="Ctrl-Shift-Space""Ctrl-Shift Space"
        Border border = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

        JList list = new JList();
        final ListSelectionModel selectionModel = list.getSelectionModel();
        // int constant completion
        selectionModel.setSelectionMode();

        //quickinfo in completion list
        // "".Ctrl-Q
        System.out.println();

        Object person = new Person(firstname, lastname, street );
        if (person instanceof Person) {
            // autocast by dataflow
            Person person1 = (Person) person;
        }


        RandomInteger.class.getResource("root.properties");
        final URL resource = RandomInteger.class.getResource("properties/test.properties");


        // statement completion
        // if"Ctrl-Alt-enter"


        RandomInteger.class.getResource("hallo.properties");

        RandomInteger.class.getResource("/properties/test.properties");
        boolean a = true;
        boolean b = false;

        final boolean b1 = !b && !a;

        @Language("JSON") final String s = "hallo = \"bla\"\n";

        @Language("JSON") String json = "{hallo : 3}";
    }


    public boolean booleanIndentions(boolean a, boolean b, boolean c, boolean d) {
        return !a && !b && !c && !d;
    }

    public static void methods() {


        //thr n Iar
        throw new IllegalArgumentException();

    }

    public static void languageInjection() {
        @Language("XML") String json = "<root>\n" +
                "    <tag attribute=\"hallo\">Content</tag>\n" +
                "    <tag attribute=\"hallo2\">OtherContent</tag>\n" +
                "</root>";

        @Language("SQLite") String sql = "SELECT appId,creationTime FROM moz_cookies";
    }

    public static void formatAndRegex(String s) {
        // check for errors, enter dialog und compile
        final String z = "hallo".replaceAll("\\d\\d-\\d\\d-\\d{4}", "a");

        // Alt-Enter on the regex --> Check RegExp
        final boolean matches = s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
    }


    static class Person {
        String firstname;
        String lastname;
        String street;

        Person(String firstname, String lastname, String street) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.street = street;
        }
    }
    // TODO: live template
    // TODO: field rename frage nach parameter name ändern
    // TODO: completion exclusion with Alt-Enter for Loggers
}
