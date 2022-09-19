package greeting;

public class GreetingFactory {
    public String greeting(String name, String lang) {

        if (lang == null || lang.equals("hun"))  return "Szia, "+name;
        else if (lang.equals("eng"))  return "Hello "+name;
        else if (lang.equals("ger"))  return "Herzlich Willkommen, "+name;
        else return "not a known language given";
    }
}
