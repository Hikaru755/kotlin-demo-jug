package demo.interop;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JavaPerson {

    @NotNull
    private final String name;

    @Nullable
    private String email;

    public JavaPerson(@NotNull String name) {
        this.name = name;
        this.email = null;
    }

    public JavaPerson(@NotNull String name, @Nullable String email) {
        this.name = name;
        this.email = email;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }
}


class Main {

    public static void main(String[] args) {
        JavaPerson jPerson = new JavaPerson("Max Mustermann");
        KotlinPerson kPerson = new KotlinPerson("Max Mustermann");

        String jName = jPerson.getName();
        String kName = kPerson.getName();

        jPerson.setEmail(jName + "@example.com");
        kPerson.setEmail(kName + "@example.com");

//        jPerson.setName("");
//        kPerson.setName("");
    }
}