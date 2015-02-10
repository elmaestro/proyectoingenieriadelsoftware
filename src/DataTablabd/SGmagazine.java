package DataTablabd;

public class SGmagazine {
    int id;
    String title;
    String editorial;
    Double price;
    int quanty;
    
    public SGmagazine(){
    }

    public SGmagazine(int id, String title, String editorial, Double price, int quanty) {
        this.id = id;
        this.title = title;
        this.editorial = editorial;
        this.price = price;
        this.quanty = quanty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuanty() {
        return quanty;
    }

    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }
      
}
