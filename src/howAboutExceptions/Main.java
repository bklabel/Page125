package howAboutExceptions;

class GetThatError {


   public static void main(String[] args){
    GetThatError gte = new  GetThatError();
    gte.crossFingers();  //how do I get gte to be seen inside of crossFingers?
  }

  private void crossFingers(){
    try{
      gte.takeRisk(String "Something Bad Happened"); // cannot resolve symbol gte
    }catch(BadException e){
      System.out.println("Aargh!");
      e.printStackTrace(); //cannot resolve method printStackTrace
    }
  }

  private void takeRisk() throws BadException { //There is an @ sign in the gutter. Inferred anotation??
    throw new BadException();                  //Cannot resolve symbol BadException
  }

  private void BadException(String abandonAllHope){  //an @ annotation in the gutter.
       if (abandonAllHope.equals("Something Bad Happened")){
          System.out.println("I am the BadException Handler and I fixed the issue");
      }
  }

}