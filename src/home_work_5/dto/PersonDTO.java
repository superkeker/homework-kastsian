package home_work_5.dto;

public class PersonDTO {
    private final String nick;
    private final String password;
    private final String name;

    public PersonDTO(String nick, String password, String name){
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    public String getNick(){
        return this.nick;
    }
    public String getPassword(){
        return this.password;
    }
    public String getName(){
        return this.name;
    }
}
