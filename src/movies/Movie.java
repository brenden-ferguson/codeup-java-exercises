package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Signs", "horror");
//        movie1.setName("Signs 2");
//        movie1.setCategory("Sci-Fi");
        System.out.printf("Movie 1: %n" + "Name: " + movie1.getName() + "%nCategory: " + movie1.getCategory());

    }
}
