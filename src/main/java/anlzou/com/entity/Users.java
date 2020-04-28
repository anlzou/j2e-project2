/**
 * @author anlzou
 * @date 2020/4/28 20:14
 * @version xx
 * @description xx
 */

package anlzou.com.entity;

public class Users {
    private  Long id;
    private String name;
    private String pass;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "users{id="+id+",name="+name+",pass="+pass+"}";
    }
}
