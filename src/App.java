public class App {
    public static void main(String[] args) {

        // Criando receita com o primeiro construtor (vazio) e preenchendo o objeto depois
        Recipe receita = new Recipe();
        receita.title = "Bolo de Chocolate";
        receita.prepTime = 120;
        receita.ingredients = "Bolo e chocolate";
        receita.vegetarian = true;
        System.out.println(receita.title);
        receita.prepare(); // chamando o método prepare



        // Criando receita com o segundo construtor, que recebe o objeto de usuário pronto
        User user = new User("Let", "let@let.com", "123.456.789-10");
        Recipe receita2 = new Recipe("Bolo de Chocolate", "Bolo e cenoura", 100, true, user);
        // receita.price = 30; => não funciona, pois não declarei o price na classe
        System.out.println(receita2.title);

        

        // Criando receita com o terceiro construtor, passando dados do user separados
        Recipe receita3 = new Recipe("Bolo de Chocolate", "Bolo e cenoura", 100, true, "Tiago", "ti@ti.com", "111.111.111-11");
        System.out.println(receita3.author.getName());

        

        // Criando um usuário
        User newUser = new User("Let", "let@let.com", "123.456.789-10");
        // newUser.cpf = "batatinha quando nasce"; => não quero permitir isso!

        newUser.setEmail("Letícia"); // como meu setEmail valida, não permitirá essa string que não é email
        System.out.println(newUser.getEmail()); // pegar e-mail com getEmail()
    }
}

