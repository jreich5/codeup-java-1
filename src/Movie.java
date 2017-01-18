/**
 * Created by JustinReich on 1/17/17.
 */
public class Movie {

    private String title;
    private String category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public  Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }
}
