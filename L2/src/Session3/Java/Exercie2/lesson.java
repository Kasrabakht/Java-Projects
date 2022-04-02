package Session3.Java.Exercie2;

public class lesson implements Lessons {
    public String lesson;
    @Override
    public void Lessonname() {
        switch (lesson)
        {
            case "Mathematics 2":
                System.out.print("Mathematics 2");
                break;
            case "Calculus":
                System.out.print("Calculus");
                break;
            case "Discrete":
                System.out.print("Discrete");
                break;
            case "Andishe 2":
                System.out.print("Andishe 2");
                break;
        }

    }

    @Override
    public void Vahed() {
        switch (lesson)
        {
            case "Mathematics 2":
                System.out.print("      "+3);
                break;
            case "Calculus":
            case "Discrete":
                System.out.print("           "+3);
                break;
            case "Andishe 2":
                System.out.print("         "+2);
                break;
        }

    }

    @Override
    public void Pishniyaz() {
        switch (lesson)
        {
            case "Mathematics 2":
                System.out.print("       "+"Mathematics 1");
                break;
            case "Calculus":
                System.out.print("        "+"Mathematics 1");
                break;
            case "Discrete":
                System.out.print("     "+"Maban 1,Mathematics1");
                break;
            case "Andishe 2":
                System.out.print("         "+"Andishe 1");
                break;
        }

    }

    @Override
    public void Hamniyaz() {
        switch (lesson) {
            case "Mathematics 2":
                System.out.print("        " + "Mathematics 1");
                break;
            case "Calculus":
                System.out.print("         " + "Mathematics 1");
                break;
            case "Discrete":
                System.out.print("     " + "Maban 1,Mathematics1");
                break;

        }
    }
}
