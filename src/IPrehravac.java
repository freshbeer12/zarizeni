public interface IPrehravac {
    public void prehraj(boolean hraj);
    public default void nazevPisnicky(String zanevPisnicky){
        System.out.println("Zatím není možné přehrát písničku");
    }

}
