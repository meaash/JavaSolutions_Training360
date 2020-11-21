package typeconversion.whichtype;

import java.util.ArrayList;
import java.util.List;

public class WhichType {
   public List<Type> whichType(String s){
       List<Type> TypeList = new ArrayList<>();
       long mylong = Long.parseLong(s);

       for (Type type: Type.values())
       {
           if(mylong <= type.getMaxLongValue() && mylong >= type.getMinLongValue()){
               TypeList.add(type);
           }
       }

       return TypeList;

    }

}
