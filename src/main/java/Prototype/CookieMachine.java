package Prototype;

/**
 * Created by Hillel9 on 14.08.2017.
 */
public class CookieMachine {

    private Cookie cookie;

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws  CloneNotSupportedException {
        return (Cookie) this.cookie.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cookie tempCookie = null;
        Cookie prot = new CoconutCookie();
        CookieMachine cm = new CookieMachine(prot);
        for (int i = 0; i < 100; i++) tempCookie = cm.makeCookie();

    }

}
