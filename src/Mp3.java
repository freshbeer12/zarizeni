public class Mp3 implements IPrehravac{

        private String znacka;
        public Mp3(String znacka){
            this.znacka = znacka;
        }

        @Override
        public void prehraj(boolean hraj) {
            if (hraj){
                System.out.println("Přehrávání MP3 zařízení značky " + znacka + " spuštěno");
            }
            else{
                System.out.println("Přehrávání MP3 zařízení značky " + znacka + " MP3 ukončeno");
            }
        }


}
