public class Academy{
  String name;
  int rank;
  String nation;
  public Academy(String name, int rank, String nation){
    this.name = name;
    this.rank = rank;
    this.nation = nation;
  }

  public String getName(){
    return name;
  }

  public int getRank(){
    return rank;
  }

  public String getNation(){
    return nation;
  }
}
