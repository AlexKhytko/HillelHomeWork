package HW13;

import org.checkerframework.checker.lock.qual.NewObject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.String;

import static com.google.common.graph.ElementOrder.sorted;
import static java.lang.Character.getName;
import static java.util.stream.Collectors.toList;

public class Main{
     public static void main(String[] args) {


          List<User> userList = Stream.concat(
                  Stream.generate(UserGenerator::generateUser).limit(100).sorted((user1, user2) -> user1.getName().compareTo(user2.getName()))
                  ,Stream.generate(UserGeneratorWoman::generateUserWoman).limit(100).sorted((user1, user2) -> user1.getName().compareTo(user2.getName())))
                  .filter(user -> user.getAge()>18)
                  .filter(user -> user.getEmail() == null)
                  .sorted((user1, user2) -> user1.getName().compareTo(user2.getName()))
                  .toList();

                  System.out.println(userList.toString());


     }

}





