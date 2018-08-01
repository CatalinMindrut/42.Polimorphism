package com.Catalin;

public class Main {
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            Movie movie = randomMovie();
            /** Create a new variable, movie, of type Movie.
             */
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");

            // backslash n starts the output on the next line, like pressing enter to change the line.
            /** Polymorphism - assigning functionality depending on the type of object that we're created.
             * Each of these objects inherit from the Movie class but we've assigned a unique bit of
             * functionality for the plot, in each class.
             * If the random class returns 5, this is the class Forgettable that has no plot method but
             * Forgettable extends the Movie class, so Java will look there to see if a plot method exists.
             * Thus the output is the method plot that was written in the Movie class.
             */
            /** If we were not using polymorphism, you would have to somehow modify the output based on
             * the class found through the random number generator. Involving if statements, if the class found
             * is Jaws then return the method inside Jaws, if it has no method then return the one in Movie
             * and so on.
             */
        }
    }

    /** Create a method that randomly returns one of the movies
     */
    public static Movie randomMovie(){
        /** The return data type of the method is Movie, the object. Look at it as a data type, not an object.
         * It returns a randomMovie of type Movie.
         */
        int randomNumber = (int) (Math.random() * 5) + 1;
        /** The value was cast to int because by default Math.random returns a double.
         * The random method returns a number >= 0 and < 1 but by multiplying by 5, it will return a number
         * between 0 and 4, to which we add 1 so it can return a number between 1 and 5.
         */
        System.out.println("Random number generated was " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();
            /** This method will generate a random number between 1 and 5 and based on the number (using the switch
             * cases) it will return a certain movie.
             */
        }
        return null;
    }


}
//class Movie {
//    private String name;
//
//    public Movie(String name){
//        this.name = name;
//    }
//
//    public String plot(){
//        return "No plot here";
//    }

//}

//class Jaws extends Movie {
//    public Jaws(){
//        super("Jaws");
//    }
//
//    public String plot(){
//        return "A shark eats lots of people!";
//    }
//    /** Method was overridden automatically. This can be done even without @Override, by using the same
//     * method name in the class that extends the super class.
//     */

//}

//class IndependenceDay extends Movie{
//    public IndependenceDay() {
//        super("Independence Day");
//    }
//    @Override
//    public String plot() {
//        return "Aliens attempt to take over planet earth";
//    }

//}
//class MazeRunner extends Movie{
//    public MazeRunner() {
//        super("Maze Runner");
//    }
//
//    @Override
//    public String plot() {
//        return "Kids try to escape a maze";
//    }

//}
//class StarWars extends Movie{
//    public StarWars() {
//        super("Star Wars");
//    }
//
//    @Override
//    public String plot() {
//        return "Imperial Forces try to take over the universe";
//    }

//}
//class Forgetable extends Movie{
//    public Forgetable() {
//        super("Forgetable");
//    }
//    //No plot method

//}


