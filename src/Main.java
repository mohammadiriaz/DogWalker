public class Main
{
    public static void main(String[] args)
    {
        DogWalkCompany c = new DogWalkCompany();
        int hour = c.addDogs();
        DogWalker w = new DogWalker(3, c);
        for (int i = 7; i < 11; i++)
