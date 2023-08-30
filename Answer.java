class Degree
{
  public void getDegree()
{
    System.out.println("I got a degree");
  }
}

class Undergraduate extends Degree{
  public void getDegree()
{
    System.out.println("I am an Undergraduate");
  }
}

class Postgraduate extends Degree
{
  public void getDegree()
{
    System.out.println("I am a Postgraduate");
  }
}

class Answer
{
  public static void main(String[] args)
{
    Degree a = new Degree();
    Undergraduate b = new Undergraduate();
    Postgraduate c = new Postgraduate();
    a.getDegree();
    b.getDegree();
    c.getDegree();
  }
}
