package J25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String4 {
    public static void main(String[] args) {


        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER"; //ROLE - free fixed  , 뒤에 sub fixed
        String[] roleArray =  roleString.split(",");


        List<String> roleList = Arrays.asList(roleArray);
        List<String> validRoleList = new ArrayList<String>();
        List<String> validRoleList2 = new ArrayList<String>();

        roleList.forEach(role -> {
            if(role.startsWith("ROLE")){//startsWith 얘가 앞에 있니 없니 확인(boolean)
                validRoleList.add(role);

            }
        });

        System.out.println(validRoleList);

        roleList.forEach(role -> {
            if(role.endsWith("MANAGER") || role.endsWith("ADMIN")){
                validRoleList2.add(role);
            }
        });

        System.out.println(validRoleList2);
    }
}
