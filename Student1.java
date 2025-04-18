import java.io.*;


class Student1 implements Serializable {
    @SuppressWarnings("unused")
    private int id;
    @SuppressWarnings("unused")
    private String name;

    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Serial {
    public static void main(String[] args) {
        try {
            Student1 s1 = new Student1(211, "Yash Ratnaparkhi is a student of Ramdeobaba University Nagpur");
            FileOutputStream fos = new FileOutputStream("student1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close(); 
            fos.close(); 
            System.out.println("Object serialized successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}