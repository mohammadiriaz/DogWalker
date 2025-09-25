public class Main
{
    public static void main(String[] args)
    {
        DogWalkCompany c = new DogWalkCompany();
        int hour = c.addDogs();
        DogWalker w = new DogWalker(3, c);
        for (int i = 7; i < 11; i++)
        {
            c.addDogs();
        }
        System.out.println(w.walkDogs(hour) + " dogs walked.");
        System.out.println(c.numAvailableDogs(hour) + " dogs remaining.");
        System.out.println(c);
        System.out.println("$" + w.dogWalkShift(7, 10) + ".00 earned");

    }
}
