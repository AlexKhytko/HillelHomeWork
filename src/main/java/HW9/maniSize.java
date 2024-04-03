package HW9;

import HW9.sizeBase.DressLength;
import HW9.sizeBase.Size;
import HW9.sizeBase.SizeWoman;
import HW9.sizeBase.WaistSize;

public class maniSize {
    public static void main(String[] args) {
        System.out.println(SizeWoman.L.toString() + DressLength.L);
        System.out.println(Size.L.toString() + DressLength.L + WaistSize.L);
        System.out.println(SizeWoman.XXXL.toString() + DressLength.XXXL);
        System.out.println(Size.XS.toString() + DressLength.XS + WaistSize.XS);
        System.out.println(SizeWoman.XL.toString() + DressLength.XL);
    }
}
