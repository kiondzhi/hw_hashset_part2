import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Красный" );
        set1.add("Зеленый" );
        set1.add("Синий" );

        HashSet<String> set2 = new HashSet<>();
        set2.add("Синий" );
        set2.add("Желтый" );
        set2.add("Красный" );

        HashSet<String> commonColors = new HashSet<>(findCommon(set1, set2));
        System.out.println("Общие цвета: " + commonColors);
    }

    public static HashSet<String> findCommon(HashSet<String> set1, HashSet<String> set2){
        HashSet<String> commonSet = new HashSet<>(set1);
        commonSet.retainAll(set2);
        return commonSet;
    }
}