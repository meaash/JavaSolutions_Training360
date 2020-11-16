package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    private List<Member> members = new ArrayList<>();

    public void addMember(String name) {
        members.add(new Member(name));
    }

    public void connect(String name, String othername) {
        finByName(name).connectMember(finByName(othername));
    }

    private Member finByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public List<String> bidirectionalConnections() {
        List<String> result = new ArrayList<>();
        for (Member member : members) {
            for (Member connection : member.getConnections()) {
                if (connection.getConnections().contains(member)) {
                    result.add(member.getName() + " - " + connection.getName());
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "SocialNetwork{" +
                "members=" + members.toString() +
                '}';
    }
}
