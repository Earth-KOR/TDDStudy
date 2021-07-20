package hello.game.Enum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public enum MemberShip {
    NORMAR,
    VIP;

    public static boolean isInclude(Set<MemberShip> includes, MemberShip type){
        if(includes == null){
            return false;
        }
        if(includes.contains(type)){
            return true;
        }
        return false;
    }

    public static boolean isInclude(MemberShip[] includes, MemberShip type){
        if(includes == null){
            return false;
        }
        if(getIncludeSet(includes).contains(type)){
            return true;
        }
        return false;
    }

    public static Set<MemberShip> getIncludeSet(MemberShip[] includes){
        if(includes == null){
            return new HashSet<MemberShip>();
        }
        return Arrays.stream(includes).collect(Collectors.toSet());
    }
}
