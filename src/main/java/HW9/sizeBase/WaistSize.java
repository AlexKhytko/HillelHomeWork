package HW9.sizeBase;

public enum WaistSize {
    XS, S, M, L, XL, XXL, XXXL;

    WaistSize() {String name = name();};
    public String getWaistSize() {
        String Waist;
        switch (this) {
            case XS:
                Waist = "   71.1";
                break;
            case S:
                Waist = "   73.7 – 76.2";
                break;
            case M:
                Waist = "   76.2 – 78.7";
                break;
            case L:
                Waist = "   78.7 - 81.3";
                break;
            case XL:
                Waist = "   83.8 – 88.9";
                break;
            case XXL:
                Waist = "   91.4 - 94";
                break;
            case XXXL:
                Waist = "   96.5 - 101.6";
                break;
            default:
                throw new IllegalStateException("Invalid input: " + this);

        }
        return Waist;
    }
    public String toString() {
        return ".    WaistSize - " + getWaistSize();
    }

}

