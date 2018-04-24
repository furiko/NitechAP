public class AcademyFile{
  private String name = null;
  private int rank = 0;
  private String nation = null;
  public AcademyFile(String name, int rank, String nation){
    this.name = name;
    this.rank = rank;
    this.nation = nation;
  }
  public void remove(){
    System.out.println(name + "を削除しました");
  }
}
