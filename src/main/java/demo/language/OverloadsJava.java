package demo.language;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OverloadsJava {

    public void query(@NotNull String from) {
        query("*", from);
    }

    public void query(@NotNull String select, @NotNull String from) {
        query(select, from, null);
    }

    public void query(@NotNull String select, @NotNull String from, @Nullable String where
    ) {
        query(select, from, where, null);
    }

    public void query(@NotNull String select, @NotNull String from, @Nullable String where, @Nullable String groupBy) {
        query(select, from, where, groupBy, null);
    }

    public void query(
        @NotNull String select,
        @NotNull String from,
        @Nullable String where,
        @Nullable String groupBy,
        @Nullable String orderBy
    ) {
        String query = Stream.of(select, from, where, groupBy, orderBy)
            .map(it -> it != null ? it : "_")
            .collect(Collectors.joining(";"));
        System.out.println(query);
    }


    public static void main(String[] args) {
        OverloadsJava overloads = new OverloadsJava();
        overloads.query("users");
        overloads.query("name", "users");
        overloads.query("name", "users", null, null, "name asc");
    }
}
