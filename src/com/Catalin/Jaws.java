package com.Catalin;

public class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people!";
    }
    /** Method was overridden automatically. This can be done even without @Override, by using the same
     * method name in the class that extends the super class.
     */
}
