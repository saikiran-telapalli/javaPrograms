package Interview;

public class CountAnimals {
    static int countRabbits(int Heads, int Legs)
    {
        int count = 0;

        count = (Legs) - 2 * (Heads);
        count = count / 2;

        return count;
    }

    // Driver code
    public static void main(String args[])
    {
        int Heads = 100, Legs = 300;

        int Rabbits = countRabbits(Heads, Legs);

        System.out.println("Rabbits = " +
                Rabbits);
        System.out.println("Pigeons = " +
                (Heads - Rabbits));
    }
}

