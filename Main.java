import java.io.Serializable;

class User implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    private transient String password;

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\''  +
                ", password=" + password +
                '}';
    }
}
