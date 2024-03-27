package HW8;

import HW8.action.Swim;

public abstract class Fish implements Swim {
    protected String name;

    Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void swimming() {
System.out.println("Buoys....Splash!");
    }
}
//
//public class Pike {
//        public String pike;
//    Pike() {
//    };
//   public static String getPike() {
//        return "pike"; }
//}
//  public class Carp {
//        public String carp;
//        Carp() {
//        };
//
//        public static String getCarp() {
//            return "carp";
//        }
//    }
//
//    public class Catfish {
//        public String catfish;
//
//        Catfish() {
//        }
//
//        ;
//
//        public static String getCatfish() {
//            return "catfish";
//        }




