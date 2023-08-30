class Degree1
{
  public void getDegree()
{
    System.out.println("I got a degree");
  }
}

class Undergraduate extends Degree1{
  public void getDegree1()
{
    System.out.println("I am an Undergraduate");
  }
}

class Postgraduate extends Degree1
{
  public void getDegree1()
{
    System.out.println("I am a Postgraduate");
  }
}

class Ans
{
  public static void main(String[] args)
{
    Undergraduate a = new Undergraduate();
    Postgraduate b = new Postgraduate();
    a.getDegree();
    b.getDegree();
  }
}
