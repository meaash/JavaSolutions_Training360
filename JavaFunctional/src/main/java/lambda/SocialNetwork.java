package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SocialNetwork {

    private List<Member> memberList;

    public SocialNetwork(List<Member> memberList) {
        this.memberList = memberList;
    }

    public List<Member> findMembersBy(Predicate<Member> predicate){
        List<Member> orderedList = new ArrayList<>(memberList);

        return orderedList.stream()
                .filter(predicate).collect(Collectors.toList());
    }


    public void applyToSelectedMembers(Predicate<Member> predicate, Consumer<Member> consumer){
        List<Member> orderedList = new ArrayList<>(memberList);

        orderedList.stream()
                .filter(predicate)
                .collect(Collectors.toList())
                .forEach(consumer);
    }

    public   <T> List<T> transformMembers(Function<Member, T> function){
        List<Member> orderedList = new ArrayList<>(memberList);
       return orderedList.stream().map(function)
                .collect(Collectors.toList());


    }
}
