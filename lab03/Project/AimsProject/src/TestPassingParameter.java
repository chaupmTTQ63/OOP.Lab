public class TestPassingParameter {
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTilte());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTilte());

        changeTitle(jungleDVD, cinderellaDVD.getTilte());
        System.out.println("jungle dvd title: " + jungleDVD.getTilte());
    }

    public static void swap(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
        DigitalVideoDisc tmp = disc1;
        disc1 = disc2;
        disc2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTilte();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
