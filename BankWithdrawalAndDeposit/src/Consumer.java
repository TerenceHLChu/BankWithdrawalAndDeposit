/*
Student Name: Terence Chu
Student ID: 301220117
*/

public class Consumer {
    private String id;
    private String name;

    public Consumer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID : " + this.id + " Name : " + this.name;
    }
}
