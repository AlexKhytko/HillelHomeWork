package HW8;

public enum  MonthOfYear {
    JAN,   FEB,   MAR,  APR,    MAY,   JUN,
    JUL,  AUG,    SEP,   NOV,    OCT,   DEC;
    public String getSeason() {
        String season;
        switch (this) {
            case DEC:
            case JAN:
            case FEB:
                season = SeasonOtYear.WINTER.getName();
                break;
            case MAR:
            case APR:
            case MAY:
                season = SeasonOtYear.SPRING.getName();
                break;
            case JUN:
            case JUL:
            case AUG:
                season = SeasonOtYear.SUMMER.getName();
                break;
            case SEP:
            case OCT:
            case NOV:
                season = SeasonOtYear.AUTUMN.getName();
                break;
            default:
                throw new IllegalStateException("Invalid input: " + this);
        }

        return season;
    }
}


