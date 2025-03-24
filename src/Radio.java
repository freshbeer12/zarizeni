public class Radio implements IPrehravac{


    @Override
    public void prehraj(boolean hraj) {
        if (hraj){
            System.out.println("Radio spuštěno");
        }
        else{
            System.out.println("Radio ukončeno");
        }
    }






}
