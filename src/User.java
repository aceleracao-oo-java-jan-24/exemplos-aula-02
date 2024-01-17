public class User {
    // Parâmetros da classe privados
    private String name;
    private String email;
    private String cpf;


    // Construtor vazio
    public User() {}

    // Construtor com tudo
    public User(String name, String email, String cpf) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }

    // Getters e setters para pegar/alterar valores privados
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0) {
            return;
        }
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email.length() == 0 || !email.contains("@")) {
            return;
        }
        this.email = email;
    }

    public String getCpf() {
        return this.cpf;
    }

    // Optei por não fazer o setCpf porque não quero que o CPF mude
}
