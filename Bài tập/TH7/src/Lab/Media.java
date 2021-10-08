package Lab;

public abstract class Media{
    // Không được dùng New để tạo

    private String title;
    private String category;
    private float cost;

    public Media(String title, String category, float cost){
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media() {

    }

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

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
