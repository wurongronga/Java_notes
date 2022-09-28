package practice;
import java.util.*;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> male = new ArrayList<String>();
        male.add("周润发");
        male.add("周星驰");
        male.add("成龙");
        male.add("李连杰");
        male.add("吴京");
        male.add("刘德华");
        male.add("吴孟达");

        ArrayList<String> female = new ArrayList<String>();
        female.add("林心如");
        female.add("张曼玉");
        female.add("林青霞");
        female.add("柳岩");
        female.add("林志玲");
        female.add("王祖贤");
        female.add("迪丽热巴");

        Stream<String> maleList = male.stream().filter(name -> name.length()==3);
        Stream<String> femaleList = female.stream().filter(name -> name.startsWith("林")).skip(1);
        Stream<String> actorList = Stream.concat(maleList,femaleList);
        actorList.map(Actor::new).forEach(a -> System.out.println(a.getName()));


    }
}