package org.example.streams;

import java.util.Objects;
import java.util.StringJoiner;

public final class Argument {

    private final String name;

    private final Object value;

    private final Class<?> type;

    public Argument(String name, Object value, Class<?> type) {
        this.name = Objects.requireNonNull(name, "'name' must not be null");
        this.value = Objects.requireNonNull(value, "'value' must not be null");
        this.type = Objects.requireNonNull(type, "'type' must not be null");

        if (name.startsWith("-")) {
            throw new IllegalArgumentException("'name' must start with an alphanumeric character");
        }
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public Class<?> getType() {
        return type;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Argument.class.getSimpleName() + "[", "]")
            .add("name='" + name + "'")
            .add("value=" + value)
            .add("type=" + type)
            .toString();
    }
}
