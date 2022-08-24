package home_work_5.dto;

public class AnimalDTO {
    private final int age;
    private final String nick;

    public AnimalDTO(int age, String nick){
        this.age = age;
        this.nick = nick;
    }

    public int getAge(){
        return age;
    }
    public String getNick(){
        return nick;
    }
}
