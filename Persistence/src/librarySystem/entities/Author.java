package librarySystem.entities;

public class Author  implements Comparable<Author>{
    private String authorFirstName;
    private String authorLastName;

    public Author(String authorFirstName,String authorLastName){
        this.authorFirstName=authorFirstName;
        this.authorLastName=authorLastName;
    }

    @Override
    public int compareTo(Author o) {
        if (this.authorLastName.compareTo(o.authorLastName) !=0){
            return this.authorLastName.compareTo(o.authorLastName);
        }
        else {
            return this.authorFirstName.compareTo(o.authorFirstName);
        }
    }
}
