package ch16.generic;

public class GenericExam {
    public static void main(String[] args) {
        ThreeDPrinterPlastic threeDPrinterPlastic = new ThreeDPrinterPlastic();
        Plastic plastic = new Plastic();
        Powder powder = new Powder();

        threeDPrinterPlastic.setMaterial(plastic);
        System.out.println(threeDPrinterPlastic.getMaterial());

        ThreeDPrinterObject threeDPrinterObject = new ThreeDPrinterObject();
        threeDPrinterObject.setMaterial(plastic);
        System.out.println(threeDPrinterObject.getMaterial());
        threeDPrinterObject.setMaterial(powder);

        System.out.println("==========================");

        ThreeDPrinterGeneric<Powder> threeDPrinterGeneric = new ThreeDPrinterGeneric<>();
        threeDPrinterGeneric.setMaterial(powder);
        System.out.println(threeDPrinterGeneric.getMaterial());

        ThreeDPrinterGeneric<Plastic> threeDPrinterGeneric1 = new ThreeDPrinterGeneric<>();
    }
}
