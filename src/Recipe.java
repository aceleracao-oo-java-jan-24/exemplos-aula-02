public class Recipe {
    String title;
    String ingredients;
    int prepTime;
    boolean vegetarian;
    User author;

    // Construtor vazio
    Recipe() {
    }

    // Construtor com parâmetros + usuário já instanciado
    Recipe(String title, String ingredients, int prepTime, boolean vegetarian, User user) {
        this.title = title;
        this.ingredients = ingredients;
        this.prepTime = prepTime;
        this.vegetarian = vegetarian;
        this.author = user;
    }

    // Construtor com parâmetros + elementos necessários para criar o usuário
    Recipe(String title, String ingredients, int prepTime, boolean vegetarian, String authorName, String authorCpf,
            String authorEmail) {
        this.title = title;
        this.ingredients = ingredients;
        this.prepTime = prepTime;
        this.vegetarian = vegetarian;
        this.author = new User(authorName, authorEmail, authorCpf); // criação do usuário
    }

    // Método público, pode ser acessado por outras classes
    public void prepare() {
        System.out.println("Estou preparando " + this.title);
    }
}
