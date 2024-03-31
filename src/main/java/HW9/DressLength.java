package HW9;

public enum DressLength {
    XS, S, M, L, XL, XXL, XXXL;

    DressLength() {String name = name();};
    public String getDressLength() {
        String Length;
        switch (this) {
            case XS:
                Length = "   28";
                break;
            case S:
                Length = "   29 – 30";
                break;
            case M:
                Length = "   31 – 32";
                break;
            case L:
                Length = "   33 – 34";
                break;
            case XL:
                Length = "   35 – 36";
                break;
            case XXL:
                Length = "   37 – 38";
                break;
            case XXXL:
                Length = "   39 – 40";
                break;
            default:
                throw new IllegalStateException("Invalid input: " + this);

        }
        return Length;
    }
    public String toString() {
        return ".    Dress length - " + getDressLength();
    }

}
