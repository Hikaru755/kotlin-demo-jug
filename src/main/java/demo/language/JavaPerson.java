package demo.language;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class JavaPerson {

    @NotNull
    private final String vorname;
    @NotNull
    private final String nachname;
    @Nullable
    private String email;

    public JavaPerson(@NotNull String vorname, @NotNull String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = null;
    }

    public JavaPerson(@NotNull String vorname, @NotNull String nachname, @Nullable String email) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
    }

    @NotNull
    public String getVorname() {
        return vorname;
    }

    @NotNull
    public String getNachname() {
        return nachname;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaPerson that = (JavaPerson) o;
        return Objects.equals(vorname, that.vorname) &&
            Objects.equals(nachname, that.nachname) &&
            Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname, email);
    }

    @Override
    public String toString() {
        return "JavaPerson{" +
            "vorname='" + vorname + '\'' +
            ", nachname='" + nachname + '\'' +
            ", email='" + email + '\'' +
            '}';
    }
}
