package alt.user;

import alt.user.model.User;

public class UserAppl {
    public static void main(String[]args){
        User user=new User("john@gma.il.com","1234");
        System.out.println(user);
        user.setEmail("john@gmx.de");
        System.out.println(user);
    }


}
