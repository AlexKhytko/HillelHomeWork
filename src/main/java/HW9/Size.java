package HW9;

//https://sheitesnami.ru/razmernye-tablicy-odezhdy
public enum Size {
    XS, S, M, L, XL, XXL, XXXL;

    Size() {
    }

    ;

    public String getSize() {
        String Size;
        switch (this) {
            case XS:
                Size = "   40 – 42";
                break;
            case S:
                Size = "   42 – 44";
                break;
            case M:
                Size = "   44 – 46";
                break;
            case L:
                Size = "   48 – 50";
                break;
            case XL:
                Size = "   52 – 54";
                break;
            case XXL:
                Size = "   54 – 56";
                break;
            case XXXL:
                Size = "   56 – 58";
                break;


            default:
                throw new IllegalStateException("Invalid input: " + this);

        }

        return Size;


    }
    public String toString() {

        System.out.print("Size of Man     ");
               return super.toString();
    }
}
