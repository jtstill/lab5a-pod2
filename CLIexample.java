// Emily, Kyle, Greyson, Jack

class CLIexample
{
  public static void main(String [] args)
  {
    if (args.length < 1)
	  System.err.println("usage: proram [-h|-s]");
	else
	{
	  if ("-h".equals(args[0]))
	  {
	    System.out.println("  * *  ");
	    System.out.println("       ");
	    System.out.println("*     *");
	    System.out.println(" *   * ");
	    System.out.println("  ***  ");
	  }
	  else if ("-s".equals(args[0]))
	  {
	    System.out.println("  * *  ");
	    System.out.println("       ");
	    System.out.println("  ***  ");
	    System.out.println(" *   * ");
	    System.out.println("*     *");
	  }
	  else
	    System.err.println("usage: proram [-h|-s]");
	}
  }
}
