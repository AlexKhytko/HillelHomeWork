package HW9.sizeBase;

public enum SizeWoman{
    XS,S, M, L, XL, XXL, XXXL;
    SizeWoman() {String name = name();};
    String SizeWo;
    public String getSizeWoman() {
        String SizeWoman;
           switch (this) {
            case XS:
                SizeWoman = "   38 - 40";
                SizeWo =  "   38 - 40";
                break;
            case S:
                SizeWoman = "   42 – 44";
                break;
            case M:
                SizeWoman = "   44 – 46";
                break;
            case L:
                SizeWoman = "   46 - 48";
                break;
            case XL:
                SizeWoman = "   50 – 52";
                break;
            case XXL:
                SizeWoman = "   52 – 54";
                break;
            case XXXL:
                SizeWoman = "   56 – 58";
                break;
            default:
                throw new IllegalStateException("Invalid input: " + this);
        }
        return SizeWoman;
    }
    public String toString() {
        return "Women size  : International - " + name() + ";   UA = "  + getSizeWoman();
    }
}
