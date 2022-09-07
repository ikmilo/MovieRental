
package beans;


public class Usuarios {
    
    private String password, name, lastname, email ;
    private int username;
    private double saldo;
    private boolean premium;

    public Usuarios(String password, String name, String lastname, String email, int username, double saldo, boolean premium) {
        this.password = password;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.username = username;
        this.saldo = saldo;
        this.premium = premium;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "password=" + password + ", name=" + name + ", lastname=" + lastname + ", email=" + email + ", username=" + username + ", saldo=" + saldo + ", premium=" + premium + '}';
    }
    
    
}
