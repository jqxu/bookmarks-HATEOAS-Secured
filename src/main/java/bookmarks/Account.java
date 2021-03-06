package bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Account {

    @OneToMany(mappedBy = "account")
    private Set<Bookmark> bookmarks = new HashSet();
    
    @Id
    @GeneratedValue
    private Long id;
    
    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @JsonIgnore
    public String password;
    public String username;

    public Account(String name, String password) {
        this.username = name;
        this.password = password;
    }

    Account() { 
    }
}
